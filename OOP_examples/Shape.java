package OOP_examples;

abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
