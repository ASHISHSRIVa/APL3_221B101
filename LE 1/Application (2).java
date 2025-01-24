/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Defining the Mother class
class Mother {
    int x;
    
    Mother(int x) {
        this.x = x;
    }
    
    void show() {
        System.out.println("Hello World");
    }
}

// Defining the Child class that inherits from Mother
class Child extends Mother {
    
    Child(int x) {
        super(x);
    }
    
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}

// Application class to test polymorphism
public class Application {
    public static void main(String args[]) {
        Mother m = new Mother(10);
        m.show(); // show of Mother is called, should display "Hello World"
        
        Child ch = new Child(20);
        ch.show(); // show() overridden in Child from Mother is called, should display "Hello JUET"
        
        Mother m1 = new Child(30);
        m1.show(); // show() of Child is called due to polymorphism, should display "Hello JUET"
    }
}
