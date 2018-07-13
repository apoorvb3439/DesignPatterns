public class Driver{
    public static void main(String[] args) {
        WeatherStation ws=new WeatherStation();
        Mobile m=new Mobile(ws);
        Website w=new Website(ws);
        ws.add(m);
        ws.add(w);
        ws.changeInTemprature(30);
    }
}
