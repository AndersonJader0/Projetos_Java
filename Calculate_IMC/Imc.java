import javax.swing.JOptionPane;

    public class Imc  {

        public static void main(String[] args) {

        String n1;
        String n2;
        String n3;
        String n4;
        String n5;


        JOptionPane.showMessageDialog(null, "Esse é um programinha para calcular o IMC");
        
        n1 = JOptionPane.showInputDialog("Digite o nome");
        n2 = JOptionPane.showInputDialog("Digite o sexo");
        n3 = JOptionPane.showInputDialog("Digite a idade");
        n4 = JOptionPane.showInputDialog("Digite a altura em metros");
        n5 = JOptionPane.showInputDialog("Digite o peso em kg");


        double numero1 = Double.parseDouble(n4);
        double numero2 = Double.parseDouble(n5);

        double alturax = numero1 * numero1;
        double resultado = numero2 / alturax;

        String calc;
        calc = "O IMC é = "+resultado;

        JOptionPane.showMessageDialog(null, calc);

        JOptionPane.showMessageDialog(null, "Dados"
        + "\nNome: " + n1
        + "\nSexo: " + n2
        + "\nIdade: " + n3
        + "\n" + calc

        );
    }

}

