package Inheritance;

public class Wild extends Animal {

    public void bite() {
        System.out.println("bites");
    }

    @Override
    public void move() {
        System.out.println("tired");
    }
}
