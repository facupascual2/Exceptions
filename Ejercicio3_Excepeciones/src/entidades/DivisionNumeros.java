
package entidades;


public class DivisionNumeros {
    
   private int numA;
   private int numB;

    public DivisionNumeros() {
    }

    public DivisionNumeros(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    @Override
    public String toString() {
        return "DivisionNumeros{" + "numA=" + numA + ", numB=" + numB + '}';
    }
   
   
}
