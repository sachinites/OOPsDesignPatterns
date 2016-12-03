class FiveStarKitchen implements HotelEntities{
    private Light_Enum kitchen_light;
    private Door_Enum kitchen_door;
    private Fan_Enum exhaust_fan;

    FiveStarKitchen(){
        this.kitchen_light = Light_Enum.LIGHTS_OFF;
        this.kitchen_door = Door_Enum.DOOR_SHUT;
        this.exhaust_fan = Fan_Enum.FAN_SWITCHED_OFF;
    }

    public void setFiveStarKitchenLights(Light_Enum kitchen_light){
        this.kitchen_light = kitchen_light;
        System.out.println("FiveStarKitchen Lights set to " + this.kitchen_light);
    }

    public void setFiveStarKitchenDoor(Door_Enum kitchen_door){
        this.kitchen_door = kitchen_door;
        System.out.println("FiveStarKitchen Doors set to " + this.kitchen_door);

    }

    public void setFiveStarKitchenExhaustFan(Fan_Enum exhaust_fan){
        this.exhaust_fan = exhaust_fan;
        System.out.println("FiveStarKitchen Fan set to " + this.exhaust_fan);

    }

    public void printEntityStatus(){
        System.out.println("FiveStarKitchen Lights set to " + this.kitchen_light);
        System.out.println("FiveStarKitchen Doors set to " + this.kitchen_door);
        System.out.println("FiveStarKitchen Fan set to " + this.exhaust_fan);
    }

    public String getClassName(){
        return "FiveStarKitchen";
    }

    public void execute(HomeApplianceAction action){
        if(action instanceof Light_Enum){
            setFiveStarKitchenLights((Light_Enum)action);
        }
        else if(action instanceof Door_Enum){
            setFiveStarKitchenDoor((Door_Enum)action);
        }
        else if(action instanceof Fan_Enum){
            setFiveStarKitchenExhaustFan((Fan_Enum)action);
        }
        else{
            System.out.println("Invalid action performed on FiveStarKitchen Appliance");
        }
    }
}
