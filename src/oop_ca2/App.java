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
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        
        // Menu
        int choice=0;
        do{

            System.out.println("\n");
            System.out.println("\n");
            System.out.println("***************************************************************");
            System.out.println("*****************The Farm Management System********************");
            System.out.println("\n");
            System.out.println("1. Add a farm");
            System.out.println("2. Add an animal to the farm");
            System.out.println("3. Edit, delete and print the detail of any animal");
            System.out.println("4. Add a shed to the farm");
            System.out.println("5. Edit, delete and print the detail of any shed");
            System.out.println("6. Print The details of the farm");
            System.out.println("7. Milk all animals on the farm");
            System.out.println("8. Allow for the death of an animal");
            System.out.println("9. Allow for a milk collection");
            System.out.println("10 Print the animals in each herd in order of value."); 
            System.out.println("11 Load from and store to a text file the farm, sheds and herds");
            System.out.println("12. Exit ");
            System.out.println("***************************************************************");
            System.out.println("\n");
            System.out.println("Please enter your choice: ");
    
        choice = sc.nextInt();

        }
        while(choice<1||choice>12);
        Farm f1 = new Farm();

        while(choice>0&&choice<12)
        {
            
            if (choice ==1){

                System.out.println("====================================");
                int farmId = (int) (Math.random() * 100 + 1);// generate farmId
                System.out.println("Enter the farm owner: ");
                String farmOwner = sc.next();
                int shedId = (int) (Math.random() * 100 + 1);//generate shedId

                System.out.println("\n");
                System.out.println("Enter the milk tank capacity: ");
                System.out.println("***less than 2000 litres");
                
                int milkTankCapacity = sc.nextInt();

                MilkTank milkTank = new MilkTank(milkTankCapacity);

                MilkingMachine milkingMachine = new MilkingMachine();//milking machine object creation
                milkingMachine.setMilkTank(milkTank);
                
                System.out.println("What animal would you like to add to the shed?");
                System.out.println("************************************************");
                System.out.println("1. BeefCow");
                System.out.println("2. Sheep");
                System.out.println("3. Goat");
                System.out.println("4. DairyCow");
                System.out.println("************************************************");

                int animalChoice = sc.nextInt();
                ArrayList <Animal> animals = new ArrayList<>();

                if (animalChoice == 1){

                    System.out.println("Enter BeefCow Name :");
                    String beefCowName = sc.next();
                    int beefCowId = (int) (Math.random() * 100 + 1);//generate beefcow id
                    System.out.println("Enter BeefCow weight");
                    int beefCowWeight = sc.nextInt();
                    System.out.println("Enter BeefCow age");
                    int beefCowAge = sc.nextInt();
                    System.out.println("Enter BeefCow pedigree");
                    String beefCowPedigree = sc.next();
                    //adding beef to animal
                    Animal beef = new BeefCow(beefCowName,beefCowId,beefCowWeight,beefCowAge,beefCowPedigree);
                    animals.add(beef);
                }

                else if (animalChoice == 2){
                    
                    System.out.println("Enter Sheep Name :");
                    String sheepName = sc.next();
                    int sheepId = (int) (Math.random() * 100 + 1);//generate sheepId id
                    System.out.println("Enter sheep weight");
                    int sheepWeight = sc.nextInt();
                    System.out.println("Enter sheep age");
                    int sheepAge = sc.nextInt();
                    System.out.println("Enter sheep pedigree");
                    String sheepPedigree = sc.next();
                    //adding sheep to animal
                    Animal sheep = new Sheep(sheepName,sheepId,sheepWeight,sheepAge,sheepPedigree);
                    animals.add(sheep);

                }

                else if (animalChoice == 3){

                    System.out.println("Enter Goat Name :");
                    String goatName = sc.next();
                    int goatId = (int) (Math.random() * 100 + 1);//generate goatId id
                    System.out.println("Enter sheep udder capacity");
                    int goatUdders = sc.nextInt();
                    //adding goat to animal
                    Animal goat = new Goats(goatName,goatId,goatUdders);
                    animals.add(goat);
                }

                else if (animalChoice ==4){

                    System.out.println("Enter DairyCow Name :");
                    String dairyCowName = sc.next();
                    int dairyCowId = (int) (Math.random() * 100 + 1);//generate dairyCowId id
                    System.out.println("Enter dairyCow udder capacity");
                    //adding dairyCowId to animal
                    DairyCow dairyCow = new DairyCow(dairyCowName,dairyCowId);
                    DairyCow.udderCapacity();
                    animals.add(dairyCow);

                }
                
                Shed shed = new Shed(shedId, animals);
                shed.installMilkingMachine(milkingMachine);
                ArrayList <Shed> sheds = new ArrayList<>();
                sheds.add(shed);

                f1 = new Farm(farmId, farmOwner, sheds);
                
                System.out.println("*************************************");

            }

            else if (choice == 2)
            {
                System.out.println("Enter Shed Id");
                int ShedId=sc.nextInt();
                System.out.println("Enter Animal Type:");
                System.out.println("1. Cow");
                System.out.println("2. Goat");
                System.out.println("3. Beef");
                System.out.println("4. Sheep");
                int AnimalChoice=sc.nextInt();
                
                int indexofshed = 0;
                for(int i = 0; i < f1.getShed().size() ; i ++)
                {
                    if(ShedId == f1.getShed().get(i).getId()){
                        indexofshed = i;
                    }
                }
                switch (AnimalChoice) {
                    case 1:
                            DairyCow cow = new DairyCow();
                            f1.getShed().get(indexofshed).addAnimal(cow);
                        break;
                    case 2:
                            Goats goats = new Goats();
                            f1.getShed().get(indexofshed).addAnimal(goats);
                            break;

                    case 3: BeefCow beefCow = new BeefCow();
                            f1.getShed().get(indexofshed).addAnimal(beefCow);
                            break;
                            
                    case 4: Sheep sheep = new Sheep();
                            f1.getShed().get(indexofshed).addAnimal(sheep);
                            break;

                    default:
                    break;
                }

                System.out.println("Successfully added an animal to the farm.");
              

            }

            else if (choice == 3)
            {
                System.out.println("-");
            }

            else if (choice == 4)
            {
                System.out.println("Enter Shed Id to be added");
                int shedIdRandom=sc.nextInt();
                f1.addNewShed(new Shed(shedIdRandom));
                
                System.out.println("Shed id "+shedIdRandom+" Successfully added shed to the farm.");
              
                
            }

            else if (choice == 5)
            {
                System.out.println("-");
            }

            else if (choice == 6)
            {
                System.out.println(f1);// print details of farm and animal
            }

            else if (choice == 7)
            {
                System.out.println("-");
            }

            else if (choice == 8)
            {
                System.out.println("-");
            }

            else if (choice == 9)
            {
                System.out.println("-");
            }

            else if (choice == 10)
            {
                System.out.println("-");
            }

            else if (choice == 11)
            {
                System.out.println("-");
            }
            
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("***************************************************************");
            System.out.println("*****************The Farm Management System********************");
            System.out.println("\n");
            System.out.println("1. Add a farm");
            System.out.println("2. Add an animal to the farm");
            System.out.println("3. Edit, delete and print the detail of any animal");
            System.out.println("4. Add a shed to the farm");
            System.out.println("5. Edit, delete and print the detail of any shed");
            System.out.println("6. Print The details of the farm");
            System.out.println("7. Milk all animals on the farm");
            System.out.println("8. Allow for the death of an animal");
            System.out.println("9. Allow for a milk collection");
            System.out.println("10 Print the animals in each herd in order of value."); 
            System.out.println("11 Load from and store to a text file the farm, sheds and herds");
            System.out.println("12. Exit ");
            System.out.println("***************************************************************");
            System.out.println("\n");
            System.out.println("Please enter your choice: ");
    
        choice = sc.nextInt();
        }
    }
}