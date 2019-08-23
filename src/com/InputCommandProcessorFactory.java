package com;

public class InputCommandProcessorFactory
{
    public CommandProcessor getCommandProcessor(String [] arguments,ParkingLotManager parkingLotManager)
    {
        //ParkingLotManager parkingLotManager=new ParkingLotManager();
        String key=arguments[0];
        switch (key)
            {
                case "create_parking_lot":
                    return new CreateParkingLotCommandProcessor(arguments[1],parkingLotManager);


                case "park":
                    return new ParkCommandProcessor(arguments[1],arguments[2],parkingLotManager);


                case "leave":
                    return new LeaveCommandProcessor(arguments[1],parkingLotManager);


                case "status":
                    return new StatusCommandProcessor(parkingLotManager);

                case "registration_numbers_for_cars_with_colour":
                    return new RegFromColorCommandProcessor(arguments[1],parkingLotManager);


                case "slot_number_for_registration_number":
                    return new SlotFromRegCommandProcessor(arguments[1],parkingLotManager);


                case "slot_numbers_for_cars_with_colour":
                    return new SlotFromColorCommandProcessor(arguments[1],parkingLotManager);

            }
            return null;
    }
}
