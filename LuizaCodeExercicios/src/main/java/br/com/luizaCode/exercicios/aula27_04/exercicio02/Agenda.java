import java.util.ArrayList;

public class Agenda {

  ArrayList<Object> lista = new ArrayList<Object>(10);

  public void armazenaPessoa(String nome, int idade, float altura){
    Pessoa pessoa = new Pessoa(nome,idade,altura);
    pessoa.setNome(nome);
    pessoa.setIdade(idade);
    pessoa.setAltura(altura);
    lista.add(pessoa);
  }

  public void removePessoa(String nome){
    for(int i=0; i<lista.size();i++){
      String result = lista.get(i).toString();
      String[] split = result.split(",");
      if (split[0].equals(nome)){
        lista.remove(i);
      }
    }
  }

  public int buscaPessoa(String nome){
    int posicao = 404;
    for(int i=0; i<lista.size();i++){
      String result = lista.get(i).toString();
      String[] split = result.split(",");
      if (split[0].equals(nome)){
        posicao = i;
      }
    }
    return posicao;
  }

  public void imprimeAgenda(){
    for(int i=0; i<lista.size();i++){
      String result = lista.get(i).toString();
      String[] split = result.split(",");
      System.out.println("Nome: "+split[0]+"; Idade: "+split[1]+"; Altura: "+split[2]);
    }
  }

  public void imprimePessoa(int index){
    String result = lista.get(index).toString();
    String[] split = result.split(",");
    System.out.println("Nome: "+split[0]+"; Idade: "+split[1]+"; Altura: "+split[2]);
  }
}