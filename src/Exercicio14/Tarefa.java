package Exercicio14; // Informa que está no pacote "Exercicio14"

import java.util.ArrayList; // Importa o pacote para trabalhar com Listas
import java.util.Collections; // Importa o pacote para trabalhar com as coleções de dados e fazer a ordenação
import java.util.List; // Importa o pacote para trabalhar com listas

/*
   Neste código criamos uma nova lista de tarefas com 3 itens
   Os itens estão fora de ordem alfabética e queremos mudar isso
   Implementamos a interface Comparable para poder utilizar da ordenação

   Após ordenar os itens, os exibimos na tela.

   OBS > Sobrescrevi o toString() para que fique de melhor visualização assim como no exercício
*/

// Aqui a classe Tarefa implementa a interface Comparable
public class Tarefa implements Comparable<Tarefa>{
    String titulo;

    public Tarefa(String titulo) {
        this.titulo = titulo;
    }

    // Sobrescreve o metodo compareTo para que a comparação fique entre os titulos dos objetos da classe Titulo
    @Override
    public int compareTo(Tarefa outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    // Sobrescreve o metodo toString para que a formatação no final saia de forma correta como no exercício
    @Override
    public String toString() {
        return titulo;
    }

    public static void main(String[] args) {
        // É criada uma nova lista de objetos do tipo "Tarefa"
        List<Tarefa> tarefas = new ArrayList<>();

        // Adiciona 3 novos itens, já instanciando com seus "titulos"
        tarefas.add(new Tarefa("Estudar"));
        tarefas.add(new Tarefa("Almoçar"));
        tarefas.add(new Tarefa("Dormir"));

        // Ordena os itens por ordem com o Collections.sort(tarefas)
        Collections.sort(tarefas);

        // Exibe os itens ordenados
        System.out.println(tarefas);
    }
}
