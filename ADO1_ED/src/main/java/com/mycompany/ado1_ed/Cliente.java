/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado1_ed;

public class Cliente {
    private String nome;
    private int id;
    private int idade;
    private String telefone;
    private String email;

    public Cliente(String nome, int id, int idade, String telefone, String email){
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome(String nome){
        return nome;
    }
    public int getIdade(int idade){
        return idade;
    }
    public int getId(int id){
        return id;
    }
    public String getTelefone(String telefone){
        return telefone;
    }
    public String getEmail(String email){
        return email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "Idade: " + idade + "Telefone: " + telefone + "Email: " + email;
    }
    
}


