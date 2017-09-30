package Inheritance;

public class Plane extends Vehicle{

    int numSeats = 0;

    @Override
    public void move() {
        System.out.println("Super Fast");
    }

    @Override
    public void hasSeats() {
        System.out.println(numSeats);
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public void getTree() {
        super.getTree(); //at first, it will run getTree method from superclass Vehicle
        System.out.println("im plane"); //then this line
    }

}

