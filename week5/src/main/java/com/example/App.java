package com.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        

        
        



    System.out.println( "Anna tehtaalle nimi:" );
    Scanner sc = new Scanner(System.in);
    String Input = sc.nextLine();
    
    Factory factory = new Factory(Input);



    boolean exit = false;

    while(!exit){

        System.out.println("1) Lisää kone\r\n" + //
        "2) Listaa kaikki koneet\r\n" + //
        "0) Lopeta ohjelma");

        

        int i = 0;
        String stringInput = sc.nextLine();
        i = Integer.parseInt(stringInput);

        switch(i){
            case 1:
            System.out.println("Anna koneen tyyppi:");
            String machineType = sc.nextLine();

            System.out.println("Anna koneen malli:");
            String machineModel = sc.nextLine();

            System.out.println("Anna työntekijän nimi:");
            String workerName = sc.nextLine();

            System.out.println("Anna työntekijän ammattinimike:");
            String workerRole = sc.nextLine();

            Worker worker = new Worker(workerName, workerRole);
            

            Machine machine = new Machine(machineType, machineModel, worker);
           
            //luo työntekijäolio jolla nimi ja rooli
            
            //vie worker olio machinetypen ja machine modelin kanssa addmachine metodiin
            // talleenna arraylistiin

            
            
            factory.addMachine(machine);

            System.out.println("Kone lisätty!");
            break;

            
            case 2:
            factory.getMachines();

            System.out.println("Tehtaasta Metallitehdas löytyy seuraavat koneet:");
            for (int k = 0; k < factory.machines.size(); k++){
    
                System.out.println("Koneen tiedot: "+ factory.machines.get(k).type +", "+  factory.machines.get(k).model);
                System.out.println("Työntekijän tiedot: "+ factory.machines.get(k).operator.getWorkerName() + ", "+ factory.machines.get(k).operator.getWorkerRole());
                System.out.println("");
            }
            break;
            
            case 0:
            exit = true;
            System.out.println("Kiitos ohjelman käytöstä.");
            break;
            
            default:
            System.out.println("Syöte oli väärä.");
            break;
        }
        

    }


    }
}

