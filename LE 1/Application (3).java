/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Defining the One class with a parameterized constructor
class One {
    int x;
    
    // Parameterized constructor
    One(int x) {
        this.x = x;
    }
}

// Defining the Two class that inherits from One
class Two extends One {
    
    // Constructor for Two that calls the constructor of One
    Two(int x) {
        super(x); // Calling the constructor of the One class
    }
}

// Application class to test the inheritance and constructor behavior
public class Application {
    public static void main(String[] args) {
        Two two = new Two(10);
        System.out.println("Value of x in Two: " + two.x); // should display "Value of x in Two: 10"
    }
}

