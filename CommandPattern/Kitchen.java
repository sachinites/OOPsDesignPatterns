class Kitchen implements HomeEntities{
    private Light_Enum kitchen_light;
    private Door_Enum kitchen_door;
    private Fan_Enum exhaust_fan;

    Kitchen(){
        this.kitchen_light = Light_Enum.LIGHTS_OFF;
        this.kitchen_door = Door_Enum.DOOR_SHUT;
        this.exhaust_fan = Fan_Enum.FAN_SWITCHED_OFF;
    }

    public void setKitchenLights(Light_Enum kitchen_light){
        this.kitchen_light = kitchen_light;
        System.out.println("Kitchen Lights set to " + this.kitchen_light);
    }

    public void setKitchenDoor(Door_Enum kitchen_door){
        this.kitchen_door = kitchen_door;
        System.out.println("Kitchen Doors set to " + this.kitchen_door);

    }

    public void setKitchenExhaustFan(Fan_Enum exhaust_fan){
        this.exhaust_fan = exhaust_fan;
        System.out.println("Kitchen Fan set to " + this.exhaust_fan);

    }

    public void printHomeEntityStatus(){
        System.out.println("Kitchen Lights set to " + this.kitchen_light);
        System.out.println("Kitchen Doors set to " + this.kitchen_door);
        System.out.println("Kitchen Fan set to " + this.exhaust_fan);
    }

    public String getClassName(){
        return "Kitchen";
    }

    public void execute(HomeApplianceAction action){
        if(action instanceof Light_Enum){
            setKitchenLights((Light_Enum)action);
        }
        else if(action instanceof Door_Enum){
            setKitchenDoor((Door_Enum)action);
        }
        else if(action instanceof Fan_Enum){
            setKitchenExhaustFan((Fan_Enum)action);
        }
        else{
            System.out.println("Invalid action performed on Kitchen Appliance");
        }
    }
}
