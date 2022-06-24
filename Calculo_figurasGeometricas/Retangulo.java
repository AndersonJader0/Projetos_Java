public class Retangulo {
    private double lado1;
    private double lado2;

    public Retangulo(){
    }

    public Retangulo(double lado1, double lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double calculodearea () {
        return this.lado1 * this.lado2;
    }
    public double calculodemetade1perimetro() {
        return this.lado1 * 2;
    }
    public double calculometade2perimetro() {
        return this.lado2 * 2;
    }
    public double calculototalperimetro() {
        return calculodemetade1perimetro() + calculometade2perimetro(); 
    }

}