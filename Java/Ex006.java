import java.util.Scanner;
import java.util.Arrays;

public class Ex006 {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[7];
        int[] auxVetor = new int[7];

        int tamanho = vetor.length;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º num: ");
            vetor[i] = input.nextInt();
        }

        Arrays.sort(vetor);

        for(int cont = 0; cont < vetor.length; cont++) {
            tamanho--;
            auxVetor[cont] = vetor[tamanho];
        }

        System.out.println(Arrays.toString(auxVetor));
    }
}
