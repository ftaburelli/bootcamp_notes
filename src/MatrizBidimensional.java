public class MatrizBidimensional {
    public static void main(String[] args) {

        int [][] matrix = {{1,32},{321,4}, {56,78}};  //new int[3][2] --> matrix[0][1] == 32
        // Posiciones =  {[0][0],[0][1]}, {[1][0],[1][1]}, {[2][0],[2][1]}
        int [][] unidad = new int[2][3]; // CUANTOS elementos va a tener cada (fila, columna)

        unidad[0][0] = 32;
        unidad[0][1] = 12;
        unidad[0][2] = 45;

        unidad[1][0] = 98;
        unidad[1][1] = 87;
        unidad[1][2] = 21;

        // Carga de una matriz con dos bucles

       /* for (int i = 0; i < ; i++) {

        }*/

        // Recorrido de matriz
       /* for (int i = 0; i < 2; i++) {  // El primer bucle se encarga de recorrer las FILAS (la primera dimension)
            System.out.println();
            for (int j = 0; j < 3; j++) { // Recorre todas las COLUMNAS, hasta completar la FILA i.
                System.out.print(unidad[i][j] + " ");
                *//*
                En la primer vuelta de i=0 --> (i=0, j=0) 32, (i=0, j=1) 12, (i=0, j=2) 45
                En la segunda vuelta de i=1 --> (i=1, j=0) 98, (i=1, j=1) 87, (i=1, j=2) 21
                *//*
            }
        }*/

        // Recorrido de matriz con ForEach

        for (int[] fila :matrix) {  // Se declara un array de tipo 'entero', su nombre, y el nombre del array
            for (int z : fila) {  // Declaramos un elemento de tipo 'entero' z, y recorremos el array declarado anteriormente ('fila')
                System.out.println(z + " ");
            }
        }

        //  System.out.println(unidad[1][2]);
        //  System.out.println(matrix[1][2]);
    }
}
