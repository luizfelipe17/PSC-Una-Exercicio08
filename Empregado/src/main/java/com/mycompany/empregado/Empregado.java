package com.mycompany.empregado;

import java.util.ArrayList;
import java.util.Scanner;

public class Empregado{

    private String nome;
    private int idade;
    private double salario;

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getIdade() {

        return idade;

    }

    public void setIdade(int idade) {

        this.idade = idade;

    }

    public double getSalario() {

        return salario;

    }

    public void setSalario(double salario) {

        this.salario = salario;

    }

    public static void telaPrincipal(Empregado empregado, ArrayList<String> nomeFuncionarios, ArrayList<Integer> idades, ArrayList<Double> salarios) {

        Scanner ler = new Scanner(System.in);

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

        ler.nextLine();

        empregado.opcoes(opcao, empregado, nomeFuncionarios, idades, salarios);

    }

    public static void opcoes(int opcao, Empregado empregado, ArrayList<String> nomeFuncionarios, ArrayList<Integer> idades, ArrayList<Double> salarios) {

        PSCSolutionsLtda principal = new PSCSolutionsLtda();
        String[] args = null;

        int opcaoFuncionario = 0;

        switch (opcao) {

            case 1:

                criarNovoEmpregado(empregado, principal, nomeFuncionarios, idades, salarios);
                break;

            case 2:

                promover(empregado, principal, nomeFuncionarios, idades, salarios);
                break;
                
            case 3:

                int opcaoEscolhida = 1;
                aumentarSalario(empregado, opcaoEscolhida, nomeFuncionarios, salarios, idades, opcaoFuncionario);
                break;

            case 4:

                demitirFuncionario(nomeFuncionarios, idades, salarios, principal, empregado);
                break;

            case 5:

                fazerAniversario(nomeFuncionarios, idades, principal, salarios, empregado);
                break;

            case 6:

                detalhesEmpregados(nomeFuncionarios, idades, salarios, principal, empregado);
                break;

            case 7:

                sair();
                break;

            default:

                System.out.println("\nVALOR INVÁLIDO");
                telaPrincipal(empregado, nomeFuncionarios, idades, salarios);

        }

    }

    public static void criarNovoEmpregado(Empregado empregado, PSCSolutionsLtda principal, ArrayList<String> nomeFuncionarios, ArrayList<Integer> idades, ArrayList<Double> salarios) {

        Scanner ler = new Scanner(System.in);

        System.out.println("\nEMPREGADO");

        System.out.print("Nome: ");
        String nome = ler.nextLine();

        empregado.setNome(nome);
        nomeFuncionarios.add(empregado.getNome());

        System.out.print("Idade: ");
        int idade = ler.nextInt();

        empregado.setIdade(idade);
        idades.add(empregado.getIdade());

        System.out.print("Salário: R$");
        double salario = ler.nextDouble();

        empregado.setSalario(salario);
        salarios.add(empregado.getSalario());

        System.out.println("");
        telaPrincipal(empregado, nomeFuncionarios, idades, salarios);

    }

    public static void promover(Empregado empregado, PSCSolutionsLtda principal, ArrayList<String> nomeFuncionarios, ArrayList<Integer> idades, ArrayList<Double> salarios) {

        Scanner ler = new Scanner(System.in);

        listaEmpregados(nomeFuncionarios);
        System.out.print("ESCOLHA: ");
        int opcaoFuncionario = ler.nextInt();

        if (idades.get(--opcaoFuncionario) > 18) {

            int opcaoEscolhida = 2;
            System.out.println("");
            empregado.aumentarSalario(empregado, opcaoEscolhida, nomeFuncionarios, salarios, idades, opcaoFuncionario);

        } else {

            System.out.println("\nINFORME UM EMPREGADO COM MAIS DE 18 ANOS");

        }

        telaPrincipal(empregado, nomeFuncionarios, idades, salarios);

    }

    public static void aumentarSalario(Empregado empregado, int opcao, ArrayList<String> nomeFuncionarios, ArrayList<Double> salarios, ArrayList<Integer> idades, int opcaoEscolhida) {

        Scanner ler = new Scanner(System.in);

        double novoSalario;

        if (opcao == 1) {

            listaEmpregados(nomeFuncionarios);
            System.out.print("ESCOLHA: ");
            int opcaoFuncionarios = ler.nextInt();

            System.out.print("Porcentagem do aumento: ");
            int porcentagem = ler.nextInt();

            --opcaoFuncionarios;

            novoSalario = salarios.get(opcaoFuncionarios) + salarios.get(opcaoFuncionarios) * (porcentagem / 100.0);

            salarios.set(opcaoFuncionarios, novoSalario);

            System.out.printf("\nSalário do funcionário " + nomeFuncionarios.get(opcaoFuncionarios) + " aumentado para R$%.2f", salarios.get(opcaoFuncionarios));
            System.out.println("\n");

        } else if (opcao == 2) {

            int porcentagem = 25;
            novoSalario = salarios.get(opcaoEscolhida) + salarios.get(opcaoEscolhida) * (porcentagem / 100.0);
            salarios.set(opcaoEscolhida, novoSalario);

            System.out.printf("Salário do funcionário " + nomeFuncionarios.get(opcaoEscolhida) + " aumentado para R$%.2f", salarios.get(opcaoEscolhida));
            System.out.println("");

        }

        telaPrincipal(empregado, nomeFuncionarios, idades, salarios);

    }

