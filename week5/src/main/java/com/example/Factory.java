package com.example;

import java.util.ArrayList;


public class Factory {

    

String name;
ArrayList<Machine> machineList = new ArrayList<>();

public Factory(Machine machine, Worker worker){

}

public Factory(String name){
    this.name = name;

}

public void addMachine(Machine machine) {
    
    machineList.add(machine);

}

public void getMachines(){
    for (int i = 0; i < machineList.size(); i++){
    
    System.out.println("Tehtaasta Metallitehdas löytyy seuraavat koneet:");
    System.out.println("Koneen tiedot: "+ machineList.get(i).type +", "+  machineList.get(i).model);
    System.out.println("Työntekijän tiedot: "+ machineList.get(i).operator.getWorkerName() + ", "+ machineList.get(i).operator.getWorkerRole());
    System.out.println("");
}

}
}