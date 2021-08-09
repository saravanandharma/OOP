package com.oop;

public abstract class ComputerBuilder {

    public final void buidComputer(){
        addProcessor();
        addMemory();
    }

    public abstract void addMemory();

    public abstract void addProcessor();
}
