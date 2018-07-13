public class Driver{
    public static void main(String[] args) {

        TextField t=new TextField(10,2,"apoorv is a good boy");
        BorderWidgetDecorator a=new BorderWidgetDecorator(t,'%',15);
        a.drawOnConsole();

        Button button=new Button(7,1,"Click Me");
        BorderWidgetDecorator b=new BorderWidgetDecorator(new BorderWidgetDecorator(button,'*',15),'/',17);
        b.drawOnConsole();

    }
}
