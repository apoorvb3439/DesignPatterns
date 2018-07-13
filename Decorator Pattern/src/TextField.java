interface Widget{
    public void drawOnConsole();
}

class TextField implements Widget{

    private int width;
    private int height;
    private String text;

    public TextField(int x,int y, String text){
        this.width=x;
        this.height=y;
        this.text=text;
    }

    public void drawOnConsole(){
        drawBorder(width);
        writeText(width,height,text);
        drawBorder(width);
    }

    private static void drawBorder(int width){
        for(int j=0; j<width+2; ++j){
            System.out.print("-");
        }
        System.out.println("");
    }

    private static void writeText(int width, int height, String text){

        char[] output=text.toCharArray();
        int index=0;

        for(int i=0; i<height; ++i){
            System.out.print("|");
            for(int j=0; j<width; ++j){
                if(index<output.length){
                    System.out.print(output[index++]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
    }
}
