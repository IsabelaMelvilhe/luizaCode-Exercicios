package br.com.luizaCode.exercicios.aula22_04;

import java.util.Scanner;

public class Exercicio08 {

	public void eleicao() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Digite aqui o total de eleitores do municipio: ");
		int totalEleitores = scan.nextInt();
		
		System.out.println ("Digite aqui o numero de votos brancos: ");
		int brancos = scan.nextInt();
		
		System.out.println ("Digite aqui o numero de votos nulos: ");
		int nulos = scan.nextInt();
		
		System.out.println ("Digite aqui o numero de votos validos: ");
		int validos = scan.nextInt();
		
		
		double brancosPercentual = (float)brancos/(float)totalEleitores*100;
		double nulosPercentual = (float)nulos/(float)totalEleitores*100;
		double validosPercentual = (float)validos/(float)totalEleitores*100;
		 System.out.println ("O percentual de votos Brancos foi: " + brancosPercentual+"%");
		 System.out.println ("O percentual de votos Nulos foi: " + nulosPercentual+"%");
		 System.out.println ("O percentual de votos validos foi: " + validosPercentual+"%");


		 scan.close();
	}	 
}
