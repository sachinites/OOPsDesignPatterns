public abstract class Decorators{
    String decoratorName;
    int decoratorCost;
    public void setdecoratorName(String decoratorName){
        this.decoratorName = decoratorName;
    }
    public void setdecoratorCost(int decoratorCost){
        this.decoratorCost = decoratorCost;
    }
    String getDecoratorName(){
        return decoratorName;
    }
    int getDecoratorCost(){
        return decoratorCost;
    }
}

class Bangles extends Decorators{
    Bangles(String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}


class Saree extends Decorators{
    Saree(String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}


class Earrings extends Decorators{
    Earrings(String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}


class MakeupBox extends Decorators{
    MakeupBox(String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}


class HairDresser extends Decorators{
    HairDresser(String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}


class Sandals extends Decorators{
    Sandals(String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}


class Necklace extends Decorators{
    Necklace(String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}


class Watch extends Decorators{
    Watch(String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}


class Purse extends Decorators{
    Purse (String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}


class Perfume extends Decorators{
    Perfume(String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}


class Ring extends Decorators{
    Ring(String decoratorName, int cost){
        setdecoratorName(decoratorName);
        setdecoratorCost(cost);
    }
}
