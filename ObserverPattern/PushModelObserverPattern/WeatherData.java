/*

  +------------------------------------------------------------------------------------+
  | This is the Subject. It will maintain the ArrayList of the observers to send them  |
  | Notofication (PUSH) when the state of the subject changes. You may re-design this  |
  | Application in the form of PULL model where Observers pulls the data from Subject  |
  | Whenever they desire.                                                              |
  +------------------------------------------------------------------------------------+


                                     +----------+
                         ------------|Observer 1| 
                        /            +----------+ 
                       /                         
           +-------+  /              +----------+
           |Subject|-X---------------|Observer 2|              
           |       |  \              +----------+ 
           +-------+   \                         
                        \            +----------+
                         ------------|Observer 3|           
                                     +----------+

*/

import java.util.*;
class WeatherData implements Subject{
    /*State of the WeatherData Class*/
    private float temp;
    private float pressure;
    private float humidity;
    /* List of observers subscribed*/
    private ArrayList<Observer> observersList;

    WeatherData(){
        temp = 0.0f;
        pressure = 0.0f;
        humidity = 0.0f;
        observersList = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observersList.add(o);
        System.out.println(o.getClassName() +" has been subscribed");
    }

    public void unregisterObserver(Observer o){
        observersList.remove(o);
        System.out.println(o.getClassName() +" has been unsubscribed");
    }

    public void notifyObservers(){
        Observer o;
        int i = 0;
        for(i = 0 ; i < observersList.size(); i++){
            o = observersList.get(i);
            System.out.println("notifying to " + o.getClassName());
            o.update(temp, pressure, humidity);
        }
        if(i==0)
            System.out.println("No Observer to notify");
    }

    /* WeatherData specific function. */
    public void setMeasurements(float temp, float pressure, float humidity){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        /*As soon as Measurements are changes, notify observers*/
        notifyObservers();
    }
}

