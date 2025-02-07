public class RubberDuck extends Duck implements SqueakBehavior {
    public void squeak() {
        System.out.println("Rubber duck squeaks.");
    }
    
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        rubberDuck.squeak();
    }
}
