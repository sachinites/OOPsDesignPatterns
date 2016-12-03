class BedRoom implements HomeEntities{
    private Light_Enum BedRoom_light;
    private Door_Enum BedRoom_door;
    private Fan_Enum exhaust_fan;
    private Computer_Enum pc_status;
    private TV_Enum BedRoom_tv;

    BedRoom(){
        this.BedRoom_light = Light_Enum.LIGHTS_OFF;
        this.BedRoom_door = Door_Enum.DOOR_SHUT;
        this.exhaust_fan = Fan_Enum.FAN_SWITCHED_OFF;
        this.pc_status = Computer_Enum.COMP_POWERED_OFF;
    }

    public String getClassName(){
        return "BedRoom";
    }
    public void setBedRoomLights(Light_Enum BedRoom_light){
        this.BedRoom_light = BedRoom_light;
        System.out.println("BedRoom TV set to " +  this.BedRoom_tv);
    }

    public void setBedRoomTV(TV_Enum BedRoom_tv){
        this.BedRoom_tv = BedRoom_tv;
        System.out.println("BedRoom Lights set to " +  this.BedRoom_light);
    }

    public void setBedRoomDoor(Door_Enum BedRoom_door){
        this.BedRoom_door = BedRoom_door;
        System.out.println("BedRoom Doors set to " +  this.BedRoom_door);
    }

    public void setBedRoomExhaustFan(Fan_Enum exhaust_fan){
        this.exhaust_fan = exhaust_fan;
        System.out.println("BedRoom fan set to " +  this.exhaust_fan);
    }

    public void setBedRoomComputer(Computer_Enum pc_status){
        this.pc_status = pc_status;
        System.out.println("BedRoom Computer set to " +  this.pc_status);
    }

    public void printHomeEntityStatus(){
        System.out.println("BedRoom Lights set to " +  this.BedRoom_light);
        System.out.println("BedRoom Doors set to " +  this.BedRoom_door);
        System.out.println("BedRoom fan set to " +  this.exhaust_fan);
        System.out.println("BedRoom TV set to " +  this.BedRoom_tv);
        System.out.println("BedRoom Computer set to " +  this.pc_status);
    }

    public void execute(HomeApplianceAction action){
        if(action instanceof Light_Enum){
            setBedRoomLights((Light_Enum)action);
        }
        else if(action instanceof Door_Enum){
            setBedRoomDoor((Door_Enum)action);
        }
        else if(action instanceof Fan_Enum){
            setBedRoomExhaustFan((Fan_Enum)action);
        }
        else if(action instanceof Computer_Enum){
            setBedRoomComputer((Computer_Enum)action);
        }
        else if(action instanceof TV_Enum){
            setBedRoomTV((TV_Enum)action);
        }
        else{
            System.out.println("Invalid action performed on BedRoom Appliance");
        }
    }
}
