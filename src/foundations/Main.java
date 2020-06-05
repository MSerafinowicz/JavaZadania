package foundations;

import creatures.Animal;
import creatures.Pet;
import devices.Car;
import devices.Disel;
import devices.Electric;
import devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal dog = new Pet("Majlo", "dog",8.8);

        Animal lion = new Pet ("Alex", "lion", 50.0);

        Human me = new Human("Marcin", "Serafinowicz", 5);
        me.setSalary(150000.0);
        me.setPet(dog);
        Human friend = new Human("Adam" , "Małysz", 8);

        Animal mouse = new Pet ("Jerry", "mouse", 1.2);

        Electric car = new Electric("Xiaomi","e1","2020", 100000.0);

        Disel car2 = new Disel("Fiat","Zadyma","1995",800.0);

        Phone phone = new Phone("Samsung", "GalaxyS73456382", "2020");

        me.buyCar(car);
        me.buyCar(car2);
        System.out.println(me.getCash());
        System.out.println(me.getCar(0));
        System.out.println(me.carsValue());


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
