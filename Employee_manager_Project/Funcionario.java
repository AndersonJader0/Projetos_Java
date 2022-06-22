public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
        super();
    }



    public double calculaBonificacao () {
    return this.salario * 0.1;
    }

    public double total () {
    return this.salario + salario * 0.1;
    }

    //setters e getters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}