/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Defining the Mother class
class Mother {
    int x;
    
    // Constructor to initialize x
    Mother(int x) {
        this.x = x;
    }
    
    // Method to show a message
    void show() {
        System.out.println("Hello World");
    }
}

// Defining the Child class that inherits from Mother
class Child extends Mother {
    
    // Constructor to initialize x in the base class
    Child(int x) {
        super(x); // Calling the constructor of the Mother class
    }
    
    // Overriding the show method
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}

// Application class to test the inheritance and method overriding
public class Application {
    public static void main(String args[]) {
        // Creating an object of Mother class
        Mother m = new Mother(10);
        m.show(); // show of Mother is called, should display "Hello World"
        
        // Creating an object of Child class
        Child ch = new Child(20);
        ch.show(); // show() overridden in Child from Mother is called, should display "Hello JUET"
    }
}
