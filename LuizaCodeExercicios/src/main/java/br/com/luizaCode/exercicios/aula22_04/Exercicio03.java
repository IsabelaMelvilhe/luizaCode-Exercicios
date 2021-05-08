package br.com.luizaCode.exercicios.aula22_04;

public class Exercicio03 {

	 public void parDeInstrucaoA() {
		 double resultadoA1;
		 double resultadoA2;
		 boolean produzMesmoResultado = false;

		 resultadoA1 = (4/2f)+(2/4f);
		 resultadoA2 = 4/2f+2/4f;
		 if(resultadoA1 == resultadoA2) {
			 produzMesmoResultado = true;
			 
		 }
		  
		 System.out.println("ResultadoA1: "+ resultadoA1);
		 System.out.println("ResultadoA2: "+ resultadoA2);
		 System.out.println("Par de instrução A produz o mesmo resultado? "+ produzMesmoResultado);

	 }
	 
	 public void parDeInstrucaoB() {
		 double resultadoB1;
		 double resultadoB2;
		 boolean produzMesmoResultado = false;

		 resultadoB1 = 4/(2+2)/4f;
		 resultadoB2 = 4/2f+2/4f;
		 if(resultadoB1 == resultadoB2) {
			 produzMesmoResultado = true;
			 
		 }
		  
		 System.out.println("resultadoB1: "+ resultadoB1);
		 System.out.println("resultadoB2: "+ resultadoB2);
		 System.out.println("Par de instrução B produz o mesmo resultado? "+ produzMesmoResultado);

	 }
	 
	 
	 	public void parDeInstrucaoC() {
		 double resultadoC1;
		 double resultadoC2;
		 boolean produzMesmoResultado = false;

		 resultadoC1 = (4+2)*2-4;
		 resultadoC2 = 4+2*2-4;
		 if(resultadoC1 == resultadoC2) {
			 produzMesmoResultado = true;
			 
		 }
		  
		 System.out.println("resultadoC1: "+ resultadoC1);
		 System.out.println("resultadoC2: "+ resultadoC2);
		 System.out.println("Par de instrução C produz o mesmo resultado? "+ produzMesmoResultado);

	 }
}
