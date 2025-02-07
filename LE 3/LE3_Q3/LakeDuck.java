public class LakeDuck extends Duck implements FlyBehavior, QuackBehavior {
    public void fly() {
        System.out.println("Lake Duck flies.");
    }
    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
    public static void main(String[] args) {
        LakeDuck lakeDuck = new LakeDuck();
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
