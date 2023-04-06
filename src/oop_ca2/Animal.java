/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca2;

/**
 *
 * @author Sejal Sali
 */
abstract class Animal 
{
    private String name;
    private int id;
    private static int idcount = 1;

    //constructors
    public Animal(String name) 
    {
        this.name = name;
        this.id = idcount;
        idcount++;  
    }

    public Animal() 
    {

    }

    //getters and setters
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    //toString
    @Override
    public String toString() 
    {
        return "Animal{" + "name=" + name + ", id=" + id + '}';
    }
}