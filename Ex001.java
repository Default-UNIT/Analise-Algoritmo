import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        int[] vetor = new int[7];

        int somarPar = 0;
        int somarImpar = 0;

        Scanner input = new Scanner(System.in);

        for(int cont = 0; cont < vetor.length; cont++) {
            System.out.print("Digite o " + (cont+1) + "º número: ");
            vetor[cont] = input.nextInt();

            if(cont % 2 == 0) {
                somarPar += vetor[cont];
            } else {
                somarImpar += vetor[cont];
            }
        }

        System.out.println(somarPar + "-" + somarImpar);
    }
}
