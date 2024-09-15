/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetor;
import modelo.Cliente;

public class Array {
    private static Cliente[] clientes = new Cliente[10];
  private static int indice = 0;

  // cadastrar clientes
  public static void cadastrar(Cliente cliente) {
    if(indice < clientes.length){
    clientes=alocarclientesArray();
    }
    clientes[indice++] = cliente;
  }
  // exibir clientes
   public static void exibir(){
    for(int i=0; i<indice; i++){
      System.out.println(clientes[i]);
    }
  }
   // pesquisa por id, retornando índice
   public static int pesquisar(int id){
    for (int i=0; i<indice; i++){
      if(clientes[i].getId() == id){
        return i;
      }
    }
      return -1;
  }
  
   // pesquisa por id, retornando instância
   public static Cliente pesquisarCadastro(int id){
    for (int i = 0; i < indice; i++){
    if(i == clientes[i].getId()){
      return clientes[i];
     }
   }
    return null;
}
  // método para excluir clientes
 public static boolean excluir(int id){
  int indRem = pesquisar(id);
  if ( indRem >= 0){
    for(int i = indRem; i<indice-1; i++){
      clientes[i] = clientes[i+1];
    }
    indice--;
    return true;
  }
  return false;
}
  
  
  // método de ordenação utilizando o bubblesort
  public void ordernarClientes(Cliente[] clientes){
      int n = clientes.length;
      for(int i =0; i< n - 1; i++){
          for(int j = 0; j < n- i-1; j++){
              if(clientes[j].compareTo(clientes[j+1]) > 0){
                  Cliente pos = clientes[j];
                  clientes[j] = clientes[j +1];
                  clientes[j +1] = pos;
              }
          }
      }
  }
  
  // método de pesquisa binária
  public Cliente buscaBinaria(Cliente [] clientes, String nome){
      int esq = 0;
      int dir = clientes.length -1;
      
      while(esq <= dir){
          int m = esq + (dir - esq)/2;
          int comp = clientes[m].getNome().compareTo(nome);
          
          if(comp == 0){
              return clientes[m];
          } else if(comp < 0){
              esq = m + 1;
          } else{
              dir = m - 1;
          }
      }
      return null;
  }
 
  // alocar novos clientes no array
public static Cliente[] alocarclientesArray(){
  Cliente[] novo=new Cliente[clientes.length+2];

  for (int i = 0; i < clientes.length; i++) {
    novo[i] = clientes[i];
  }
  return novo;
}
}
