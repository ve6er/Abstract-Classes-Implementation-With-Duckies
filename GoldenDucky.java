public class GoldenDucky extends Duck{

    public GoldenDucky(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quiet();
        swimBehaviour = new CannotSwim();
    }
    @Override
    void display() {
        System.out.println("This is a goldie ducky");
    }
}
