package Inheritance;

public class Pet extends Animal implements AnimelInterface {
//public class Pet implements AnimelInterface

    public void curdle() {
        System.out.println("curdles");
    }

// to give value and body to abstract method from abstarct class or interface
    @Override
    public void move() {
        System.out.println("ok");
    }

    public boolean isHome() {
        return true;
    }
}
