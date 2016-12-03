

/*
 +------------------+
 |  Main Program    |
 +------------------+
*/

class WeatherstationMain{
    public static void main(String args[]){
        /*Initializing the Subject*/
        WeatherData subject = new WeatherData();
        /*Initializing the Observer*/
        //DelhiWeatherForcastObserver delhiObserver = new DelhiWeatherForcastObserver(subject);
        KanpurWeatherForcastObserver lucknowObserver = new KanpurWeatherForcastObserver(subject);
        /*Setting the new Measurements of the Subject*/
        subject.setMeasurements(1.0f, 2.0f, 3.0f);
        //delhiObserver.setDisplayType(new DisplayVertical());
        subject.setMeasurements(4.0f, 5.0f, 6.0f);

    }

}

