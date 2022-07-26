import javax.swing.JOptionPane;

public class Calculaterplus {
    public static void main(String[] args) {
        String n1;
        String n2;
        String n6;

        n1 = JOptionPane.showInputDialog("Qual operação você gostaria de realizar?"
        + "\n1 - Simples"
        + "\n2 - IMC"
        );

        int numero1 = Integer.parseInt(n1);

        if (numero1 == 1) {
            JOptionPane.showMessageDialog(null, "Esse é um programa simples de calculadora.");
        n6 = JOptionPane.showInputDialog("Qual operação você gostaria de realizar?"
        + "\n1 - Soma"
        + "\n2 - Subtração"
        + "\n3 - Multiplicação"
        + "\n4 - Divisão"
        );



        int numero01 = Integer.parseInt(n6);

        if (numero01 == 1) {
            n1 = JOptionPane.showInputDialog("Qual o primeiro numero?");
            n2 = JOptionPane.showInputDialog("Qual o segundo numero?");

            double numero11 = Double.parseDouble(n1);
            double numero22 = Double.parseDouble(n2);

            double resultado;
            resultado = numero11 + numero22;

            JOptionPane.showMessageDialog(null, "Resultado da soma = " + resultado);
        }

        if (numero01 == 2) {
            n1 = JOptionPane.showInputDialog("Qual o primeiro numero?");
            n2 = JOptionPane.showInputDialog("Qual o segundo numero?");

            double numero11 = Double.parseDouble(n1);
            double numero22 = Double.parseDouble(n2);

            double resultado;
            resultado = numero11 - numero22;

            JOptionPane.showMessageDialog(null, "Resultado da subtração = " + resultado);
        }

        if (numero01 == 3) {
            n1 = JOptionPane.showInputDialog("Qual o primeiro numero?");
            n2 = JOptionPane.showInputDialog("Qual o segundo numero?");

            double numero11 = Double.parseDouble(n1);
            double numero22 = Double.parseDouble(n2);

            double resultado;
            resultado = numero11 * numero22;

            JOptionPane.showMessageDialog(null, "Resultado da Multiplicação = " + resultado);
        }

        if (numero01 == 4) {
            n1 = JOptionPane.showInputDialog("Qual o primeiro numero?");
            n2 = JOptionPane.showInputDialog("Qual o segundo numero?");

            double numero11 = Double.parseDouble(n1);
            double numero22 = Double.parseDouble(n2);

            double resultado;
            resultado = numero11 / numero22;

            JOptionPane.showMessageDialog(null, "Resultado da divisão = " + resultado);
        }

    }
    if (numero1 == 2) {

            String n3;
            String n4;
            String n5;
    
    
            JOptionPane.showMessageDialog(null, "Esse é um programinha para calcular o IMC - (Índice de Massa Corporal).");
            
            n1 = JOptionPane.showInputDialog("Digite o nome");
            n2 = JOptionPane.showInputDialog("Digite o sexo");
            n3 = JOptionPane.showInputDialog("Digite a idade");
            n4 = JOptionPane.showInputDialog("Digite a altura em metros");
            n5 = JOptionPane.showInputDialog("Digite o peso em kg");
    
            double numero001 = Double.parseDouble(n4);
            double numero002 = Double.parseDouble(n5);
    
            double alturax = numero001 * numero1;
            double resultado = numero002 / alturax;
    
            String calc;
            calc = "O IMC é = "+resultado;
    
            if (resultado <= 18.5) {
    
                String classificacaoIMC = "Classificação: Magreza";
    
                JOptionPane.showMessageDialog(null, "Dados"
                + "\nNome: " + n1
                + "\nSexo: " + n2
                + "\nIdade: " + n3
                + "\n" + calc
                + "\n" + classificacaoIMC
                );
            }
            if (resultado >= 25) {
    
                String classificacaoIMC = "Classificação: Obesidade";
    
                JOptionPane.showMessageDialog(null, "Dados"
                + "\nNome: " + n1
                + "\nSexo: " + n2
                + "\nIdade: " + n3
                + "\n" + calc
                + "\n" + classificacaoIMC
                );
            }
            if (resultado <= 25 && resultado >=18.5) {
    
                String classificacaoIMC = "Classificação: Normal";
    
    
                JOptionPane.showMessageDialog(null, "Dados"
                + "\nNome: " + n1
                + "\nSexo: " + n2
                + "\nIdade: " + n3
                + "\n" + calc
                + "\n" + classificacaoIMC
                );
            }
        }
    }

}
