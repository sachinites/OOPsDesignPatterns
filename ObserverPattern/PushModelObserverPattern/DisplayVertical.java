class DisplayVertical implements Display{
    DisplayVertical(){}
    public void display(float temp, float pressure, float humidity, String classname){
        System.out.println("\n============= VERTICAL DISPLAY : " +  classname + " =================================\n");
        System.out.println("Temperature = " + temp + "\nPressure = " + pressure + "\nHumidity = " + humidity + "\nHeatIndex = " + HeatIndex.computeHI(temp,humidity));
        System.out.println("\n==============================================\n");
    }
}

