import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {

        String n1;
        String n2;

        JOptionPane.showMessageDialog(null, "Esse é um programa simples de calculadora.");
        n1 = JOptionPane.showInputDialog("Qual operação você gostaria de realizar?"
        + "\n1 - Soma"
        + "\n2 - Subtração"
        + "\n3 - Multiplicação"
        + "\n4 - Divisão"
        );

        int numero1;
        numero1 = Integer.parseInt(n1);

        if (numero1 == 1) {
            n1 = JOptionPane.showInputDialog("Qual o primeiro numero?");
            n2 = JOptionPane.showInputDialog("Qual o segundo numero?");

            double numero11 = Double.parseDouble(n1);
            double numero22 = Double.parseDouble(n2);

            double resultado;
            resultado = numero11 + numero22;

            JOptionPane.showMessageDialog(null, "Resultado da soma = " + resultado);
        }

        if (numero1 == 2) {
            n1 = JOptionPane.showInputDialog("Qual o primeiro numero?");
            n2 = JOptionPane.showInputDialog("Qual o segundo numero?");

            double numero11 = Double.parseDouble(n1);
            double numero22 = Double.parseDouble(n2);

            double resultado;
            resultado = numero11 - numero22;

            JOptionPane.showMessageDialog(null, "Resultado da subtração = " + resultado);
        }

        if (numero1 == 3) {
            n1 = JOptionPane.showInputDialog("Qual o primeiro numero?");
            n2 = JOptionPane.showInputDialog("Qual o segundo numero?");

            double numero11 = Double.parseDouble(n1);
            double numero22 = Double.parseDouble(n2);

            double resultado;
            resultado = numero11 * numero22;

            JOptionPane.showMessageDialog(null, "Resultado da Multiplicação = " + resultado);
        }

        if (numero1 == 4) {
            n1 = JOptionPane.showInputDialog("Qual o primeiro numero?");
            n2 = JOptionPane.showInputDialog("Qual o segundo numero?");

            double numero11 = Double.parseDouble(n1);
            double numero22 = Double.parseDouble(n2);

            double resultado;
            resultado = numero11 / numero22;

            JOptionPane.showMessageDialog(null, "Resultado da divisão = " + resultado);
        }

    }
}