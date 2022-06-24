public class Main {
    public static void main(String[] args) {

        Engenheiro engenheiro1 = new Engenheiro("Fulano", 25);

        Retangulo retangulo1 = new Retangulo(17.5, 17.7);

        System.out.println("--------Dados do engenheiro--------");
        System.out.println("Nome: " + engenheiro1.getNome());
        System.out.println("Idade: " + engenheiro1.getIdade());
        
        System.out.println("--------Calculos do retangulo------");
        System.out.println("O calculo da area = " + retangulo1.calculodearea());
        System.out.println("O calculo do perimetro = " + retangulo1.calculototalperimetro());
    }
}
