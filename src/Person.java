public class Person {

    private String name;
    private int age;
    private String favouriteFood;

    public Person(String name, int age, String favouriteFood) {
        this.name = name;
        this.age = age;
        this.favouriteFood = favouriteFood;
    }

    public void printName()
    {
        System.out.println(name);
    }

    public void printAge() {

        System.out.println(age);
    }

    public void printFavouriteFood() {

        System.out.println(favouriteFood);
    }
}
