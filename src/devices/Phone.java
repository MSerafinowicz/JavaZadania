package devices;

import foundations.Human;

import java.util.*;


public class Phone extends Device
{
    private String defaultAppServer = "jbzd.com.pl";
    private String defaultAppProtocol = "ABCD";
    private Double defaultAppVersion = 1.0;
    public List<Application> installedApps = new ArrayList<>(5);
    private Human owner;
    private Double price;

    public Phone (String producer, String model, Double price)
    {
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    public Phone (String producer, String model, Double price, Human owner)
    {
        this.producer = producer;
        this.model = model;
        this.price = price;
        this.owner = owner;
    }

    public Phone(String producer, String model, String yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        clearMobile();
    }

    public Phone (String producer, String model, String yearOfProduction, Human owner)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.owner = owner;
        clearMobile();
    }

    public Phone (String producer, String model, String yearOfProduction, Human owner, Double price)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.owner = owner;
        this.price = price;
        clearMobile();
    }

    public void clearMobile()
    {
        for (int i=0; i<installedApps.size(); i++)
        {
            installedApps.set(i,null);
        }
    }

    public int installationDestination()
    {
        int i;
        for(i=0; i<installedApps.size(); i++)
        {
            if(installedApps.get(i) == null)
            {
                break;
            }
        }
        return i;
    }

    public void installApp(Application application)
    {
        if (owner.getCash() >= application.getPrice())
        {
            this.installedApps.add(installationDestination(),application);
            owner.setCash(owner.getCash() - application.getPrice());
            System.out.println("Installation successful, your cash balanace now is " +owner.getCash());
        } else System.out.println("Not enough money");

    }

    public void uninstallApp(Application application)
    {
        for (int i=0; i<installedApps.size(); i++)
        {
            if (installedApps.get(i) == application)
            {
                installedApps.set(i,null);
            }
        }
    }

    public void freeApps()
    {
        for (Application application : installedApps)
        {
            try
            {
            if (application.getPrice() == 0.0)
            {
                System.out.println(application.getName());
            }
            } catch (NullPointerException e){};

        }
    }

    public void isInstalled(Application application)
    {
        for (Application app : installedApps)
        {
            if (application == app)
            {
                System.out.println("This application is installed");
            }
        }
    }

    public void isInstalled(String appName)
    {
        for (Application app : installedApps)
        {
            if (appName == app.getName())
            {
                System.out.println("This application is installed");
            }
        }
    }

    public double priceOfCurrentApps()
    {
        double sum = 0;
        try
        {
            for (Application app : installedApps) {
                sum = sum + app.getPrice();
            }
        } catch (NullPointerException e){};
        return sum;
    }

    public void appSortByPrice()
    {
        List<Application> sortedList = new ArrayList<>(installedApps);
        sortedList.sort(new ComparatorByPrice());
        for(Application app : sortedList)
        {
            System.out.println(app.getName() + " " + app.getPrice());
        }
    }

    @Override
    public void turnOn()
    {
        System.out.println("Device is turned on");
    }

    @Override
    public String toString()
    {
        return producer + " " + model + " " + yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.getPhone() != null)
        {
            if (buyer.getCash() >= price)
            {
                buyer.setCash(-price);
                seller.setCash(price);
                buyer.setPhone(this);
                seller.setPhone(null);
                System.out.println(buyer.toString() + " bought " + this.toString() + " from " + seller.toString() + " for " + price + "$");
            }
            else
            {
                System.out.println(buyer.toString() + " has not enough money");
            }
        }
        else
        {
            System.out.println(seller.toString() + " hasn't got any phone to sell");
        }
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}
