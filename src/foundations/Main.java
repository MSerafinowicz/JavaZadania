package foundations;

import devices.Car;
import devices.Phone;
import foundations.Animal;
import foundations.Human;

public class Main {

    public static void main(String[] args)
    {
        Animal dog = new Animal("dog");
        dog.name = "Majlo";

        Animal lion = new Animal ("lion");
        lion.name = "Alex";

        Human me = new Human("Marcin", "Serafinowicz");
        me.pet = dog;
        Human friend = new Human("Adam" , "Małysz");

        Animal mouse = new Animal("mouse");
        mouse.name = "Jerry";

        Car car = new Car("Ford", "Mustang", "2015",15000.0);
        Car car2 = new Car("Ford", "Mustang", "2015",15000.0);

        Phone phone = new Phone("Samsung", "GalaxyS73456382", "2020");

        me.setCar(car);
        me.phone = phone;
        me.setCash(10.0);
        friend.setCash(10.0);
        me.pet.sell(me,friend,300.0);
        friend.setCash(291000.0);
        me.pet.sell(me,friend,300.0);
        me.phone.sell(me,friend,3000.0);
        me.getCar().sell(me,friend,150000.0);

        System.out.println(friend.getCar().toString());
        System.out.println(friend.getPhone().toString());
        System.out.println(friend.getCash());

        //me.setSalary(3000.0);

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
