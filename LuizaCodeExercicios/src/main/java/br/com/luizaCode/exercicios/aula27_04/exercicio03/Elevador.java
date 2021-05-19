public class Elevador{
  int capacidade;
  int andares;
  int pessoas = 0;
  int andar = 0;

  public Elevador(int capacidade, int andares, int pessoas, int andar){
    this.capacidade = capacidade;
    this.andares = andares;
    this.pessoas = pessoas;
    this.andar = andar;
  }

  public Elevador(){

  }

  public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
  }

  public void setAndares(int andares){
    this.andares = andares;
  }

  public void adicionaPessoas(){
    if(pessoas < capacidade){
      this.pessoas += 1;
      System.out.println("Uma pessoa entrou");
    }
    else{
      System.out.println("Capacidade Excedida");
    }
    
  }

  public void removePessoas(){
    if(pessoas != 0){
      this.pessoas -= 1;
      System.out.println("Uma pessoa saiu");
    }
    else{
      System.out.println("Já não há pessoas no Elevador");
    }
    
  }

  public void sobeAndar(){
    if(andar < andares){
      this.andar += 1;
      System.out.println("Subindo um andar");
    }
    else{
      System.out.println("Já estamos no último andar");
    }
    
  }

  public void desceAndar(){
    if(andar != 0){
      this.andar -= 1;
      System.out.println("Descendo um andar");
    }
    else{
      System.out.println("Já estamos no térreo");
    }
    
  }

  @Override
  public String toString(){
    return "Qntd de Andares: "+this.andares+"; Capacidade do Elevador: "+this.capacidade+"; Qntd de Pessoas: "+this.pessoas+"; Andar: "+this.andar;
  }

}