package devices;

import java.util.Objects;

public class Car extends Device
{
    final String producer;
    final String model;
    final String yearOfProduction;
    public Double value;

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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return producer.equals(car.producer) &&
                model.equals(car.model) &&
                yearOfProduction.equals(car.yearOfProduction) &&
                Objects.equals(value, car.value);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(producer, model, yearOfProduction, value);
    }

    public String toString()
    {
        return producer + " " + model + " " + yearOfProduction + " " + value;
    }

    public void turnOn()
    {
        System.out.println("Device is turned on");
    }
}
