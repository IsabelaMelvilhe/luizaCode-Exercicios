import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    Scanner scan = new Scanner(System.in);
    int resposta = 1;
    
    while(resposta != 0){
      System.out.println("Escolha uma opção para continuar");
      System.out.println("1. Adicionar pessoa; 2. Remover pessoa; 3. Buscar pessoa pelo nome; 4. Ver Todos; 5. Buscar pessoa pela posição; 0. Sair");
      resposta = scan.nextInt();
      if(resposta == 1){

        System.out.println("Digite o nome:");
        String nome = scan.next();
        
        System.out.println("Digite a idade:");
        int idade = scan.nextInt();

        System.out.println("Digite a altura:");
        float altura = scan.nextFloat();

        agenda.armazenaPessoa(nome, idade, altura);
        System.out.println("Pessoa Salva");
      }
      else if(resposta == 2){
        System.out.println("Digite o nome que deseja excluir:");
        String nome = scan.next();
        agenda.removePessoa(nome);
        System.out.println("Pessoa Removida");
      }
      else if(resposta == 3){
        System.out.println("Digite o nome que deseja procurar:");
        String nome = scan.next();
        int posicao = agenda.buscaPessoa(nome);

        if(posicao == 404){
          System.out.println("Pessoa não localizada");
        }else{
          System.out.println("Essa pessoa está na posição: "+posicao);
        }
      }
      else if(resposta == 4){
        agenda.imprimeAgenda();
      }
      else if(resposta == 5){
        System.out.println("Digite a posição que deseja procurar:");
        int index = scan.nextInt();
        agenda.imprimePessoa(index);
      }
    };
    
    scan.close();
    
  }
}