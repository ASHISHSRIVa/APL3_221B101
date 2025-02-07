public class Test implements Testable {
    public void display() {
        System.out.println("Display method implemented in test class.");
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}
