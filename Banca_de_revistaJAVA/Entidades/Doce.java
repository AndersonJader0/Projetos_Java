package Entidades;

public class Doce extends Produto{
    private String marca;

    //Método construtor
    public Doce (int codigo, String nome, String marca) {
        super(codigo,nome);
        this.marca = marca;
    }

    //encapsulament - getters and setters

    public String getMarca () {
        return marca;
    }
    public void setMarca (String marca) {
        this.marca = marca;
    }
}
