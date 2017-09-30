package Inheritance;

public class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("Fast");
    }

    @Override
    public void hasSeats() {
        System.out.println("4");
    }
}
