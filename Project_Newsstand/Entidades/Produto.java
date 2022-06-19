package Entidades;

public abstract class Produto{

    private int codigo;
    private String nome;
    private int estoque;
    private double valorUnitario; //camelcase

    //método construtor porém é uma classe abstrata.
    public Produto(int codigo, String nome) {

        this.codigo = codigo;
        this.nome = nome;

    }

    //encapsulamento - getters and setters

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getvalorUnitario() {
        return valorUnitario;
    }
    public void setvalorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void incluirEstoque(int quantidade) {

        estoque = estoque + quantidade;

    }

    public void tirarEstoque(int quantidade) {

        if (quantidade <= estoque) 
        {
            estoque = estoque - quantidade;
        } 
        else
        {
            System.out.println("Estoque insuficiente.");
        }
    }
}