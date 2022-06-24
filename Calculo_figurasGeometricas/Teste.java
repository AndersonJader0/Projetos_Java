
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {

        String n0;
        String n1;
        String n2;
        String n3;

        n0 = JOptionPane.showInputDialog("Qual figura geométrica você gostaria de calcular?"
        + "\n1 - Quadrado"
        + "\n2 - Retangulo"
        + "\n3 - Triangulo"
        + "\n4 - Circulo"
        );

        int numero0 = Integer.parseInt(n0);

        if (numero0 == 1) {

        n1 = JOptionPane.showInputDialog("O que você gostaria de calcular?"
        + "\n1 - Área"
        + "\n2 - Perimetro"
        );

        int numero1 = Integer.parseInt(n1);

        if (numero1 == 1) {
        
        n2 = JOptionPane.showInputDialog("Qual a largura do quadrado?");
        n3 = JOptionPane.showInputDialog("Qual a altura do quadrado?");

        double numero2 = Double.parseDouble(n2);

        double calculoArea;
        calculoArea = numero2 * numero2;

        String calc;
        calc = "Área do quadrado é = " + calculoArea;


        JOptionPane.showMessageDialog(null, calc);
        }

        if (numero1 == 2) {
            n2 = JOptionPane.showInputDialog("Qual o valor de um dos lados do quadrado?");

        double numero2 = Double.parseDouble(n2);

        double calculoP;
        calculoP = numero2 * 4;



        String calc;
        calc = "Perimetro do quadrado é = " + calculoP;



        JOptionPane.showMessageDialog(null, calc);
        }
    }
        
        if (numero0 == 2) {

            n1 = JOptionPane.showInputDialog("O que você gostaria de calcular?"
            + "\n1 - Área"
            + "\n2 - Perimetro"
            );
    
            int numero11 = Integer.parseInt(n1);
    
            if (numero11 == 1) {
            
            n2 = JOptionPane.showInputDialog("Qual a largura do Retangulo?");
            n3 = JOptionPane.showInputDialog("Qual a altura do Retangulo");
    
            double numero2 = Double.parseDouble(n2);
            double numero3 = Double.parseDouble(n3);

    
            double calculoArea;
            calculoArea = numero2 * numero3;

    
            String calc;
            calc = "Área do Retangulo é = " + calculoArea;
    
    
            JOptionPane.showMessageDialog(null, calc);
            }
            if (numero11 == 2) {
                n2 = JOptionPane.showInputDialog("Qual a largura do Retangulo?");
                n3 = JOptionPane.showInputDialog("Qual a altura do Retangulo");
        
                double numero2 = Double.parseDouble(n2);
                double numero3 = Double.parseDouble(n3);
    
        
                double calculoP;
                calculoP = numero2 + numero2;

                double calculoP2;
                calculoP2 = numero3 + numero3;

                double resultado;
                resultado = calculoP + calculoP2;

            
                String calc;
                calc = "Perimetro do Retangulo é = " + resultado;
        
        
                JOptionPane.showMessageDialog(null, calc);
            }
    }
        if (numero0 ==3){

            n0 = JOptionPane.showInputDialog("Qual triangulo você gostaria de calcular?"
            + "\n1 - Escaleno"
            + "\n2 - Isosceles"
            + "\n3 - Equilatero"
            );

            int numero1 = Integer.parseInt(n0);

                if (numero1 == 3) {
                n1 = JOptionPane.showInputDialog("O que você gostaria de calcular?"
                + "\n1 - Área"
                + "\n2 - Perimetro"
                );
    
                int numero111 = Integer.parseInt(n1);
    
                    if (numero111 == 1) {
            
                    n2 = JOptionPane.showInputDialog("Qual o valor de um dos lados?");
                    n3 = JOptionPane.showInputDialog("Qual a altura do triangulo?");
    
                    double numero2 = Double.parseDouble(n2);
                    double numero3 = Double.parseDouble(n3);

    
                    double calculoAreaQ;
                    calculoAreaQ = numero2 * numero3;
            
                    double calculoAreaT;
                    calculoAreaT = calculoAreaQ / 2;

    
                    String calc;
                    calc = "Área do triangulo é = " + calculoAreaT;
    
    
                    JOptionPane.showMessageDialog(null, calc);
                    }

                    if (numero111 == 2) {

                    n2 = JOptionPane.showInputDialog("Qual o valor de um dos lados do triangulo?");

                    double numero = Double.parseDouble(n2);
            
                    double calculoP;
                    calculoP = numero * 3;

                    String calc;
                    calc = "perimetro do triangulo é = " + calculoP;
    
    
                    JOptionPane.showMessageDialog(null, calc);
                    }
                }
        if (numero1 == 2) {
            n1 = JOptionPane.showInputDialog("O que você gostaria de calcular?"
            + "\n1 - Área"
            + "\n2 - Perimetro"
            );

            int numero = Integer.parseInt(n1);

                if (numero == 1) {

                n2 = JOptionPane.showInputDialog("O triangulo:"
                + "\n1 - Possui o valor da base e um dos lados."
                + "\n2 - Possui o valor de dois lados mas não da base."
                );
                int numero11 =  Integer.parseInt(n2);

                    if (numero11 == 1) {
                    n2 = JOptionPane.showInputDialog("Informe o valor de um lado do triangulo.");
                    n3 = JOptionPane.showInputDialog("Informe o valor de outro lado do triangulo.");
    
                    double numero2 = Double.parseDouble(n2);
                    double numero3 = Double.parseDouble(n3);

                    double calculo1;
                    calculo1 = numero2 / numero2;

                    double calculo2;
                    calculo2 = calculo1 * calculo1;
                    double calculo3;
                    calculo3 = numero3 * numero3;

                    double calculo4;
                    calculo4 = calculo2 + calculo3;

                    double calculo5;
                    calculo5 = Math.sqrt(calculo4);

                    double calculo6;
                    calculo6 = calculo5 + calculo5 + numero3;

                    String calc;
                    calc = "Perimetro do triangulo é = " + calculo6;

                    JOptionPane.showMessageDialog(null, calc);


            }
                    if (numero11 == 2) {
                    n2 = JOptionPane.showInputDialog("Informe o valor de um lado do triangulo.");
                    n3 = JOptionPane.showInputDialog("Informe o valor de outro lado do triangulo.");

                    double numero11111 = Double.parseDouble(n2);
                    double numero11112 = Double.parseDouble(n3);

                    double calculo1;
                    calculo1 = numero11111 * numero11111;
                    double calculo2;
                    calculo2 = numero11112 * numero11112;

                    double calculo3;
                    calculo3 = calculo1 - calculo2;

                    double calculo4;
                    calculo4 = Math.sqrt(calculo3);

                    double calculo5;
                    calculo5 = calculo4 + numero11111 + numero11112;

                    String calc;
                    calc = "O perimetro do triangulo é = " + calculo5;

                    JOptionPane.showMessageDialog(null, calc);
            }
        }

    if (numero == 2) {
        n2 = JOptionPane.showInputDialog("O triangulo:"
        + "\n1 - Possui o valor da base e um dos lados."
        + "\n2 - Possui o valor de dois lados mas não da base."
        );
        
        int numeroo = Integer.parseInt(n2);

        if (numeroo == 1) {
            n2 = JOptionPane.showInputDialog("Informe o valor da base do triangulo.");
            n3 = JOptionPane.showInputDialog("Informe o valor do lado do triangulo.");

            double numerooo = Double.parseDouble(n2);
            double numeroo2 = Double.parseDouble(n3);

            double calculo1;
            calculo1 = numerooo + numerooo + numeroo2;
  
            String calc;
                    calc = "O perimetro do triangulo é = " + calculo1;

                    JOptionPane.showMessageDialog(null, calc);
                 }
        if (numeroo == 2) {
            n2 = JOptionPane.showInputDialog("Informe o valor de um lado do triangulo.");
            n3 = JOptionPane.showInputDialog("Informe o valor de outro lado do triangulo.");

            double numerooo = Double.parseDouble(n2);
            double numeroo2 = Double.parseDouble(n3);

            double calculo1;
            calculo1 = numerooo * numerooo;

            double calculo2;
            calculo2 = numeroo2 * numeroo2;

            double calculo3;
            calculo3 = calculo2 - calculo1;

            double calculo4;
            calculo4 = Math.sqrt(calculo3);

            double calculo5;
            calculo5 = calculo4 + numerooo + numeroo2;

            String calc;
            calc = "O perimetro do triangulo é = " + calculo5;

            JOptionPane.showMessageDialog(null, calc);
        }
    }
    }
       
            if (numero0 ==4){
                
                n1 = JOptionPane.showInputDialog("O que você gostaria de calcular?"
                + "\n1 - Circunferencia"
                + "\n2 - Área"
                );
        
                int numero1111 = Integer.parseInt(n1);
        
                if (numero1111 == 2) {
                
                n2 = JOptionPane.showInputDialog("Qual o raio da circunferência?");
        
                double numero2 = Double.parseDouble(n2);   

                double PI;
                PI = 3.14;

                double D;
                D = numero2 * numero2;
                
                double A;
                A = PI * D;
        
                String calc;
                calc = "Área do circulo é = " + A;
        
        
                JOptionPane.showMessageDialog(null, calc);
                }

                if (numero1111 == 1) {
                    n2 = JOptionPane.showInputDialog("Qual o raio da circunferência?");
        
                double numero2 = Double.parseDouble(n2);   

                double D;
                 D = numero2 * 2;

                double Pi;
                Pi = 3.14;

                double C;
                C = Pi * D;

                String calc;
                calc = "O perimetro da circunferência é = " + C;
        
                JOptionPane.showMessageDialog(null, calc);
                }
        }
}
}
}
