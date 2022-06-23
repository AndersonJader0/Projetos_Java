public class Pessoa {

    public String nome;
    public int idade;
    public double altura;
    public int peso;


    public Pessoa(String nome, int idade, double altura, int peso) {

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;

    }

    public double calAltura () {
        return altura * altura;
    }

    public double calculate () {
        return peso / calAltura();
    }

}