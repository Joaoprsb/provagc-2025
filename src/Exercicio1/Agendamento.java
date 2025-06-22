package Exercicio1; // Informa que está no pacote "Exercício1"

import java.time.LocalDate; // Importa o pacote para trabalhar com datas

/*
   Classe Exercicio1.Agendamento
   Neste código utilizamos um pacote para trabalhar com datas
   Utilizamos uma data sugerida (01/06/2025) e utilizamos a variável "dias" de valor 7 para alterar a primeira data.
   Por fim, exibimos a nova data com um "System.out.println()"
*/

public class Agendamento {
    public static void main(String[] args) {
        // Define a data "base" para utilizar (01/06/2025)
        LocalDate base = LocalDate.of(2025, 6, 1);

        // Variável inteira "dias" de valor 7
        int dias = 7;

        // Cria uma nova variável "novaData" onde o valor dela é com base na primeira data
        // + (dias * 2 - 3)
        LocalDate novaData = base.plusDays(dias * 2 - 3);

        // Exibe apenas o dia do mês da variável novaData (12)
        System.out.println(novaData.getDayOfMonth());
    }
}
