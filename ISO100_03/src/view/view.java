package view;

import control.control;
import javax.swing.JOptionPane;

public class view {

    public static void main(String[] args) {
        control control = new control();
        
        int tamanho;
        while (true) {
            String entrada = JOptionPane.showInputDialog("Digite o tamanho do vetor (máximo 100):");
            try {
                tamanho = Integer.parseInt(entrada);
                if (tamanho > 0 && tamanho <= 100) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um valor entre 1 e 100.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
            }
        }
        
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            while (true) {
                String entrada = JOptionPane.showInputDialog("Digite o valor para a posição " + i + ":");
                try {
                    vetor[i] = Integer.parseInt(entrada);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número inteiro.");
                }
            }
        }
        
        control.processarVetor(vetor);
    }
}