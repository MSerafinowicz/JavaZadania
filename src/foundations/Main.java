package foundations;

import creatures.Animal;
import creatures.Pet;
import devices.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal dog = new Pet("Majlo", "dog",8.8);

        Animal lion = new Pet ("Alex", "lion", 50.0);

        Human me = new Human("Marcin", "Serafinowicz", 5);
        me.setCash(3000.0);
        Human friend = new Human("Adam" , "Małysz", 8);

        Animal mouse = new Pet ("Jerry", "mouse", 1.2);

        Electric car = new Electric("Xiaomi","e1","2020", 100000.0);

        Disel car2 = new Disel("Fiat","Zadyma","1995",800.0);

        Phone phone = new Phone("Producer","Model", "2018", me, 1200.0);

        Application facebook = new Application("facebook",0.0,1.0);
        Application archero = new Application("archero",0.0,3.8);
        Application plagueInc = new Application("PlagueInc",70.0,2.3);
        phone.installApp(facebook);
        phone.installApp(plagueInc);
        phone.installApp(archero);
        phone.isInstalled("PlagueInc");
        phone.freeApps();






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
