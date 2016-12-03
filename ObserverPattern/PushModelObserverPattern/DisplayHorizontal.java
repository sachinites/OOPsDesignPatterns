class DisplayHorizontal implements Display{
    DisplayHorizontal(){}
    public void display(float temp, float pressure, float humidity, String classname){
        System.out.println("\n============= HORIZONTAL DISPLAY : " +  classname + " =================================\n");
        System.out.println("  Temperature = " + temp + " Pressure = " + pressure + " Humidity = " + humidity +
                "HeatIndex  = " + HeatIndex.computeHI(temp,humidity));
        System.out.println("\n==============================================\n");
    }
}

