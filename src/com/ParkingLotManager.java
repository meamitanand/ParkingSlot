package com;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ParkingLotManager
{
    public static Map<String, Vehicle> fir_map;
    public static Map<String, String> sec_map;
    public static Map<String, ArrayList<String>> hir_map;
    public static ArrayList<Integer> present_slots;
    int size_slot;
    public void createParkingLot(String size_slot) throws ExceptionParking
    {

        ParkingLot parkingLot=new ParkingLot(Integer.parseInt(size_slot));



        try
        {
            this.size_slot=Integer.parseInt(size_slot);
        }
        catch (Exception e)
        {
            throw new ExceptionParking(e.getMessage(),e);
        }


        this.present_slots=new ArrayList<Integer>(){};
        for(int i=1;i<=this.size_slot;i++)
        {
            present_slots.add(i);
        }
        this.fir_map=new HashMap<String, Vehicle>();
        this.sec_map=new HashMap<String,String>();
        this.hir_map=new HashMap<String,ArrayList<String>>();
        System.out.println("Created a parking lot with "+ Integer.toString(this.size_slot)+" slots");
    }
    public void park(String reg_no,String color) throws ExceptionParking
    {

        if(this.fir_map.size()==this.size_slot)
        {
            System.out.println("Sorry,parking lot is full"+fir_map+size_slot);
        }
        else {


            Collections.sort(present_slots);
            String slot = present_slots.get(0).toString();
            Vehicle vehicle = new Vehicle(reg_no, color);
            this.fir_map.put(slot, vehicle);
            this.sec_map.put(reg_no, slot);
            if (this.hir_map.containsKey(color)) {
                ArrayList<String> reg_no_list = this.hir_map.get(color);
                this.hir_map.remove(color);
                reg_no_list.add(reg_no);
                this.hir_map.put(color, reg_no_list);
            } else {
                ArrayList<String> reg_no_list = new ArrayList<String>();
                reg_no_list.add(reg_no);
                this.hir_map.put(color, reg_no_list);
            }
            System.out.println("Allocated slot number: " + slot);
            present_slots.remove(0);
        }
    }
    public void leave(String leave_slot) throws ExceptionParking
    {
        if(this.size_slot==0)
        {
            System.out.println("parking is not available");
        }
        try
        //else if(this.fir_map.size()>0)
        {


            Vehicle leave_car=this.fir_map.get(leave_slot);
            this.fir_map.remove(leave_slot);
            this.sec_map.remove(leave_car.reg_no);
            ArrayList<String> reg_no_list =this.hir_map.get(leave_car.color);
            if(reg_no_list.contains(leave_car.reg_no))
            {
                reg_no_list.remove(leave_car.reg_no);
            }
            this.present_slots.add(Integer.parseInt(leave_slot));
            System.out.println("Slot Number "+leave_slot+" is free");




        }
        catch(Exception e)
        {
            throw new ExceptionParking(leave_slot,e.getMessage());
            //System.out.println("this slot is already empty");
        }
    }
    public void status() throws ExceptionParking
    {
        //System.out.println("Slot No."+" "+"Registration No"+" "+" Color");
       /* if(this.size_slot==0)
        {
            System.out.println("parking lot is not created");
        }*/
        try
        {
            System.out.println("Slot No."+" "+"Registration No"+" "+" Color");
            Vehicle vehicle;
            for(int i=1;i<=this.size_slot;i++)
            {
                String key=Integer.toString(i);
                if(this.fir_map.containsKey(key))
                {
                    vehicle=this.fir_map.get(key);
                    System.out.println(i+"\t"+vehicle.reg_no+"\t"+vehicle.color);
                }
            }
        }
        catch(Exception e)
        {
            throw new ExceptionParking();
        }
    }
    public void regFromColor(String color) throws ExceptionParking
    {
        //if(this.hir_map.containsKey(color))
        try
        {
            ArrayList<String> reg_no_list=this.hir_map.get(color);
            for(int i=0;i<reg_no_list.size();i++)
            {
                System.out.println(reg_no_list.get(i)+" ");
            }
        }
        catch(Exception e)
        {
            throw new ExceptionParking(color);
        }
    }
    public void slotFromColor(String color)
    {
        if(this.hir_map.containsKey(color))
        {
            ArrayList<String> reg_no_list=this.hir_map.get(color);
            ArrayList<Integer> slot_list=new ArrayList<Integer>();
            for(int i=0;i<reg_no_list.size();i++)
            {
                slot_list.add(Integer.valueOf(this.sec_map.get(reg_no_list.get(i))));
            }
            Collections.sort(slot_list);
            for(int j=0;j<slot_list.size();j++)
            {
                System.out.println(slot_list.get(j)+" ");
            }

        }
        else
        {
            System.out.println("Not found");
        }

    }

    public void slotFromReg(String reg_no)
    {
        if(this.sec_map.containsKey(reg_no))
        {
            System.out.println(this.sec_map.get(reg_no));
        }
        else
        {
            System.out.println("Not found");
        }
    }

}
