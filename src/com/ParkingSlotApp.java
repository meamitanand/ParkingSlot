package com;

import java.io.*;
import java.util.*;
public class ParkingSlotApp
{
    public static void main(String args[]) throws Exception
    {
        InputCommandProcessorFactory factory=new InputCommandProcessorFactory();
        ParkingLotManager parkingLotManager=new ParkingLotManager();
        File file=new File("testing.txt");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine())
        {
            String input=new String();
            input=sc.nextLine();
            String [] arguments=input.split(" ");
            Command command = new Command(input,arguments,parkingLotManager);
            CommandProcessor commandProcessor=factory.getCommandProcessor(command.getArguments(),parkingLotManager);
            commandProcessor.process();

        }
    }

}

