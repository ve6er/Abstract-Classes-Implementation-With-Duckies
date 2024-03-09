public class Main {
    public static void main(String[] args){
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.swim();
        System.out.println();
        RubberDuck rb = new RubberDuck();
        rb.display();
        rb.performFly();
        rb.performQuack();
        rb.swim();
        System.out.println();
        GoldenDucky gd = new GoldenDucky();
        gd.display();
        gd.performFly();
        gd.performQuack();
        gd.swim();
    }
}
