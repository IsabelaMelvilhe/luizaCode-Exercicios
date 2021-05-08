package br.com.luizaCode.exercicios.aula22_04;

import java.util.Scanner;

public class Exercicio10 {

	public void valorCarro() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Digite aqui o custo de fabrica: ");
		double custoFabrica = scan.nextDouble();
		
		double distribuidor = custoFabrica * 28 / 100f;
		double impostos = custoFabrica * 45 / 100f;
		double custoFinal = custoFabrica + distribuidor + impostos;
		 System.out.println ("O custo final do veiculo para o clinte é de:  " + custoFinal);
		

		 scan.close();
	}
}
