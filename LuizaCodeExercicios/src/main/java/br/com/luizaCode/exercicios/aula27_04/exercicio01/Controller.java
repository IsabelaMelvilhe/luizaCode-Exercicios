package br.com.luizaCode.exercicios.aula27_04.exercicio01;

import java.util.Scanner;

public class Controller {
	public void controller() {
		Scanner scan = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		String nomeDigitado = scan.nextLine();
		pessoa.setterNome(nomeDigitado);
		
		System.out.println("Digite sua Data de nascimento:");
		System.out.println("Necessário ser no formato dd/MM/yyyy");
		String dataNascimentoDigitada = scan.nextLine();
		pessoa.setterDataNascimento(dataNascimentoDigitada);
		
		System.out.println("Digite sua altura: ");
		Double alturaDigitada = scan.nextDouble();
		pessoa.setterAltura(alturaDigitada);
		
		pessoa.dadosPessoa();
		pessoa.idadePessoa();
		
		Integer idade = pessoa.getterIdade();
		
		System.out.println("Idade: " + idade);
		
		scan.close();
	}
}
