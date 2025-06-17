package OOP_examples;

// 🔹 5. Class & Object – Blueprint vs Instance

public class Car {
    String model;
    int year;

    public Car(String m, int y) {
        model = m;
        year = y;
    }

    public void drive() {
        System.out.println("Driving " + model + " from " + year);
    }
}

// Creating objects
Car myCar = new Car("Tesla", 2023);
myCar.drive();