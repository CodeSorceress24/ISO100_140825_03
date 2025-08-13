package control;

public class control {

    public void processarVetor(int[] vetor) {
        for (int num : vetor) {
            if (num % 2 != 0) {
                System.out.printf("%d é ímpar.%n", num);
            } else if (num % 10 == 0) {
                System.out.printf("%d é par e múltiplo de 10.%n", num);
            }
        }
    }
}