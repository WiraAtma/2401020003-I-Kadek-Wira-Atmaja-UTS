package Models;

// Soal 4 - Inheritance & Polymorphism (superclass)
public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Saya Bernama " + name);
    }
}

