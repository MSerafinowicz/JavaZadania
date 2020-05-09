package devices;
import foundations.Sellable;
public abstract class Device implements Sellable
{
    String producer;
    String model;
    String yearOfProduction;

    abstract void turnOn();

}
