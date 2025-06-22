package Exercicio13; // Informa que está no pacote "Exercicio12"

import java.time.LocalTime; // Importa o pacote para trabalhar com horas

/*
   Esse código verifica se algo foi enviado dentro do tempo limite
   Faz uma verificação simples se o horário de envio é antes do horário limite
*/

public class Exercicio13 {
    public static void main(String[] args) {
        // Cria uma nova variável de tempo com horário definido as 23:00
        LocalTime envio = LocalTime.of(23, 0);

        // Cria uma nova variável de tempo com horário definido as 22:59
        LocalTime limite = LocalTime.of(22, 59);

        /*
        Se o horário de envio não for antes do horário de limite (!) então exibe a mensagem "Entrega fora do horário"
        Senão exibe "Tarefa enviada com sucesso"

         */
        if(!envio.isBefore(limite)) {
            System.out.println("Entrega fora do horário");
        } else {
            System.out.println("Tarefa enviada com sucesso");
        }
    }
}
