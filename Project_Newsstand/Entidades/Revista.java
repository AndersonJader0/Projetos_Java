package Entidades;

public class Revista extends Produto {

    private String editora;

    public Revista (int codigo, String nome, String editora) {
        super(codigo, nome);
        this.editora = editora;
    }
    //encapsulamento - getters and setters

    public String getMarca() {
        return editora;
    }
    public void setMarca(String marca) {
        this.editora = marca;
    }
    
}
