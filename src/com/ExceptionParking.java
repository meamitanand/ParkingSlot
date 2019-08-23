package com;

public class ExceptionParking extends Exception
{
    public ExceptionParking(String e, Exception ex) {
        System.out.println(e);
        ex.printStackTrace();
    }

    public ExceptionParking(String message, String exception_message)
    {
        System.out.println("This slot is already empty"+message+"Exception is "+ exception_message);
    }

    public ExceptionParking()
    {
        System.out.println("Parking slots are not created");
    }

    public ExceptionParking(String color) {
        System.out.println("This"+color+"is not found");
    }
}
