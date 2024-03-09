public class Quiet implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("This duck doesn't prefer talking");
    }
}
