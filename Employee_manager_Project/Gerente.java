public class Gerente extends Funcionario{

    private String codUsuario;
    private String senha;

    public Gerente() { 
    }

    public Gerente(String nome, double salario, String codUsuario, String senha) {
        super(nome, salario);
        this.codUsuario = codUsuario;
        this.senha = senha;
    }
    @override
    public double calculabonificacao () {
        return this.getSalario() * 0.1 + 2000.00;
    }

    public String getCodUsuario() {
        return codUsuario;
    }
    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
