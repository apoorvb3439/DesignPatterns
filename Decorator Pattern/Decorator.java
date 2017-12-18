class WidgetDecorator implements Widget{

    public Widget widget;

    public WidgetDecorator(Widget w){
        widget=w;
    }

    public void drawOnConsole(){
        widget.drawOnConsole();
    }

}

class BorderWidgetDecorator extends WidgetDecorator{

    private char borderChar;
    private int width;

    BorderWidgetDecorator(Widget w, char c , int width){
        super(w);
        this.borderChar=c;
        this.width=width;
    }

    public void drawOnConsole(){
        drawCustomBorder(borderChar,width);
        super.drawOnConsole();
        drawCustomBorder(borderChar,width);
    }

    private static void drawCustomBorder(char c, int width){
        for(int i =0; i<width; ++i){
            System.out.print(c);
        }
        System.out.println("");
    }

}
