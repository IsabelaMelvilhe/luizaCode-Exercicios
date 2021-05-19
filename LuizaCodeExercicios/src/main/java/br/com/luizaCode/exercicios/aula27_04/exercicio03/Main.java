import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Elevador elevador = new Elevador();
    java.util.Scanner scan = new Scanner(System.in);

    System.out.println("Digite a quantidade de andares do prédio");
    int andares = scan.nextInt();

    System.out.println("Digite a capacidade de pessoas do elevador");
    int capacidade = scan.nextInt();

    elevador.setAndares(andares);
    elevador.setCapacidade(capacidade);

    int resposta = 1;

    while(resposta != 0){
      System.out.println("------------------------------------------------------------------------");
      System.out.println("Digite uma das opções abaixo");
      System.out.println("1. Entra Pessoa; 2. Sai Pessoa; 3. Sobe Andar; 4. Desce Andar; 0. Sair");
      resposta = scan.nextInt();

      switch(resposta){
        case 1: elevador.adicionaPessoas(); break;
        case 2: elevador.removePessoas(); break;
        case 3: elevador.sobeAndar(); break;
        case 4: elevador.desceAndar(); break;
      }
      System.out.println(elevador);
    }
  }
}