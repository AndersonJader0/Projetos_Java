public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João Victor", 19, 1.80, 80);

        System.out.println("Calculo do IMC");
        System.out.println("Nome " + pessoa1.nome);
        System.out.println("Idade " + pessoa1.idade);
        System.out.println("IMC " + pessoa1.calculate());
    }
   
}
