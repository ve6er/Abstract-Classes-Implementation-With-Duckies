public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehaviour= new FlyNoWay();
        quackBehaviour= new Squeak();
        swimBehaviour = new CanSwim();
    }
    @Override
    void display() {
        System.out.println("This is a Rubber Ducky");
    }
}
