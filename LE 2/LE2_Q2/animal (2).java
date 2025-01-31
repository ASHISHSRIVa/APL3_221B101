/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
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
