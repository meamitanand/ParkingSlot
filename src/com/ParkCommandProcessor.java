package com;

public class ParkCommandProcessor implements CommandProcessor
{
    private String regNo=new String();
    private String color=new String();
    private ParkingLotManager parkingLotManager;
    public ParkCommandProcessor(String regNo, String color,ParkingLotManager parkingLotManager)
    {
        this.regNo = regNo;
        this.color = color;
        this.parkingLotManager=parkingLotManager;
    }

    public ParkingLotManager getParkingLotManager() {
        return parkingLotManager;
    }

    public void setParkingLotManager(ParkingLotManager parkingLotManager) {
        this.parkingLotManager = parkingLotManager;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void process() throws ExceptionParking {
        //ParkingLotManager parkingLotManager=new ParkingLotManager();
        this.parkingLotManager.park(getRegNo(),getColor());
    }
}
