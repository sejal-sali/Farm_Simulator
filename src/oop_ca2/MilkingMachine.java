                                                                                                                                /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca2;

/**
 *
 * @author Sejal Sali
 */
public class MilkingMachine {

    MilkTank tank;

    public MilkingMachine() 
    {

    }

    // getMilkTank() returns the connected milk tank
    public MilkTank getMilkTank() 
    {
        return tank;
    }

    
    // getter and setter 
    public void setMilkTank(MilkTank tank) 
    {
        this.tank = tank;
    }

    public MilkTank getMilkTank(MilkTank tank) 
    {
         return tank;
    }

    public void milk(Milkable milkable) 
    {
        if (tank == null) {
            //throw exception message
            throw new IllegalStateException("No tank installed");
        }
        else 
        {
            //adding only if the tanks are milkable
            tank.addToTank(milkable.milk());
        }
    }

    // toString()
    @Override
    public String toString() 
    {
        return "MilkingMachine{" + "tank=" + tank + '}';
    }










    
    

    
}
