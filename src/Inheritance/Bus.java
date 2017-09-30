package Inheritance;

public class Bus extends Vehicle {

    @Override
    public void move() {
        System.out.println("Slow");
    }

    @Override
    public void hasSeats() {
        System.out.println("10");
    }
}

