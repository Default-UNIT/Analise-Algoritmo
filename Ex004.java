import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {

        int[] vetor = new int[7];

        int maiorElemento = 0;
        int menorElemento = 999999999;


        Scanner input = new Scanner(System.in);

        for(int cont = 0; cont < vetor.length; cont++) {
            System.out.print("Digite o " + (cont+1) + "º num: ");
            vetor[cont] = input.nextInt();

            if(vetor[cont] > maiorElemento) {
                maiorElemento = vetor[cont];
            } 
            if(vetor[cont] < menorElemento) {
                menorElemento = vetor[cont];
            }
        }

        System.out.println(maiorElemento + "-" + menorElemento);
    }
}
