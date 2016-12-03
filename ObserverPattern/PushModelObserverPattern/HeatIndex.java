class HeatIndex{
    HeatIndex(){}

    static float computeHI(float temp, float humidity){
        return (temp + humidity)/2;
    }
}

