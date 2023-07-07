package servicio;

import entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public Persona crearPersona() {
        System.out.println("-------------------");
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona:");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo de la persona (H/M):");
        char sexo;
        do {
            sexo = leer.next().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        System.out.println("Ingrese el peso de la persona:");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona:");
        persona.setAltura(leer.nextDouble());
        System.out.println("-------------------");
        return persona;
        
    }

  
    public boolean esMayor(Persona persona) {
        return persona.getEdad() >= 18;
    }

    
    public int calcularIMC(Persona persona) {
        double pesoIdeal = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        int retorno;
        if (pesoIdeal < 20) {
            retorno = -1;
        } else if (pesoIdeal <= 25) {
            retorno = 0;
        }else{
            retorno = 1;
        }
        return retorno;
    }
    
}