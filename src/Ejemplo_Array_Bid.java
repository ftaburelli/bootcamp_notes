public class Ejemplo_Array_Bid {
    public static void main(String[] args) {
        double acumulado;
        double interes = 0.10;

        double [][] saldo = new double[6][5];
        for (int i = 0; i < 6; i++) {

            saldo[i][0] = 10000;
            acumulado = 10000;

            for (int j = 1; j < 5; j++) {
                acumulado = acumulado + (acumulado * interes);
                saldo[i][j] = acumulado;
            }
            interes = interes + 0.1;
        }
        for (int k = 0; k < 6; k++) {
            System.out.println();
            for (int l = 0; l < 5; l++) {
                System.out.print(saldo[k][l] + " ");
            }
        }

    }
}
