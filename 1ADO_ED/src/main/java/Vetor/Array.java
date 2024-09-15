package Vetor;

import modelo.Cliente;

public class Array {
    private Cliente[] clientes = new Cliente[10];
    private int indice = 0;

    // Cadastrar clientes
    public void cadastrar(Cliente cliente) {
        if (indice >= clientes.length) {
            clientes = alocarclientesArray();
        }
        clientes[indice++] = cliente;
    }

    // Exibir clientes
    public void exibir() {
        for (int i = 0; i < indice; i++) {
            System.out.println(clientes[i]);
        }
    }

    // Pesquisa por ID, retornando índice
    public int pesquisar(int id) {
        for (int i = 0; i < indice; i++) {
            if (clientes[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    // Pesquisa por ID, retornando instância
    public Cliente pesquisarCadastro(int id) {
        for (int i = 0; i < indice; i++) {
            if (clientes[i].getId() == id) {
                return clientes[i];
            }
        }
        return null;
    }

    // Método para excluir clientes
    public boolean excluir(int id) {
        int indRem = pesquisar(id);
        if (indRem >= 0) {
            for (int i = indRem; i < indice - 1; i++) {
                clientes[i] = clientes[i + 1];
            }
            indice--;
            return true;
        }
        return false;
    }

    // Método de ordenação utilizando o bubblesort
    public void ordernarClientes() {
        int n = indice;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (clientes[j].compareTo(clientes[j + 1]) > 0) {
                    Cliente pos = clientes[j];
                    clientes[j] = clientes[j + 1];
                    clientes[j + 1] = pos;
                }
            }
        }
    }

    // Método de pesquisa binária
    public Cliente buscaBinaria(String nome) {
        ordernarClientes(); // Certifique-se de que o array está ordenado
        int esq = 0;
        int dir = indice - 1;

        while (esq <= dir) {
            int m = esq + (dir - esq) / 2;
            int comp = clientes[m].getNome().compareTo(nome);

            if (comp == 0) {
                return clientes[m];
            } else if (comp < 0) {
                esq = m + 1;
            } else {
                dir = m - 1;
            }
        }
        return null;
    }

    // Alocar novos clientes no array
    private Cliente[] alocarclientesArray() {
        Cliente[] novo = new Cliente[clientes.length + 10];
        System.arraycopy(clientes, 0, novo, 0, clientes.length);
        return novo;
    }
}
