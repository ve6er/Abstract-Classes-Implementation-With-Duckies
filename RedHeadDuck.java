public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        quackBehaviour= new Quack();
        flyBehaviour= new FlyWithWings();
        swimBehaviour= new CanSwim();
        }

    @Override
    void display() {
        System.out.println("This is the Red Head Ducky");
    }
}
