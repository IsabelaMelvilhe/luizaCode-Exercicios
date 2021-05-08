package br.com.luizaCode.exercicios.aula22_04;

import java.util.Scanner;

public class Exercicio11 {

	public void carrosVendidos() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Digite aqui a quantidade total de carros vendidos: ");
		int carrosVendidos = scan.nextInt();
		
		System.out.println ("Digite aqui o valor total de vendas do funcionario: ");
		double ValorVendas = scan.nextDouble();
		
		System.out.println ("Digite aqui o seu salário fixo: ");
		double salarioFixo = scan.nextDouble();
		
		System.out.println ("Digite aqui o valor que recebe por carro vendido: ");
		double comissaoVenda = scan.nextDouble();
		
		double comissaoDoTotal = ValorVendas * 5 / 100f;
		double comissaoPorVenda = carrosVendidos * comissaoVenda;
		
		
		double resultado = salarioFixo + comissaoDoTotal + comissaoPorVenda;
		 System.out.println ("O valor do sálario final do vendedor é:  " + resultado);
		

		 scan.close();
	}	 
}
