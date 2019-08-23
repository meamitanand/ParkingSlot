package com;

public class SlotFromRegCommandProcessor implements CommandProcessor
{
    private String regNo=new String();
    private ParkingLotManager parkingLotManager;

    public SlotFromRegCommandProcessor(String regNo,ParkingLotManager parkingLotManager)
    {
        this.regNo = regNo;
        this.parkingLotManager=parkingLotManager;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    public void process()
    {
        //ParkingLotManager parkingLotManager=new ParkingLotManager();
        this.parkingLotManager.slotFromReg(getRegNo());
    }
}
