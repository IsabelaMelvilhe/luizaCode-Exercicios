package br.com.luizaCode.exercicios.aula22_04;

import java.util.Scanner;

public class Exercicio05 {
	
	public void valor () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor aqui: ");
		
		int valorDigitado = scan.nextInt(); 
		int antecessor = valorDigitado - 1;
		
		System.out.println("O antecessor do numero digitado é: "+ antecessor);
		
		scan.close();
		
		
	}

}
