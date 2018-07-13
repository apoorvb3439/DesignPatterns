interface QuackBehaviour{
    public void quack();
}

class MountainQuack implements QuackBehaviour{
    public void quack(){
        System.out.println("eee... ooo... eee...");
    }
}

class RobotQuack implements QuackBehaviour{
    public void quack(){
        System.out.println("quack-quack...");
    }
}

class CloudQuack implements QuackBehaviour{
    public void quack(){
        System.out.println("woooooo...");
    }
}
