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

        me.setSalary(3000.0);
        me.getSalary();

        me.setCar(car);

    }

}
