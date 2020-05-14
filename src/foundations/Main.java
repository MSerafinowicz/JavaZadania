package foundations;

import creatures.Animal;
import creatures.Pet;
import devices.Car;
import devices.Electric;
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

        Electric car = new Electric("Xiaomi","e1","2020", 100000.0);

        Phone phone = new Phone("Samsung", "GalaxyS73456382", "2020");

        phone.installApp("facebook","Chrome","Archero","exam test answers","calculator");
        System.out.println(phone.installedApps[3]);
        phone.uninstallApp(3);
        System.out.println(phone.installedApps[3]);


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
