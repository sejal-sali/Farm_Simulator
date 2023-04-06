/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca2;

/**
 *
 * @author Sejal Sali
 */
public class Goats extends Animal implements Milkable 
{

    private int udders;
    
    public Goats(String name, int id, int udders)
    {
        super(name);
        this.udders = udders;
    }

    //no arg constructor
    public Goats() 
    {

    }

    //getters and setters
    public int getUdders() 
    {
        return udders;
    }

    public void setUdders(int udders) 
    {
        this.udders = udders;
    }

    // Goats produce randomly 2-3 litres of milk per day
    public int udderCapacity() 
    {
        int udderCapacity = (int) (Math.random() * 2 + 2);
        return udderCapacity;
    }
    

    //toString
    @Override
    public String toString() {
        return "DairyCow{" + "udders=" + udders + '}';
    }

    @Override
    public double milk(){
        return 0;
    }


}
