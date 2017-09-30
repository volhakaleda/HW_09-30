public class Main {

    public static void main(String[] args) {

//        Holiday christmas = new Holiday("Christmas", 25, "December");
//        Holiday newYear = new Holiday("New Year", 31, "December");
//        Holiday indDay = new Holiday("Ind Day", 4, "July");
////        System.out.println(inSameMonth(christmas, newYear));
//        Movie a = new Movie("Casino Royale", "Eon Productions");
//        Movie love = new Movie("Love", "NY", "PG15", christmas);
//        System.out.println(love.toString());
//        System.out.println(a.getRating() + a.getStudio() + a.getTitle());
//        System.out.println(a.toString());
//    }
//
////    public static boolean inSameMonth(Holiday a, Holiday b) {
//
//        if (a.getMonth() == b.getMonth()) {
//            return true;
//
//        }
//        return false;
//    }
//
//  MathFunctions mathFunctions = new MathFunctions(3, 7);
//        System.out.println(mathFunctions.add());
//        System.out.println(mathFunctions.subtract());
//        System.out.println(mathFunctions.divide());
//        System.out.println(mathFunctions.average());
//        System.out.println(mathFunctions.min());
//        System.out.println(mathFunctions.max());
//
////    }
// Person person = new Person("Volha", 29, "Seafood");
// person.printAge();
// person.printFavouriteFood();
// person.printName();
//
////
//        FlowerPot flowerPot = new FlowerPot(9);
//        flowerPot.setNumOfFlowers(3);
//        flowerPot.isFull();

        BankAccount bankAccount = new BankAccount(400);
        bankAccount.withdraw(50);
        bankAccount.deposit(100);

        BankAccount bankAccount1 = new BankAccount(1000);

        Patron patron = new Patron("Volha", 5, bankAccount1);
        patron.put(5000);
        System.out.println(bankAccount1.getbalance());
    }
}

