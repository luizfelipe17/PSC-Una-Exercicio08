package com.mycompany.empregado;

import java.util.ArrayList;
import java.util.Scanner;

public class PSCSolutionsLtda {

    public static void main(String[] args) {

        ArrayList<String> nomeFuncionarios = new ArrayList<String>();
        ArrayList<Integer> idades = new ArrayList<Integer>();
        ArrayList<Double> salarios = new ArrayList<Double>();
        Scanner ler = new Scanner(System.in);
        Empregado empregado = new Empregado();
        
        System.out.println("BEM VINDO A PSCSoluions LTDA!!");


        empregado.telaPrincipal(empregado, nomeFuncionarios, idades, salarios);

    }
}
