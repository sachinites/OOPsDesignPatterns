class Main{
    public static void main(String args[]){
        Controller controller = new Controller();
        Kitchen kitchen = new Kitchen();
        BedRoom bedRoom = new BedRoom();
        controller.performAction(kitchen, Light_Enum.LIGHTS_DIM);
        controller.performAction(kitchen, Door_Enum.DOOR_OPEN);
        controller.performAction(bedRoom, Door_Enum.DOOR_OPEN);
        controller.performAction(bedRoom, Computer_Enum.COMP_POWERED_ON);
        controller.performAction(bedRoom, TV_Enum.TV_STANDBY);
        kitchen.printEntityStatus();
        bedRoom.printEntityStatus();
        controller.printOperationSequence();


        /*Using the Adopter class*/

        HomeEntities adapterObj = new Adapter(new FiveStarBedRoom());
        controller.performAction(adapterObj, Fan_Enum.FAN_HIGH);
        controller.performAction(adapterObj, Fan_Enum.FAN_MEDIUM);
        adapterObj.printEntityStatus();

        controller.printOperationSequence();

        
    }
}
