
package com.mycompany.ado1_ed;
import java.util.Scanner;
import com.mycompany.ado1_ed.Array;

public class Main {
    public static void main(String[] args){
           Vetor.cadastrar(new( "Abilene",18,"(11) 98877-6655","Abilene@example.com") );
           Vetor.cadastrar(new( "Bárbara",19,"(11) 98877-6666", "Bárbarao@example.com") );
           Vetor.cadastrar(new( "Claiver",20,"(11) 98877-6677", "Claiver@example.com") );
           Vetor.cadastrar(new( "Daphny",21,"(11) 98877-6688", "Daphny@example.com") );
           Vetor.cadastrar(new( "Emilsielem",22,"(11) 98877-6699", "vitorialeo@example.com") );
           Vetor.cadastrar(new( "Francisco",23,"(11) 98877-6610", "Francisco@example.com""));
           Vetor.cadastrar(new( "Giovana",24,"(11) 98877-6611", "Giovana@example.com""));
           Vetor.cadastrar(new( "Hoendel ",25,"(11) 98877-6612", "Hoendel @example.com""));
           Vetor.cadastrar(new( "Iasmin",26,"(11) 98877-6613", "Iasmin@example.com""));
           Vetor.cadastrar(new( "Jordano",27,"(11) 98877-6614", "Jordano@example.com""));
           Vetor.cadastrar(new( "Kerolin",28,"(11) 98877-6615", "Kerolin@example.com""));

        
           Cliente cliente = Vetor.pesquisarCadastro();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o ID do cliente que deseja pesquisar: ");
            int id = sc.nextInt();
            sc.close();

            int indice = Vetor.pesquisar(id);
            if(indice >= 0){
                retrun clientes[indice];
                
            }else {
                System.out.println(+ i + "ID não encontrado");
                return null;
            }

            public static void pesquisar(int id){
                for(int i=0; i<indice; i++){
                    if(clientes[i].getId() == id){
                        return i;
                    }
                }
                        retrun -1;
            }
    
            Vetor.exibir();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o ID do cliente que deseja excluir: ");
            int id = sc.nextInt();
            Vetor.excluir(id);
            Vetor.exibir();
            
            
    }
}

