package Exercicio2; // Informa que está no pacote "Exercicio2"

/*
   Classe Exercicio2.Avaliacao
   Neste código utilizamos uma simples verificação de variáveis para retornar se é "aprovado" ou "Revisar conteúdo"
   Utiliza-se de casting para isso, porém é necessário prestar atenção na questão para que não tenha problemas
*/

public class Avaliacao {
    public static void main(String[] args) {
        // Variável inteira "nota" de valor 7
        int nota = 7;

        // Variável inteira "peso" de valor 2
        int peso = 2;

        // Variável com números decimais "media" onde se utiliza cálculo para saber o valor
        double media = (nota * peso + 6 * 3) / 5;

        // Verificação - Se media foi maior ou igual a 7.0 então retorna o primeiro argumento, senão retorna o segundo
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar conteúdo");
        }

        // Adicionei este System.out.println apenas para verificar o valor de "media"
        System.out.println(media);
    }
}
