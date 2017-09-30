package Inheritance;

public abstract class Vehicle {
    protected String colour;

    public abstract void move();
    public abstract void hasSeats();
//    in subclass I can only insert body with the same signature

    public String showColour() {
        return colour;
    }
    protected void setColour(String colour) { //protected in SuperClass - only subclasses can get to fields & methods.
        this.colour = colour;
    }

    public void getTree(){
        System.out.println("im vehicle");
    }
}
