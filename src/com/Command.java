package com;

public class Command
{
    private String input;
    private String[] arguments;
    private ParkingLotManager parkingLotManager;
    public Command(String input, String[] arguments,ParkingLotManager parkingLotManager) {
        this.input = input;
        this.arguments = arguments;
        this.parkingLotManager=parkingLotManager;
    }
    public ParkingLotManager getParkingLotManager() {
        return parkingLotManager;
    }

    public void setParkingLotManager(ParkingLotManager parkingLotManager) {
        this.parkingLotManager = parkingLotManager;
    }



    public String getInput() {
        return input;
    }

    public String[] getArguments() {
        return arguments;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setArguments(String[] arguments) {
        this.arguments = arguments;
    }
}
