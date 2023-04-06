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

public class Shed
{
    private int id;
    private ArrayList<Animal> animals;

    MilkingMachine milkingMachine;
    Milkable milkable;
    

    //constructors
    public Shed(int id, ArrayList<Animal> animals) 
    {
        this.id = id;
        this.animals = animals;
    }

    public Shed(int id) {
        this.id=id;
        this.animals=new ArrayList<Animal>();
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal a){
        this.animals.add(a);    
    }

    public Animal getAnimal(int index){

        return this.animals.get(index);

    }

    //returns the shed’s milk tank
    public MilkingMachine getMilkTank() 
    {
        return milkingMachine;
    }

    //installs and connects a milking machine to the shed’s milk tank
    //creates a milking machine 
    public void installMilkingMachine(MilkingMachine milkingMachine) {
        this.milkingMachine = milkingMachine;
    }

    //public void milkAnimal(Animal animal) milks the animal with the milking machine
    public void milkAnimal(Animal animal) {
        if (animal instanceof Milkable) {//check if animal is milkable
            milkingMachine.milk((Milkable) animal); // casting animal to milkable
        } else {
            throw new IllegalStateException("Animal is not milkable");
        }
    }


    //milking all the animals in the shed
    public void milkAnimal(ArrayList<Animal> animals) { 
        for (Animal animal : animals) { 
            if (animal instanceof Milkable) { // check if animal is milkable
                milkingMachine.milk((Milkable) animal);
            } else {
                throw new IllegalStateException("Animal is not milkable");
            }
        }
    }
    

    //toString
    @Override
    public String toString() {
        return "Shed{" + "id=" + id + ", animals=" + animals + '}';
    }
}
    