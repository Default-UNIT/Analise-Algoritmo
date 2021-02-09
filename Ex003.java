import java.util.Scanner;
import java.util.Arrays;

public class Ex003 {

    private static int j;

    public static void main(String[] args) {

        int[] vetor = new int[7];
        int[] auxVetor = new int[7];

        int x = 7;

        Scanner input = new Scanner(System.in);

        for(int cont = 0; cont < vetor.length; cont++) {
            System.out.print("Digite o " + (cont+1) + "º número: ");
            vetor[cont] = input.nextInt();
        }

        for(int i = 0; i < auxVetor.length; i++ ) {
            x--;
            auxVetor[i] = vetor[x];
        }

        System.out.println(Arrays.toString(auxVetor));
    }
}
