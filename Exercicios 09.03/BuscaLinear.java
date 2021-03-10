import javax.swing.*;

public class BuscaLinear {

    public static void linearSearchNumber(int[] listaNum, int numDigitado) {
        int i = 0;

        while(listaNum[i] != numDigitado) {
            i++;
        }
        if(listaNum[i] == numDigitado){
            JOptionPane.showMessageDialog(null, "O número "+ numDigitado + " está na posição: " + i);
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numDigitado + " não foi encontrado na Busca");
        }
    }

    public static void linearSearchString(String[] listaString, String strDigitada) {
        int i = 0;

        while(!listaString[i].equals(strDigitada)) {
            i++;
        }

        if(listaString[i].equals(strDigitada)) {
            JOptionPane.showMessageDialog(null, "A palavra "+ strDigitada + " está na posição: " + i);
        } else {
            JOptionPane.showMessageDialog(null, "A palavra " + strDigitada + " não foi encontrado na Busca");
        }

    }

    public static void main(String[] args) {
        int opc;

        int[] listaNum = new int[5];
        String[] listaString = new String[5];
        Object[] options = {"Número", "String"};

        opc = JOptionPane.showOptionDialog(null, "Escolha o tipo de lista que deseja criar:", "Panelinha",
                JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);

        switch (opc){
            case 0:

                for(int i = 0; i < 5; i++) {
                    listaNum[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) +"/5 número: "));
                }
                int numDigitado = Integer.parseInt(JOptionPane.showInputDialog("Qual número deseja Buscar: "));

                linearSearchNumber(listaNum, numDigitado);

                break;

            case 1:

                for(int i = 0; i < 5; i++) {
                    listaString[i] = JOptionPane.showInputDialog("Digite a " + (i+1) +"/5 palavra: ");
                }
                String strDigitada = JOptionPane.showInputDialog("Qual palavra deseja Buscar: ");

                linearSearchString(listaString, strDigitada);

                break;
        }
    }
}
