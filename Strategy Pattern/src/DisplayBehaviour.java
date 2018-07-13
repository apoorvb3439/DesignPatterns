interface DisplayBehaviour{
    public void display();
}

class TextDisplay implements DisplayBehaviour{
    public void display(){
        System.out.println("I am Duck as Text Format");
    }
}

class GraphicDisplay implements DisplayBehaviour{
    public void display(){
        System.out.println("I am Duck as in 3D Form");
    }
}
