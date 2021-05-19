import java.util.ArrayList;


public class Pessoa{

  ArrayList<Object> lista = new ArrayList<Object>(10);
  String nome;
  int idade;
  float altura;

  public Pessoa(String nome, int idade, float altura){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public Pessoa(){

  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public void setAltura(float altura){
    this.altura = altura;
  }

  public String getNome(){
    return nome;
  }

  public int idade(){
    return idade;
  }

  public float altura(){
    return altura;
  }

  @Override
  public String toString(){
    return this.nome+","+this.idade+","+this.altura;
  }

}