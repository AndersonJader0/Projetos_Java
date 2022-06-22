public class IMC {
    public double altura;
    public int peso;


    public IMC(double altura, int peso) {

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