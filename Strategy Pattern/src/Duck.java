class Duck{
    FlyBehaviour f;
    QuackBehaviour q;
    DisplayBehaviour d;

    Duck(FlyBehaviour f, QuackBehaviour q, DisplayBehaviour d){
        this.f=f;
        this.q=q;
        this.d=d;
    }

    void fly(){
        f.fly();
    }

    void quack(){
        q.quack();
    }

    void display(){
        d.display();
    }
}

class MountainDuck extends Duck{
    MountainDuck(){
        super(new SimpleFly(), new MountainQuack(), new GraphicDisplay());
    }
}

class CloudDuck extends Duck{
    CloudDuck(FlyBehaviour f, QuackBehaviour q, DisplayBehaviour d){
        super(new FastFly(), new CloudQuack(), new GraphicDisplay());
    }
}

class RubberDuck extends Duck{
    RubberDuck(FlyBehaviour f, QuackBehaviour q, DisplayBehaviour d){
        super(new NoFly(), new RobotQuack(), new TextDisplay());
    }
}
