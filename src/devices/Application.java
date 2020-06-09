package devices;

import foundations.Human;


public class Application
{
    private String name;
    private Double price;
    private Human creator;
    private Double version;


    public Application (String name, Double price, Human creator, Double version)
    {
        this.name = name;
        this.price = price;
        this.creator = creator;
        this.version = version;
    }

    public Application (String name, Double price, Double version)
    {
        this.name = name;
        this.price = price;
        this.version = version;
    }

    public Human getCreator() {
        return creator;
    }

    public void setCreator(Human creator) {
        this.creator = creator;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
