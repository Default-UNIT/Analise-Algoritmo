import java.util.Scanner;

public class Ex005 {
    
    public static void main(String[] args) {

        int[] vetor = new int[7];

        double cont = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º num: ");
            vetor[i] = input.nextInt();

            if(vetor[i] % 2 == 0) {
                cont ++;
            }
        }

        System.out.printf("%.2f por cento%n", (cont / 7) * 100);
    }
}
