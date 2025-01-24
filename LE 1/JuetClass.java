/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class JuetClass {
    int age;
    String name;
    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        JuetClass student = new JuetClass();
        student.setAge(20);
        student.setName("John Doe");
        System.out.println("Age: " + student.getAge());
        System.out.println("Name: " + student.getName());
    }
}

