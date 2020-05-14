package foundations;

import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.time.LocalDate;
import java.time.LocalTime;

public class Human
{
    String firstName;
    String lastName;
    Phone phone;
    private Animal pet;
    private Car car;
    private Double salary;
    private Double cash=0.0;

    public String toString()
    {
        return firstName + " " + lastName;
    }

    public Human()
    {

    }

    public Human(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Phone getPhone()
    {
        return phone;
    }

    public void setPhone(Phone phone)
    {
        Human.this.phone = phone;
    }

    public void setCash(Double cash)
    {
        this.cash = this.cash + cash;
    }

    public Double getCash()
    {
        return cash;
    }

    public Double getSalary()
    {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentDate + " " + currentTime + " Your salary is: "+ salary);
        return salary;
    }

    public void setSalary(double salary)
    {
        if (salary < 0)
        {
            System.out.println("Salary must be bigger or equal 0.");
        }
        else
        {
            System.out.println("New data has been sent to accounting system.");
            System.out.println("Annex from the contract must be collected from Mrs Hanna from HR.");
            System.out.println("ZUS and US already know about salary change. There is no point hiding it.");
            this.salary = salary;
        }
    }

    public Car getCar()
    {
        return car;
    }

    public void setCar(Car car)
    {
        Human.this.car = car;
    }

    public void buyCar(Car car)
    {
        if (salary > car.value)
        {
            System.out.println("The car was bought for cash.");
            this.car = car;
        }
        else if (salary * 12 > car.value)
        {
            System.out.println("The car was bought on credit");
            this.car = car;
        }
        else
        {
            System.out.println("Change your work, ask for rise, your salary is too low for that car");
        }
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
}