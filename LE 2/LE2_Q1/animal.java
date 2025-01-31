/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Animal {
    void makeVoice();
}

class Cow implements Animal {
    public void makeVoice() {
        System.out.println("Cow: Moo");
    }
}

class Dog implements Animal {
    public void makeVoice() {
        System.out.println("Dog: Woof");
    }
}

class Pig implements Animal {
    public void makeVoice() {
        System.out.println("Pig: Oink");
    }
}

class Goat implements Animal {
    public void makeVoice() {
        System.out.println("Goat: Baa");
    }
}

class Lion implements Animal {
    public void makeVoice() {
        System.out.println("Lion: Roar");
    }
}
