class KanpurWeatherForcastObserver implements Observer{
    /*State of the Observer Class*/
    private float temp;
    private float pressure;
    private float humidity;

    /*HAS-A*/
    private Display displayType;

    KanpurWeatherForcastObserver(WeatherData subject){
        temp = 0.0f;
        pressure = 0.0f;
        humidity = 0.0f;
        subject.registerObserver(this);
        displayType = new DisplayVertical();
    }

    void unSubscribe(WeatherData subject){
        subject.unregisterObserver(this);
    }

    void setDisplayType(Display displayType){
        this.displayType = displayType;
    }


    public void update(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.displayType.display(this.temp, this.humidity, this.pressure, getClassName());
    }

    public String getClassName(){
        return "KanpurWeatherForcastObserver";
    }
}

