package main;

import entidades.DivisionNumeros;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            DivisionNumeros dv = new DivisionNumeros();

            System.out.println("Ingrese primer nro");
            String stringA = leer.next();
            System.out.println("Ingrese segundo nro");
            String stringB = leer.next();
            
            dv.setNumA(Integer.parseInt(stringA));
            dv.setNumB(Integer.parseInt(stringB));
            System.out.println(dv);
 
     int division = dv.getNumA() / dv.getNumB();
     System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Error Aritmetico: " + e);
        } catch (Exception e) {
            System.out.println("Error General: " + e);
        }
    }
}
