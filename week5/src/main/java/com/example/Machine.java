
package com.example;

public class Machine {

    String type;
    String model;
    Worker operator;

    public Machine(String type, String model, Worker worker) {
        this.type = type;
        this.model = model;
        this.operator = worker;

    }

    public Machine() {

    }

    public String getMachineDetails() {

        return type;
    }
}
