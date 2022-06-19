package Entidades;

public class Bebida extends Produto{
    
    private String tipo;

    //método construtor
    public Bebida (int codigo, String nome, String tipo) {
        super(codigo, nome);
        this.tipo = tipo;
    }
    //encapsulamento - getters and setters

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
