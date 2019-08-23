package com;

public class LeaveCommandProcessor implements CommandProcessor
{
    private String leaveSlot=new String();
    private ParkingLotManager parkingLotManager;
    public LeaveCommandProcessor(String leaveSlot,ParkingLotManager parkingLotManager)
    {
        this.leaveSlot = leaveSlot;
        this.parkingLotManager=parkingLotManager;
    }

    public ParkingLotManager getParkingLotManager() {
        return parkingLotManager;
    }

    public void setParkingLotManager(ParkingLotManager parkingLotManager) {
        this.parkingLotManager = parkingLotManager;
    }

    public String getLeaveSlot()
    {
        return leaveSlot;
    }

    public void setLeaveSlot(String leaveSlot)
    {
        this.leaveSlot = leaveSlot;
    }
    public void process() throws ExceptionParking {
        //ParkingLotManager parkingLotManager=new ParkingLotManager();
        this.parkingLotManager.leave(getLeaveSlot());
    }
}
