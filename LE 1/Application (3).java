/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class One {
    int x;
    One(int x) {
        this.x = x;
    }
}

class Two extends One {

    Two(int x) {
        super(x);
    }
}


public class Application {
    public static void main(String[] args) {
        Two two = new Two(10);
        System.out.println("Value of x in Two: " + two.x); 
    }
}

