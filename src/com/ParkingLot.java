package com;

public class ParkingLot
{
    private int capacity;
    private Vehicle[] slots;

    public ParkingLot(int capacity)
    {
        this.capacity = capacity;
        this.slots = new Vehicle[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Vehicle[] getSlots() {
        return slots;
    }

    public void setSlots(Vehicle[] slots) {
        this.slots = slots;
    }
}
