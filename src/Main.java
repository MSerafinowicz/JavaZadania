import devices.Car;

public class Main {

    public static void main(String[] args)
    {
        Animal dog = new Animal("dog");
        dog.name = "Majlo";

        Animal lion = new Animal ("lion");
        lion.name = "Alex";

        Human me = new Human("Marcin", "Serafinowicz");
        me.pet = dog;

        Animal mouse = new Animal("mouse");
        mouse.name = "Jerry";

        Car car = new Car("Ford", "Mustang", "2015",15000.0);
        Car car2 = new Car("Ford", "Mustang", "2015",15000.0);

        //me.setSalary(3000.0);

        boolean isHashCodeEquals = car.hashCode() == car2.hashCode();
        if (isHashCodeEquals == true)
        {
            System.out.println("Hashcodes are the same");
        }
        else
        {
            System.out.println("The id is different, that means objects are not equal");
        }

        System.out.println((car).equals(car2));

        System.out.println(dog);

    }

}
