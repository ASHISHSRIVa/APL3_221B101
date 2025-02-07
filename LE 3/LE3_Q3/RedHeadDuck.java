public class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior {
    public void fly() {
        System.out.println("RedHead Duck flies.");
    }
    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();
    }
}
