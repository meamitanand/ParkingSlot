package com;

public class CreateParkingLotCommandProcessor implements CommandProcessor
{
    private String size_slot=new String();
    ParkingLotManager parkingLotManager;
    public CreateParkingLotCommandProcessor(String size_slot,ParkingLotManager parkingLotManager)
    {
        this.size_slot = size_slot;
        this.parkingLotManager=parkingLotManager;
    }

    public String getSize_slot()
    {
        return size_slot;
    }

    public void setSize_slot(String size_slot)
    {
        this.size_slot = size_slot;
    }
    public void process() throws ExceptionParking
    {
        //ParkingLotManager parkingLotManager=new ParkingLotManager();
        this.parkingLotManager.createParkingLot(getSize_slot());
    }
}
