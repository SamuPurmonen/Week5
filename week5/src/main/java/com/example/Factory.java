package com.example;

import java.util.ArrayList;


public class Factory {

    

String name;
ArrayList<Machine> machines = new ArrayList<>();

public Factory(Machine machine, Worker worker){

}

public Factory(String name){
    this.name = name;

}


public void addMachine(Machine machine) {
    
    machines.add(machine);

}

public ArrayList<Machine> getMachines(){
    
    return machines;
}

public String getName(){
    return this.name;
}

}