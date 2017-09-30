package Inheritance;

public class Main {


    public static void main(String[] args) {
        Pet cat = new Pet();
        cat.isHome();

        Animal animal = new Pet();
//      animal.isHome() - is not possible because animal does not know who it is: Pet or Wild
        if (animal instanceof Pet) {
            Pet p = (Pet) animal;
            p.isHome();
//           is possible because we know that animal is pet. We cast animal to pest.
////        }

        }
        Plane plane = new Plane();
        plane.setColour("red");
        plane.hasSeats();
        Plane plane1 = new Plane();
        plane1.setColour("green");
        plane1.setNumSeats(100);

        Vehicle vehicle = new Plane();  // we can access only methods from Vehicle superclass. We cant call methods
        // from Plane subclass cause Vehicle can be car, bus or plane.
        if (vehicle instanceof Plane) {
            Plane realPlane = (Plane) vehicle; //we cast vehicle to Plane.
            realPlane.setNumSeats(900); //now we can access methods from Plane subclass
        }
        Plane plane2 = new Plane();
        plane2.getTree();





    }
}