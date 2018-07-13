interface Observer{
    void update();
}

class Mobile implements Observer{
    WeatherStation station;
    Mobile(WeatherStation s){
        System.out.println("I am a Mobile App for Weather");
        station=s;
    }

    public void update(){
        System.out.println("There is an update in your mobile");
    }
}

class Website implements Observer{
    WeatherStation station;
    Website(WeatherStation s){
        System.out.println("I am a website for Weather");
        station=s;
    }

    public void update(){
        System.out.println("There is an update in website");
    }
}
