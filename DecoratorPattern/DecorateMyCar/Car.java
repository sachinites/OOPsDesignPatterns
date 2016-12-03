/*
|------------------------------------------------------------------------------------------+
|  1. I purchased the Car from the Garage. The Car had only basic components and           |
|  entirely withered out condition. It had no headlights, rearLights etc. It had only      |
|  engine in working condition. Clearly one should not own this car  , and before taking   |
|  the car   on the road, it should be nourished. Hence this is the abstract class so that |
|  nourishment of this class becomes mandatory (i.e. you cannot instantiate this class     |
|  directly)                                                                               |
+------------------------------------------------------------------------------------------+
*/

public abstract class Car{
    String ColorName;
    String ModelName;
    public int getCost(){
        if(ModelName == "Maruti")
            return 70000;
        else if(ModelName == "Ambassador")
            return 150000;
         else return 0;
    }

    public abstract void setColor(String Color);// to be overridden
    public String getColor(){
        return ColorName;
    }

    public abstract void setModelName(String ModelName); // to be overridden
    public String getModelName(){
        return ModelName;
    }
}


/* 

    2. Let us Decorate the class by adding it new components.

*/

class CustomizedCar extends Car{
    CustomizedCar(String colorName, String ModelName){
        this.ColorName = colorName;
        this.ModelName = ModelName;
    }

    public void setColor(String colorName){
        this.ColorName = colorName;
    }

    public void setModelName(String ModelName){
        this.ModelName = ModelName;
    }

/* This nethod is static because the wrapper object cannot call this method*/
    public static int getCost(Car obj){
       int cost = 0 ; 
        while(!(obj instanceof CustomizedCar)){
            cost = cost + ((CarComponent)obj).getComponentCost();
            System.out.println("Component Name = " + ((CarComponent)obj).getComponentName() + ", Component Cost = " +
            ((CarComponent)obj).getComponentCost() + " Cumulative cost = " + cost);
            obj = ((CarComponent)obj).getNextComponent();
        }
        cost = cost + ((CustomizedCar)obj).getCost();
        System.out.println("CustomizedCar ModelName = " + ((CustomizedCar)obj).getModelName() + ", CustomizedCarModelCost = " + 
                                                        ((CustomizedCar)obj).getCost() + ", Cumulative cost = " + cost);
        return cost;
    }
}


