//overloading
public class Oop {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}


//constructor
class Car {

    Car() {
        System.out.println("Car Created");
    }

}

//private class User
class User{

    private String password;

    public void getPassword(String password) {
        this.password=password;
        System.out.println("Password set to: " + this.password);
    }

}

//protected 
class Animal {
    protected String name;
}
class Dog extends Animal {
    Dog() {
        name="Dog";
    }
}

class Student {

    private String name;
    private int age;

    // Constructor الأول
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor الثاني
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method Overloading
    void print() {
        System.out.println(name + " " + age);
    }

    void print(String message) {
        System.out.println(message);
        System.out.println(name + " " + age);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}