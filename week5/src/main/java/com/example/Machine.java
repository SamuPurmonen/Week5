/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example;


public class Machine {

    String type;
    String model;
    Worker operator;

    public Machine(String type, String model, Worker worker){
        this.type = type;
        this.model = model;
        this.operator = worker;
        

    }
    
    public Machine(){

    }

    public String getMachineDetails(){
    
    return type;
    }
}
