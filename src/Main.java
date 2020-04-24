public class Main {

    public static void main(String[] args)
    {
        Animal dog = new Animal("dog");
        dog.name = "Majlo";

        Animal lion = new Animal ("lion");
        lion.name = "Alex";

        Human me = new Human("Marcin", "Serafinowicz");
        me.pet = dog;

        System.out.println(me.pet.name);

        dog.feed();
    }

}
