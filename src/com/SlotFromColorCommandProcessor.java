package com;

public class SlotFromColorCommandProcessor implements CommandProcessor
{
    private String color=new String();
    private ParkingLotManager parkingLotManager;
    public SlotFromColorCommandProcessor(String color,ParkingLotManager parkingLotManager) {
        this.color = color;
        this.parkingLotManager=parkingLotManager;
    }

    public ParkingLotManager getParkingLotManager() {
        return parkingLotManager;
    }

    public void setParkingLotManager(ParkingLotManager parkingLotManager) {
        this.parkingLotManager = parkingLotManager;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void process()
    {
        //ParkingLotManager parkingLotManager=new ParkingLotManager();
        this.parkingLotManager.slotFromColor(getColor());
    }
}
