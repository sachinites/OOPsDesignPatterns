public abstract class CarComponent extends Car{
    String ComponentName;
    int ComponentCost;
    Car car; /*On which car this component is to be attached*/
    public abstract void setComponentName(String ComponentName);
    public abstract void setComponentCost(int ComponentCost);
    public String getComponentName(){
        return ComponentName;
    }
    public int getComponentCost(){
        return ComponentCost;
    }
   
    public Car attachComponnet(Car car){
        this.car = car;
        return this;
    }

    public Car getNextComponent(){
        return this.car;
    }

    public void setColor(String colorName){
        this.ColorName = colorName;
    }

    public void setModelName(String ModelName){
        this.ModelName = ModelName;
    }
}


class HeadLights extends CarComponent{
    HeadLights(String ComponentName, int ComponentCost){
        this.ComponentName = ComponentName;
        this.ComponentCost = ComponentCost;
    }

    public void setComponentName(String ComponentName){
        this.ComponentName = ComponentName;
    }

    public void setComponentCost(int ComponentCost){
        this.ComponentCost = ComponentCost;
    }
}

class SteeringWheel extends CarComponent{
    SteeringWheel(String ComponentName, int ComponentCost){
        this.ComponentName = ComponentName;
        this.ComponentCost = ComponentCost;
    }

    public void setComponentName(String ComponentName){
        this.ComponentName = ComponentName;
    }

    public void setComponentCost(int ComponentCost){
        this.ComponentCost = ComponentCost;
    }
}

class Stereo extends CarComponent{
    Stereo(String ComponentName, int ComponentCost){
        this.ComponentName = ComponentName;
        this.ComponentCost = ComponentCost;
    }

    public void setComponentName(String ComponentName){
        this.ComponentName = ComponentName;
    }

    public void setComponentCost(int ComponentCost){
        this.ComponentCost = ComponentCost;
    }
}
