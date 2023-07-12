
package main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
        
            System.out.println("Ingrese un numero:");
            String numString = leer.next();
            int num = Integer.parseInt(numString);
            System.out.println("Numero: "+num);
            
        } catch (InputMismatchException e) {
            System.out.println("Error: el dato ingresado no coincide con el requerido(int). " + e);
        } catch (NumberFormatException e) {
            System.out.println("Error: el dato ingresado no puede ser convertido a un entero. " + e);
        } catch (ArithmeticException e) {
            System.out.println("Error: la division no se puede realizar. " + e);
        }

    }
}
