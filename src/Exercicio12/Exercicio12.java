package Exercicio12; // Informa que está no pacote "Exercicio12"

import java.time.DayOfWeek; // Importa o pacote para trabalhar com datas
import java.time.LocalDate; // Importa o pacote para trabalhar com datas

/*
   Neste código informamos uma data (10/06/2025)
   Dentro de um laço de repetição, verificamos se os dias são úteis ou não por 7 dias
*/

public class Exercicio12 {
    public static void main(String[] args) {
        // Cria uma nova varíavel "data" que recebe uma data definida (10/06/2025)
        LocalDate data = LocalDate.of(2025, 6, 10);
        int diasUteis = 0; // Variável inteira com valor de 0

        // Enquanto o valor de duasUteis for menor que 7 o código continua a rodar
        while (diasUteis < 7){
            // Adiciona mais um dia a variável "data" cada vez que o código compila
            data = data.plusDays(1);

            // Cria nova variável booleana que verifica se o dia é sábado ou domingo - caso seja retorna true senão false
            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY
                    ||
                    data.getDayOfWeek() == DayOfWeek.SUNDAY;

            // Cria uma nova variável booleana que retorna true se "data" for igual a 15/06/2025
            boolean feriado = data.equals(LocalDate.of(2025,6,15));

            // Se for diferente(!) de fimDeSemana e(&&) diferente(!) de feriado então adiciona +1 a "diasUteis"
            if (!fimDeSemana && !feriado) {
                diasUteis++;
            }
        }

        // Exibe o valor de "data" após o laço de repetição
        System.out.println(data);
    }
}
