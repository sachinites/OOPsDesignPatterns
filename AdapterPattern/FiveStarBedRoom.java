class FiveStarBedRoom implements HotelEntities{
    private Light_Enum fiveStarBedRoom_light;
    private Door_Enum fiveStarBedRoom_door;
    private Fan_Enum fiveStarBedRoom_exhaust_fan;
    private Computer_Enum pc_status;
    private TV_Enum fiveStarBedRoom_tv;

    FiveStarBedRoom(){
        this.fiveStarBedRoom_light = Light_Enum.LIGHTS_OFF;
        this.fiveStarBedRoom_door = Door_Enum.DOOR_SHUT;
        this.fiveStarBedRoom_exhaust_fan = Fan_Enum.FAN_SWITCHED_OFF;
        this.pc_status = Computer_Enum.COMP_POWERED_OFF;
        this.fiveStarBedRoom_tv = TV_Enum.TV_POWERED_OFF;
    }

    public String getClassName(){
        return "FiveStarBedRoom";
    }
    public void setFiveStarBedRoomLights(Light_Enum BedRoom_light){
        this.fiveStarBedRoom_light = BedRoom_light;
        System.out.println("FiveStarBedRoom Lights set to " +  this.fiveStarBedRoom_light);
    }

    public void setFiveStarBedRoomTV(TV_Enum BedRoom_tv){
        this.fiveStarBedRoom_tv = BedRoom_tv;
        System.out.println("FiveStarBedRoom TV set to " +  this.fiveStarBedRoom_tv);
    }

    public void setFiveStarBedRoomDoor(Door_Enum BedRoom_door){
        this.fiveStarBedRoom_door = BedRoom_door;
        System.out.println("FiveStarBedRoom Doors set to " +  this.fiveStarBedRoom_door);
    }

    public void setFiveStarBedRoomExhaustFan(Fan_Enum exhaust_fan){
        this.fiveStarBedRoom_exhaust_fan = exhaust_fan;
        System.out.println("FiveStarBedRoom fan set to " +  this.fiveStarBedRoom_exhaust_fan);
    }

    public void setFiveStarBedRoomComputer(Computer_Enum pc_status){
        this.pc_status = pc_status;
        System.out.println("FiveStarBedRoom Computer set to " +  this.pc_status);
    }

    public void printEntityStatus(){
        System.out.println("FiveStarBedRoom Lights set to " +  this.fiveStarBedRoom_light);
        System.out.println("FiveStarBedRoom Doors set to " +  this.fiveStarBedRoom_door);
        System.out.println("FiveStarBedRoom fan set to " +  this.fiveStarBedRoom_exhaust_fan);
        System.out.println("FiveStarBedRoom TV set to " +  this.fiveStarBedRoom_tv);
        System.out.println("FiveStarBedRoom Computer set to " +  this.pc_status);
    }

    public void execute(HomeApplianceAction action){
        if(action instanceof Light_Enum){
            setFiveStarBedRoomLights((Light_Enum)action);
        }
        else if(action instanceof Door_Enum){
            setFiveStarBedRoomDoor((Door_Enum)action);
        }
        else if(action instanceof Fan_Enum){
            setFiveStarBedRoomExhaustFan((Fan_Enum)action);
        }
        else if(action instanceof Computer_Enum){
            setFiveStarBedRoomComputer((Computer_Enum)action);
        }
        else if(action instanceof TV_Enum){
            setFiveStarBedRoomTV((TV_Enum)action);
        }
        else{
            System.out.println("Invalid action performed on FiveStarBedRoom Appliance");
        }
    }
}
