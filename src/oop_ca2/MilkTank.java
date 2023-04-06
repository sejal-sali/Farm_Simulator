/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca2;

/**
 *
 * @author Sejal Sali
 */
public class MilkTank {

    private double standardCapacity = 2000;
    private double customerSpecificCapacity;
    

    //constructor
    public MilkTank(double customerSpecificCapacity) 
    {
        this.customerSpecificCapacity = customerSpecificCapacity;
    }

    //no arg constructor
    public MilkTank() 
    {

    }

    //getters and setters
    public double getStandardCapacity() 
    {
        return standardCapacity;
    }

    public void setStandardCapacity(double standardCapacity) 
    {
        this.standardCapacity = standardCapacity;
    }

    public double getCustomerSpecificCapacity() 
    {
        return customerSpecificCapacity;
    }

    public void setCustomerSpecificCapacity(double customerSpecificCapacity) 
    {
        this.customerSpecificCapacity = customerSpecificCapacity;
    }


    // get standard capacity
    public double getCapacity() 
    {
        return standardCapacity;
    }

    // freeSpace method
    public double freeSpace() 
    {
        return standardCapacity - customerSpecificCapacity;
    }

    //addToTank method
    public void addToTank(double amount) 
    {
        if(amount + customerSpecificCapacity > standardCapacity)
        {
            System.out.println("Tank is full");
        }
        else
        {
            customerSpecificCapacity += amount;
        }
    }

    //getFromTank method
    public double getFromTank(double amount)
    {
        customerSpecificCapacity -= amount;
        return amount;
    }

    @Override
    public String toString()
    {
        return "MilkTank{" + "standardCapacity=" + standardCapacity + ", customerSpecificCapacity=" + customerSpecificCapacity + '}';
    }

}