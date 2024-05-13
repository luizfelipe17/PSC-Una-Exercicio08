package psc.exercicio08;
import java.util.Scanner;

public class PSCSolutionsLtda {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Empregado empregado = new Empregado();
        
        System.out.print("PSC Solutions Ltda\n\n"
                + "1 - Criar novo empregado\n"
                + "2 - Promover empregado\n"
                + "3 - Aumentar salário do empregado\n"
                + "4 - Demitir empregado\n"
                + "5 - Fazer aniversário do empregado\n"
                + "6 - Mostrar detalhes dos empregados\n"
                + "7 - Sair\n"
                + "INFORME: ");
        int opcao = ler.nextInt();
        
        empregado.opcoes(opcao, empregado);
        
    }
}
