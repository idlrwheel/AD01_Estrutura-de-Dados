/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Cliente {
    private String nome;
    private int id;
    private int idade;
    private String telefone;
    private String email;
    private static int valor=1;

    public Cliente (){
    }

    public Cliente (String nome, int idade, String telefone, String email){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.id = valor++;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getId(){
        return id;
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString(){
    return "Cliente {" + 
                     "nome= " + nome + 
                     ", idade= " + idade +
                     ", telefone= " + telefone + 
                     ", email= " + email + '}';
    }
    
    public int compareTo(Cliente outroCliente) {
        return this.nome.compareTo(outroCliente.nome);
    }
    
}
