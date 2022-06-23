import javax.swing.JOptionPane;

    public class Imc  {

        public static void main(String[] args) {

        String n1;
        String n2;
        String n3;
        String n4;


        JOptionPane.showMessageDialog(null, "Esse é um programinha para calcular o IMC");
        
        n1 = JOptionPane.showInputDialog("Digite o nome");
        n2 = JOptionPane.showInputDialog("Digite a idade");
        n3 = JOptionPane.showInputDialog("Digite a altura em metros");
        n4 = JOptionPane.showInputDialog("Digite o peso em kg");


        double numero1 = Double.parseDouble(n3);
        double numero2 = Double.parseDouble(n4);

        double alturax = numero1 * numero1;
        double resultado = numero2 / alturax;

        String calc;
        calc = "O IMC é = "+resultado;

        JOptionPane.showMessageDialog(null, calc);

        JOptionPane.showMessageDialog(null, "Dados"
        + "\nNome: " + n1
        + "\nIdade: " + n2
        + "\n" + calc
        );
    }

}

