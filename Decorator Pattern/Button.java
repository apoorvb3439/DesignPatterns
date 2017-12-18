class Button implements Widget{
    private int posX;
    private int posY;
    String name;
    Button(int x, int y, String name){
        posX=x;
        posY=y;
        this.name=name;
    }

    public void drawOnConsole(){
        System.out.println(name);
    }
}