    public static void detalhesEmpregados(ArrayList<String> nomeFuncionarios, ArrayList<Integer> idades, ArrayList<Double> salarios, PSCSolutionsLtda principal, Empregado empregado) {

        System.out.print("\nFuncionarios\n");

        if (nomeFuncionarios.size() >= 1) {

            for (int i = 0; i < nomeFuncionarios.size(); i++) {

                System.out.println("Nome: " + nomeFuncionarios.get(i) + "\n"
                        + "Idade: " + idades.get(i) + "\n"
                        + "Salário: R$" + salarios.get(i));
                System.out.println("");

            }

        } else {

            System.out.println("\nNÂO TEM FUNCIONARIOS TRABALHANDO NESSA EMPRESA!!!\n");

        }

        telaPrincipal(empregado, nomeFuncionarios, idades, salarios);

    }

    public static void fazerAniversario(ArrayList<String> nomeFuncionarios, ArrayList<Integer> idades, PSCSolutionsLtda principal, ArrayList<Double> salarios, Empregado empregado) {

        Scanner ler = new Scanner(System.in);

        listaEmpregados(nomeFuncionarios);
        System.out.print("ESCOLHA: ");
        int opcaoFuncionarios = ler.nextInt();

        System.out.println("Hoje é aniversário do " + nomeFuncionarios.get(opcaoFuncionarios - 1) + "\n"
                + "Deseje Parabéns para ele...");
        System.out.println("");

        idades.set(opcaoFuncionarios - 1, idades.get(opcaoFuncionarios - 1) + 1);

        telaPrincipal(empregado, nomeFuncionarios, idades, salarios);

    }

    public static void demitirFuncionario(ArrayList<String> nomeFuncionarios, ArrayList<Integer> idades, ArrayList<Double> salarios, PSCSolutionsLtda principal, Empregado empregado) {

        Scanner ler = new Scanner(System.in);

        listaEmpregados(nomeFuncionarios);
        System.out.print("ESCOLHA: ");
        int opcaoFuncionarios = ler.nextInt();

        --opcaoFuncionarios;

        System.out.print("1 - Justa causa\n"
                + "2 - Decisão do empregador\n"
                + "3 - Aposentadoria\n"
                + "INFORME: ");
        int opcaoAposentadoria = ler.nextInt();
        
        --opcaoAposentadoria;

        E_TipoDemissao motivo = E_TipoDemissao.values()[opcaoAposentadoria];

        switch (motivo) {

            case JUSTA_CAUSA:

                System.out.println("\nDEVERÁ COMPRIR O AVISO PRÉVIO!!!\n");
                break;

            case DECISAO_DO_EMPREGADOR:

                double multaAposentadoria = 0;
                multaAposentadoria += salarios.get(opcaoFuncionarios) + salarios.get(opcaoFuncionarios) * (40 / 100.0);
                System.out.printf("\nO empregado " + nomeFuncionarios.get(opcaoFuncionarios) + " receberá %.2f", multaAposentadoria);
                System.out.println(" de multa rescisória!\n");
                break;

            case APOSENTADORIA:

                if (salarios.get(opcaoFuncionarios) < 1000) {

                    System.out.println("\nO empregado " + nomeFuncionarios.get(opcaoFuncionarios) + " não receberá salário de aposentadoria!!\n");

                } else if (salarios.get(opcaoFuncionarios) < 2000) {

                    System.out.println("\nO empregado " + nomeFuncionarios.get(opcaoFuncionarios) + " receberá R$1500 de salário de aposentadoria!!\n");

                } else if (salarios.get(opcaoFuncionarios) < 3000) {

                    System.out.println("\nO empregado " + nomeFuncionarios.get(opcaoFuncionarios) + " receberá R$2500 de salário de aposentadoria!!\n");

                } else if (salarios.get(opcaoFuncionarios) < 4000) {

                    System.out.println("\nO empregado " + nomeFuncionarios.get(opcaoFuncionarios) + " receberá R$3500 de salário de aposentadoria!!\n");

                } else {

                    System.out.println("\nO empregado " + nomeFuncionarios.get(opcaoFuncionarios) + " receberá R$4000 de salário de aposentadoria!!\n");

                }
                
                break;

        }

        nomeFuncionarios.remove(opcaoFuncionarios);
        idades.remove(opcaoFuncionarios);
        salarios.remove(opcaoFuncionarios);

        telaPrincipal(empregado, nomeFuncionarios, idades, salarios);

    }

    public static void listaEmpregados(ArrayList<String> nomeFuncionarios) {

        Scanner ler = new Scanner(System.in);

        int contador = 1;

        System.out.println("");

        if (nomeFuncionarios.size() >= 1) {

            for (String listaEmpregados : nomeFuncionarios) {

                System.out.println(contador + " " + listaEmpregados);

                contador++;

            }

        } else {

            System.out.println("\nNÂO TEM FUNCIONARIOS TRABALHANDO NESSA EMPRESA!!!\n");

        }

    }

    public static void sair() {

        System.out.println("\nAté a próxima!! :)");
        System.exit(0);

    }

}
