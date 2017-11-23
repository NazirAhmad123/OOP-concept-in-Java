package Polymorphism.Challenge;
class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car -> start engine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}
// we create 3 sub classes

// Class 1.
class Myvi extends Car{

    public Myvi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //return "Myvi -> start startEngine()";
        return getClass().getSimpleName() + " -> Start Engine.";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> start accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> start brake()";
    }
}

// Class 2

class BMW extends Car{

    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "BMW -> start startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMW -> start accelerate()";
    }

    @Override
    public String brake() {
        return "BMW -> start brake()";
    }
}

// Class 3.
class proton extends Car{

    public proton(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "proton -> start startEngine()";
    }

    @Override
    public String accelerate() {
        return "proton -> start accelerate()";
    }

    @Override
    public String brake() {
        return "proton -> start brake()";
    }
}

public class Main {
    public static void main(String args[]){
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4.
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters.
        //
        // show a message for each in the base class
        // Now create 3 subclasses for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        // Base class
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        // Myvi class
        Myvi myvi = new Myvi(6, "Myvii WRV B_09");
        System.out.println(myvi.startEngine());
        System.out.println(myvi.accelerate());
        System.out.println(myvi.brake());

        // BMW
        BMW BMW = new BMW(6, "BMW 2014");
        System.out.println(BMW.startEngine());
        System.out.println(BMW.accelerate());
        System.out.println(BMW.brake());

        // proton
        proton proton = new proton(6, "Proton B_095");
        System.out.println(proton.startEngine());
        System.out.println(proton.accelerate());
        System.out.println(proton.brake());
    }
}
