package Exercicio6; // Informa que está no pacote "Exercicio6"

import java.util.ArrayList; // Importa o pacote de trabalho com ArrayList

/*
    Neste código é criada uma lista de Strings para preencher com horários escritos "a mão"
    Após adicionar 3 horários removemos o de índice 1 = 10:00
    Lembrando que o primeiro item é o de índice 0, por isso 08:00 não é removido

    Após adicionar todos os horários, exibe o de índice um, agora por sua vez o horário "12:00"
*/

public class Exercicio6 {
    public static void main(String[] args) {
        // Cria uma nova lista de Strings chamada "horarios"
        ArrayList<String> horarios = new ArrayList<>();

        // Abaixo cada .add adiciona uma nova String para a lista
        horarios.add("08:00");
        horarios.add("10:00");
        horarios.add("12:00");

        // O .remove remove o item de índice 1 na lista, sendo ele "10:00"
        horarios.remove(1);
        horarios.add("14:00");

        // Exibe na tela o item de índice 1 na lista, sendo ele "12:00"
        System.out.println(horarios.get(1));
    }
}
