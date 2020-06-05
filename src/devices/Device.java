package devices;
import foundations.Sellable;
public abstract class Device implements Sellable
{
    String producer;
    String model;
    String yearOfProduction;
    Double value;

    abstract void turnOn();

}
