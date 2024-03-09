abstract public class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    SwimBehaviour swimBehaviour;

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    abstract void display();
    public void swim(){
        swimBehaviour.swim();
    }
    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
}
