/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca2;

/**
 *
 * @author Sejal Sali
 */
public class DairyCow extends Animal implements Milkable 
{

    private int udders;
    
    //constructors
    public DairyCow(String name, int id)
    {
        super(name);
        this.udders = udderCapacity();
    }

    public DairyCow() {
    }

    //getters and setters
    public int getUdders() {
        return udders;
    }

    public void setUdders(int udders) {
        this.udders = udders;
    }

    //  Udder capacity : random value 20 - 40
        public static int udderCapacity() 
        {
        int udderCapacity = (int) (Math.random() * 20 + 20);
        return udderCapacity;
        
    }

    public DairyCow Cow(String name)
    {
        return new DairyCow();
    }

    //string getName method
    public String getName(String name)
    {
        return name;
    }
    
    //getCapacity method
    public double getCapacity()
    {
        return udders;
    }
    
    //toString
    @Override
    public String toString() {
        return "DairyCow{" + "udders=" + udders + '}';
    }

    @Override
    public double milk() {
        return this.udders;
    }

}