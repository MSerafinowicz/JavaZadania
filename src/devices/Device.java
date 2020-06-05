package devices;
import foundations.Sellable;

import java.util.List;

public abstract class Device implements Sellable
{
    String producer;
    String model;
    String yearOfProduction;
    Double value;
    abstract void turnOn();

}
