package br.com.luizaCode.exercicios.aula22_04;

import java.util.Scanner;

public class Exercicio07 {
	
	public void idade() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Digite aqui a sua idade em anos: ");
		int anos = scan.nextInt();
		
		System.out.println ("Digite aqui a sua idade em meses: ");
		int meses = scan.nextInt();
		
		System.out.println ("Digite aqui a sua idade em dias: ");
		int dias = scan.nextInt();
		
		int anosEmDias = anos*365;
		int mesesEmDias = meses*30;
		int resultado = anosEmDias + mesesEmDias + dias;
		 System.out.println ("A sua idade em dias é : " + resultado);
		 
		 scan.close();
		 
		
		
		
	}
	

}
