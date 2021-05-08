package br.com.luizaCode.exercicios.aula22_04;

import java.util.Scanner;

public class Exercicio09 {

	public void salario() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Digite aqui o seu salario mensal atual: ");
		double salarioAtual = scan.nextDouble();
		
		System.out.println ("Digite aqui o porcentagem de reajuste: ");
		double reajuste = scan.nextDouble();
		
		double resultado = salarioAtual * reajuste / 100;
		double novoSalario = salarioAtual + resultado;
		 System.out.println ("O valor do novo sálario é:  " + novoSalario);
		

		 scan.close();
	}	 
}
