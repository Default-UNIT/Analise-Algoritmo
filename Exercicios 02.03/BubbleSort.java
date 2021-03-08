import java.util.Arrays;

public class BubbleSort {

    //Função para aplicar o BubbleSort
    public static void Sort(int[] vetor) {
        //Ciação de variáveis para auxilar
        int aux, tamanho = vetor.length;
        boolean valorTrocar = false;

        for(int i = 1; i <= tamanho; i++) { // Laço de repetição
            if(i == tamanho) { //Se i igual ao tamanho do vetor:
                if(!valorTrocar) break; //Se a varariável "valorTroca" for VERDADEIRA, encerra o laço

                //Caso não esteja tudo OK!
                valorTrocar = false;
                i = 1;
            }

            if(vetor[i - 1] > vetor[i]) { //Caso o número esquerdo da lista seja maior que o da direita:
                aux = vetor[i - 1]; //Auxiliar receberá o número da esquerda
                vetor[i - 1] = vetor[i]; //Outra troca aacontece, agora o mesmo número da esquerda troca com o número da direita
                vetor[i] = aux; //Número da direita recebe o Auxiliar
                valorTrocar = true; //Troca a variável "valorTroca" para verdadeiro após a execução do IF
            }
        }
    }

    //Programa Principal
    public static void main(String[] args) {
            //Lista    0, 1, 2, 3, 4
        int[] vetor = {4, 3, 1, 5, 2};

        Sort(vetor); //Aplicando a Função criada para o BubbleSort
        System.out.println(Arrays.toString(vetor)); //Imprimindo a Lista já Ordenada
    }
}
