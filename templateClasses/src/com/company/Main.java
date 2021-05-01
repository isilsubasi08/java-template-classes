package com.company;

import java.security.KeyStore;
import java.util.*;

public class Main{

    public static void main(String[] args) {

        //ArrayList<> generic kullanmak:
        ArrayList<String> a=new ArrayList<>();
        a.add("java");
        a.add("android");
        a.add("php");

        for(String obj: a){
            System.out.println(obj);
        }



        //Genericler kullanmadan önce bu şekilde kaydedip,ekranda gösterebiliriz.
        TreeMap ogr=new TreeMap();
        ogr.put(10,"Işılay");
        ogr.put(34,"Sevgi");
        ogr.put(45,"Abdullah");

        Set set=ogr.entrySet();
        Iterator i=set.iterator();


        while(i.hasNext()){
            Map.Entry item= (Map.Entry) i.next();
           // System.out.println(item.getKey()+"=>"+item.getValue());
        }

        //Genericler kullanarak;

        HashMap<Integer,String> c=new HashMap<>();
        c.put(1,"Sevgi");
        c.put(2,"ışılay");

        for(Integer key:c.keySet()){
            System.out.println("Key:"+key+"-value:"+c.get(key));
        }

        for(String value:c.values()){
            System.out.println(value);
        }


        Test<Integer> integerTest=new Test<>(15);
        System.out.println(integerTest.getObj());

        Test<String> s=new Test<>("sevgi");
        System.out.println(s.getObj());

        Test2<Integer,String> integerStringTest2=new Test2<>(14,"ışılay");
        integerStringTest2.print();


        //Generic metodu çağıralım

        Integer[] intArry={1,4,5,8,9};
        String[] strArry={"kod","dünyası"};
        Double[] dblArry={1.1,2.1,3.1};
        Character[] chrArry={'A','C','E'};

        Generics generics=new Generics();
        generics.genericMethod(intArry);
        generics.genericMethod(strArry);
        generics.genericMethod(dblArry);
        generics.genericMethod(chrArry);



    }




}
