package devices;

import foundations.Human;
import java.util.Objects;

public abstract class Car extends Device
{
    final String producer;
    final String model;
    final String yearOfProduction;
    public Double value;
    public Double resource = 30.0;
    public Double capacityOfResource = 100.0;

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

    public abstract void refuel(double qunatity);

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


    public void sell(Human seller, Human buyer, Double price, Integer garagePlace) throws Exception {
        if (seller.getCar(garagePlace) == null)
        {
            throw new Exception("Seller hasn't this car");
        }else if (buyer.isFreePlace() == false)
        {
            throw new Exception("Buyer hasn't place in garage");
        }else if (buyer.getCash() < price)
        {
            throw new Exception("Buyer hasn't got money");
        }else
        {
            seller.removeCar(this);
            buyer.addCar(this);
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
            System.out.println("Transaction successful");
        }
        }
    }
