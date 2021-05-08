package br.com.luizaCode.exercicios.aula27_04.exercicio01;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private String dataNascimento;
	private Double altura;
	private Integer idade;
	
	public void setterNome(String nome) {
		this.nome = nome;
	}
	
	public String getterNome() {
		return nome;
	}
	
	public void setterDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getterDataNascimento() {
		return dataNascimento;
	}
	
	public void setterAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double getterAltura() {
		return altura;
	}
	
	public void setterIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Integer getterIdade() {
		return idade;
	}
	
    public void dadosPessoa(){
        System.out.println("Nome: " + this.getterNome());
        System.out.println("Data de Nascimento: " + this.getterDataNascimento());
        System.out.println("Altura: " + this.getterAltura());
    }
    
    public void idadePessoa() {
    	String dataDeNascimento = this.getterDataNascimento();
    	String[] dataArray = dataDeNascimento.split("/");
    	int anoNascimento = Integer.parseInt(dataArray[2]);
    	
    	LocalDate dataHoje = LocalDate.now();
		String dataHojeString = dataHoje.toString();
		String[] dataHojeArray = dataHojeString.split("-");
		int anoHoje = Integer.parseInt(dataHojeArray[0]);
		
		idade = anoHoje - anoNascimento;
		setterIdade(idade);
    }

}
