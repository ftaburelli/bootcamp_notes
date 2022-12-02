import javax.swing.*;

public class ForEach {
    public static void main(String[] args) {
        //String [] nombres = {"Flor", "Juan", "Carlos", "Nicolas", "Lucas"};
        String [] paises = new String[2];

        // La opción javax.swing.* y el siguiente bucle, genera un input para agregar los elementos de la matriz.
        for (int i = 0; i < paises.length; i++) {
            paises[i]= JOptionPane.showInputDialog("Introduce pais " + (i + 1));
        }

        // Se declara una variable del mismo tipo que la matriz
        for (String elemento : paises) {
            System.out.println("Nombre " + elemento );
        }
    }
}
