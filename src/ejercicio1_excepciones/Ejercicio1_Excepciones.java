
package ejercicio1_excepciones;

import entidades.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;

public class Ejercicio1_Excepciones {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = new Persona("Jorge", 16, 'M', 88, 175);
        Persona p2 = null;
        
        try{
        System.out.println("La Persona 1 Es mayor de edad?: "+ps.esMayor(p1));
        System.out.println("La Persona 2 Es mayor de edad?: "+ps.esMayor(p2));
        }catch(Exception e){
            System.out.println("Persona Vacia");
        }
    }
    
}
