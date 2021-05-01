package com.company;

public class Test <T>{
    T obj;

    //Constructor
    Test(T obj){
        this.obj=obj;
    }

    //get metodu
    public T getObj(){
        return this.obj;
    }

}
