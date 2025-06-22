package Exercicio15; // Informa que está no pacote "Exercicio15"

import java.util.ArrayList; // Importa o pacote para trabalhar com Listas

public class Exercicio15 {
    public static void main(String[] args) {
        // Cria uma nova lista de Strings com tarefas
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Revisar código");

        // Passa por todos os itens da lista "tarefas" verificando se o item contém "Java"
        // Caso contenha, exibe "Tarefa de programação: " e concatena com a tarefa
        for (String tarefa : tarefas) {
            if (tarefa.contains("Java")) {
                System.out.println("Tarefa de programação: " + tarefa);
            }
        }
    }

}
