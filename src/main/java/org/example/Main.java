package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        persona p1= new persona();
        p1.setNombre("juan");
        p1.setEdad("26");
        p1.setGenero("masculino");

        persona p2= new persona("juliana","19","femenino"  );

        System.out.println( p1.toString());
        System.out.println( p2.toString());


    }
}