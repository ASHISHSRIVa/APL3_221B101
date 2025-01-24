/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Mother {
    int x;
    

    Mother(int x) {
        this.x = x;
    }
    void show() {
        System.out.println("Value of x: " + x);
    }
}
class Child extends Mother {
    Child(int x) {
        super(x); 
    }
}
public class Application {
    public static void main(String args[]) {
        Mother m = new Mother(10);
        m.show(); 
        Child ch = new Child(20);
        ch.show();
    }
}
