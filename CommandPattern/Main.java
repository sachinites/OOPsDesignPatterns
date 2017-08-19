/*
 +-------------------------------------------------------------------------+
 |  Command Pattern : conrolling the multiple objects to change their state|
 |  on issuing a command to them from a single controller                  |
 +-------------------------------------------------------------------------+
*/                                                                         

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
        kitchen.printHomeEntityStatus();
        bedRoom.printHomeEntityStatus();
        controller.printOperationSequence();
    }
}
