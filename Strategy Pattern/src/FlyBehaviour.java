interface FlyBehaviour{
    public void fly();
}

class SimpleFly implements FlyBehaviour{
    public void fly(){
        System.out.println("I am flying...");
    }
}

class FastFly implements FlyBehaviour{
    public void fly(){
        System.out.println("I am flying fast so fast...");
    }
}

class NoFly implements FlyBehaviour{
    public void fly(){
        System.out.println("I cant fly ooo...");
    }
}
