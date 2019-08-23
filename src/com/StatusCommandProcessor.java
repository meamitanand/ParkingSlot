package com;

public class StatusCommandProcessor implements CommandProcessor
{
    ParkingLotManager parkingLotManager;

    public StatusCommandProcessor(ParkingLotManager parkingLotManager) {
        this.parkingLotManager = parkingLotManager;
    }

    public ParkingLotManager getParkingLotManager() {
        return parkingLotManager;
    }

    public void setParkingLotManager(ParkingLotManager parkingLotManager) {
        this.parkingLotManager = parkingLotManager;
    }

    public void process() throws ExceptionParking {
        //ParkingLotManager parkingLotManager=new ParkingLotManager();
        this.parkingLotManager.status();
    }
}
