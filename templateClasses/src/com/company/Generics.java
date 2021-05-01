package com.company;

public class Generics {

    //Generic Method
    public <E> void genericMethod(E[] arr){

        for(E item:arr){
            System.out.println(item);
        }

    }

}
