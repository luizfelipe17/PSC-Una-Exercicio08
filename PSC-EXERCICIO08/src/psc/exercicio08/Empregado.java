package psc.exercicio08;

public class Empregado {

    private String nome;
    private int idade;
    private double salario;

    public String getNome() {

        return nome;

    }

    public void setNome() {

        this.nome = nome;

    }

    public int getIdade() {

        return idade;

    }

    public void setIdade() {

        this.idade = idade;

    }

    public double getSalario() {

        return salario;

    }

    public void setSalario() {

        this.salario = salario;

    }

    public static void opcoes(int opcao, Empregado empregado) {

        PSCSolutionsLtda principal = new PSCSolutionsLtda();
        
        switch (opcao) {

            case 1:

            case 2:

                promover(empregado, principal);

            case 3:

            case 4:

            case 5:

            case 6:

            case 7:

            default:

        }

    }

    public static void promover(Empregado empregado, PSCSolutionsLtda principal) {

        double porcentagem = 25;
        
        if (empregado.getIdade() > 18) {

            empregado.aumentarSalario(empregado, porcentagem);
            
        } else {
            
            System.out.println("\nINFORME UM EMPREGADO COM MAIS DE 18 ANOS");
            principal.main();
            
        }

    }

    public static void aumentarSalario(Empregado empregado, double porcentagem) {

        double novoSalario = empregado.getSalario();
        
        novoSalario += (empregado.getSalario() * (porcentagem / 100));
        
    }

    public static void criarNovoEmpregado() {

        System.out.println("EMPREGADO\n");

    }

}
