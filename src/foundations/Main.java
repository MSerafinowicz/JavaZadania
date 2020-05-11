package foundations;

import creatures.Animal;
import creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args)
    {
        Animal dog = new Pet("Majlo", "dog",8.8);

        Animal lion = new Pet ("Alex", "lion", 50.0);

        Human me = new Human("Marcin", "Serafinowicz");
        me.setPet(dog);
        Human friend = new Human("Adam" , "Małysz");

        Animal mouse = new Pet ("Jerry", "mouse", 1.2);

        Car car = new Car("Ford", "Mustang", "2015",15000.0);
        Car car2 = new Car("Ford", "Mustang", "2015",15000.0);

        Phone phone = new Phone("Samsung", "GalaxyS73456382", "2020");

        me.getPet().feed(1.2);


        /*boolean isHashCodeEquals = car.hashCode() == car2.hashCode();
        if (isHashCodeEquals == true)
        {
            System.out.println("Hashcodes are the same");
        }
        else
        {
            System.out.println("The id is different, that means objects are not equal");
        }*/


    }

}
