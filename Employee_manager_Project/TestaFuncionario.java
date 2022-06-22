public class TestaFuncionario {
    public static void main (String[] args) {
        Funcionario funci = new Funcionario("Pedro", 1000.00);
        Gerente gen = new Gerente("Maria", 9000.00, "G123", "sss456");

        System.out.println("------------Dados do Funcionario-----------");
        System.out.println("Nome do Funcionario " +funci.getNome());
        System.out.println("Salario do Funcionario " + funci.getSalario());

        System.out.println("--------------Dados do Gerente-------------");
        System.out.println("Nome da Gerente " + gen.getNome());
        System.out.println("Salario da Gerente " + gen.getSalario());
        System.out.println("Senha da Gerente " + gen.getSenha());

        System.out.println("-----------------Bonificacao---------------");
        System.out.println("Gerente = " + gen.calculaBonificacao());
        System.out.println("Funcionario = " + funci.calculaBonificacao());

        System.out.println("-------------------Total-------------------");
        System.out.println("Total do Funcionario = " + funci.total());
        System.out.println("Total do Gerente = " + gen.total());
    }
}
