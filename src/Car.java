public class Car
{
    final String producer;
    final String model;
    final String yearOfProduction;
    Double value;

    public Car(String producer, String model, String yearOfProduction)
    {

        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Car(String producer, String model, String yearOfProduction, Double value)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

}
