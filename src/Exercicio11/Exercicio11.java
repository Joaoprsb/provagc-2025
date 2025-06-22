package Exercicio11; // Informa que está no pacote "Exercicio11

import java.time.LocalDate; // Importa o pacote para trabalhar com datas

/*
   Neste exercício, informamos uma data em específico em forma de variável "hoje"(09/06/2025)
   Criamos uma nova varíavel com o nome de "prazo" onde ela pega o valor de "hoje" e adiciona mais 10 dias "em cima"
   Exibe a data da variável "prazo"
*/

public class Exercicio11 {
    public static void main(String[] args) {
        // Cria a variável "hoje" com valor de data (09/06/2025)
        LocalDate hoje = LocalDate.of(2025, 6, 9);

        // Cria a variável "prazo" com valor de "data" + 10 dias
        LocalDate prazo = hoje.plusDays(10);

        // Exibe a data da variável "prazo"
        System.out.println(prazo);
    }
}
