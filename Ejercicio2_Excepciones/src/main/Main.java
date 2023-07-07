
package main;

import entidades.Puerto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Puerto puerto = new Puerto();
        
        puerto.setNombrePuerto("BS AS");
        String[] aux = new String[3];
        for (int i = 0; i < 3; i++) {
            aux[i] = "Barco "+i;
        }
        puerto.setNombresBarcos(aux);
        
        System.out.println("Puerto: "+puerto.getNombrePuerto());
        for (int i = 0; i < 3; i++) {
          System.out.println(puerto.getNombresBarcos()[i]);  
        }
        
        System.out.println("Indique la posicion del puerto que desea consultar?");
        int posicion = leer.nextInt();
        
        try{
            System.out.println("Barco: "+puerto.getNombresBarcos()[posicion]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("La posicion indicada es errónea");
        }
    }
}
