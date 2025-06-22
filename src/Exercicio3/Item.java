package Exercicio3; // Informa que está no pacote "Exercicio3"

/*
   Aqui temos um exemplo de construtor com sobrecarga
   Uma classe pode ter múltiplos construtores, desde que cada um tenha uma lista de parâmetros diferente.

   Instancia dois novos objetos e logo após isso soma o valor dos atributos "quantidade" de cada um
*/

public class Item {
    String nome; // Atributo do tipo de texto da classe
    int quantidade; // Atributo do tipo inteiro da classe

    // Cria um construtor que necessita da incialização do "nome" na instanciação do objeto, porém o valor de
    // quantiade já é indicado como igual a 1
    public Item(String nome){
        this.nome = nome;
        this.quantidade = 1;
    }

    // Cria um construtor que necessita da incialização do "nome" e da "quantidade" na instanciação do objeto
    public Item(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {

        // Instancia um novo objeto "x" como da classe Item:
        // "nome" = "Caderno"
        // "quantidade" = 1 (por causa do construtor)
        Item x = new Item("Caderno");

        // Instancia um novo objeto "y" como da classe Item:
        // "nome" = "Caneta"
        // "quantidade" = 3 (valor é indicado na hora da criação do objeto)
        Item y = new Item("Caneta", 3);

        // Exibe a soma dos valores de quantidade de "x" e "y"
        System.out.println(x.quantidade + y.quantidade);
    }
}
