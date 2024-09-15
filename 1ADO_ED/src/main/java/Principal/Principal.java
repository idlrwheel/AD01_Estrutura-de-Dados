/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

import java.util.Scanner;

import Vetor.Array;
import modelo.Cliente;

public class Principal {

    public static void main(String[] args) {
        Scanner ot = new Scanner(System.in);
        Array clienteCom = new Array();
        Array clientePrime = new Array();
        int opcao;
        
        do {
        	System.out.print("1. Inserir cliente - comum\n" + "2. Inserir cliente - prime\n" + "3. Buscar cliente - nome\n" + "4. Sair");
        opcao = ot.nextInt();
        switch(opcao){
            case 1: 
                System.out.println("Digite o nome do cliente comum:");
                String nomeCom = ot.next();
                System.out.println("Digite a idade do cliente comum:");
                int idadeCom = ot.nextInt();
                System.out.println("Digite o telefone do cliente comum:");
                String telefoneCom = ot.next();
                System.out.println("Digite o email do cliente comum:");
                String emailCom = ot.next();
                
                Cliente novoClienteC = new Cliente(nomeCom, idadeCom, telefoneCom, emailCom);
                Array.cadastrar(novoClienteC);
                System.out.println("Cliente comum inserido com sucesso!");
                break;
                
            case 2:
                System.out.println("Digite o nome do cliente prime:");
                String nomePri = ot.next();
                System.out.println("Digite a idade do cliente prime:");
                int idadePri = ot.nextInt();
                System.out.println("Digite o telefone do cliente prime:");
                String telefonePri = ot.next();
                System.out.println("Digite o email do cliente prime:");
                String emailPri = ot.next();
                
                Cliente novoClienteP = new Cliente(nomePri, idadePri, telefonePri, emailPri);
                Array.cadastrar(novoClienteP);
                System.out.println("Cliente prime inserido com sucesso!");
                break;
                
            case 3:
                System.out.println("Digite o nome do cliente: ");
                String nome = ot.next();
                Cliente clienteEncontrado = clienteCom.buscaBinaria(nome);
                if(clienteEncontrado == null){
                    clienteEncontrado = clientePrime.buscaBinaria(nome);
                }
                if(clienteEncontrado != null){
                    System.out.println(clienteEncontrado);
                } else{
                    System.out.println("Cliente não encontrado");
                }
            case 4: 
                break;
            default: 
                System.out.println("Opção inválida");
                break;
        }
       } while(opcao != 4);
    }
     
}
