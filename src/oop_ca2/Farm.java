/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca2;

/**
 *
 * @author Sejal Sali
 */
import java.util.ArrayList;

public class Farm 
{

    private int id;
    private String owner ;
    private ArrayList<Shed> shed;

    //constructor
    public Farm(int id, String owner, ArrayList<Shed> shed) 
    {
        this.id = id;
        this.owner = owner;
        this.shed = shed;
    }

    public Farm() 
    {

    }

    //getters and setters
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getOwner() 
    {
        return owner;
    }

    public void setOwner(String owner) 
    {
        this.owner = owner;
    }

    public ArrayList<Shed> getShed() 
    {
        return shed;
    }

    public void setShed(ArrayList<Shed> shed) 
    {
        this.shed = shed;
    }

    //adds the created farm object to the array list
    public void addFarm(int id, String owner, ArrayList<Shed> shed)
    {
        Farm farm = new Farm(id, owner, shed);
        Farm.addFarm(farm);
    }

    private static void addFarm(Farm farm) 
    {

    }

    public void addNewShed(Shed shed) 
    {
        this.shed.add(shed);
    }

    //toString
    @Override
    public String toString() {
        return "Farm{" + "id=" + id + ", owner=" + owner + ", shed=" + shed + '}';
    }

}
