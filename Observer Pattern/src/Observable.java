import java.util.ArrayList;

abstract class Observable{
    ArrayList<Observer> subscribers=new ArrayList<Observer>();
    public void add(Observer o){
        subscribers.add(o);
    }
    public void remove(Observer o){
        subscribers.remove(o);
    }
    public void notifyObservers(){
        for(Observer o: subscribers){
            o.update();
        }
    }
}

class WeatherStation extends Observable{
    int temprature;
    WeatherStation(){
        System.out.println("I am a Weather-Station (sorry only for temprature)");
    }

    int getTempratue(){
        return temprature;
    }

    void changeInTemprature(int newTemprature){
        temprature=newTemprature;
        notifyObservers();
    }
}
