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

}



    





}
