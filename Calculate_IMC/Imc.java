import javax.swing.JOptionPane;

    public class Imc  {

        public static void main(String[] args) {

        String n1;
        String n2;

        n1 = JOptionPane.showInputDialog("Digite a altura");
        n2 = JOptionPane.showInputDialog("Digite o peso");


 
        double numero1 = Double.parseDouble(n1);
        double numero2 = Double.parseDouble(n2);

        double alturax = numero1 * numero1;
        double resultado = numero2 / alturax;

        String calc;
        calc = "O IMC é = "+resultado;

        JOptionPane.showMessageDialog(null, calc);
    }

}

