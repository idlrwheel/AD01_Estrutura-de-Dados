/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado1_ed;

public class Array{

  private static Cliente[] clientes = new Cliente[12];
  private static int  indice = 0;

  public static void cadastrar(Cliente cliente) {
    if(indice < clientes.length){
      clientes=alocarclientesArray();
    }
    clientes[indice++] = cliente;
  }

  public static void exibir(){
    for(int i=0; i<indice; i++){
      System.out.println(clientes[i]);
    }
  }

  public static int pesquisar(int id){
    for (int i=0; i<indice; i++){
      if(clientes[i].getId() == id){
        return i;
      }
    }
    return -1;
  }
  public static Cliente pesquisarCadastro(int id){
    for (int i = 0; i < indice; i++)
    if(i == clientes[i].getId()){
      return clientes[i];
    }
    }
    return null;
}

public static bolean excluir(int id){
  int indRem = pesquisar(id);
  if ( indRem >= 0){
    for(int i = indRem; i<indice-1; i++){
      clientes[i] = clientes[i+1];
    }
    indice--;
    return true;
  }
  retrun false;
}

public static Cliente[] alocarclientesArray(){
  Cliente[] novo=new Cliente[clientes.length+2];

  for (int i = 0; i < clientes.length; i++) {
      novo[i] = clientes[i];
  }
  return novo;
}
  