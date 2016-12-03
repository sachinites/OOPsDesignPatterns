class Duck{
    boolean fly;
    String quake;
    String color;

    Duck(){
        fly = true;
        quake = "quake";
        color = "color";
    }
    Duck(boolean fly, String quake, String color){
        this.fly = fly;
        this.quake = quake;
        this.color = color;
    }

    String who_am_i(){
        return (String)("This is generic Duck\n");
    }

    void setDuckFly(boolean fly){
        this.fly = fly;
    }
    boolean getDuckFly(){
        return this.fly;
    }

    void setDuckColor(String color){
        this.color = color;
    }

    String getDuckColor(){
        return this.color;
    }

    
    void setDuckSound(String sound){
        this.quake = sound;
    }

    String getDuckSound(){
        return this.quake;
    }
}
