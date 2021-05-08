package br.com.luizaCode.exercicios.aula22_04;

import java.util.Scanner;

public class Exercicio06 {
	
	public void dimensoes () {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a base do retangulo aqui: ");
		
		int baseDigitada = scan.nextInt();
		
		System.out.println("Digite a altura do retangulo aqui: ");
		
		int alturaDigitada = scan.nextInt();
		
		int area = baseDigitada * alturaDigitada;
		
		System.out.println("A área do retangulo é: " + area);
		
		scan.close();
		
	}
	

}
