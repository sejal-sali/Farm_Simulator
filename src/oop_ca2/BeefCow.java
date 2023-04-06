/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca2;

/**
 *
 * @author Sejal Sali
 */
public class BeefCow extends Animal 
{
    private int weight;
    private int age;
    private String pedigree;

    //constructors
    public BeefCow(String name, int id, int weight, int age, String pedigree) 
    {
        super(name);
        this.weight = weight;
        this.age = age;
        this.pedigree = pedigree;
    }

    public BeefCow() 
    {

    }

    //getters and setters
    public int getWeight() 
    {
        return weight;
    }

    public void setWeight(int weight) 
    {
        this.weight = weight;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getPedigree() 
    {
        return pedigree;
    }

    public void setPedigree(String pedigree) 
    {
        this.pedigree = pedigree;
    }

    //toString
    @Override
    public String toString() {
        return "BeefCow{" + "weight=" + weight + ", age=" + age + ", pedigree=" + pedigree + '}';
    }

}