package Exercicio5; // Informa que está no pacote "Exercicio5"

/*
   Neste código trabalhamos com o laço de repetição for
   Enquanto o valor declarado dentro dos parênteses não for cumprido, o laço continua a se repetir
   Por fim, é exibido o valor final da variável "notificacoes"
*/

public class Exercicio5 {
    public static void main(String[] args) {
        int notificacoes = 0; // Variável "notificacoes" do tipo inteiro de valor 0

        // laço de repetição para incrementar valores a variável "notificacoes"
        /*
        Aqui a verificação continua enquanto o valor de "i" for menor ou igual a 5
        Após cada "ciclo" ele incrementa "i" com +1
         */
        for (int i = 1; i <= 5; i++) {
            // Caso o resto da divisão de i por 2 seja igual a 0 então o código aplica: notificações = notificacoes + 2
            if (i % 2 == 0){
                notificacoes += 2;
            }
            // Caso a verificação acima não seja verdadeira, então o código adiciona +1 ao valor de "notificacoes"
            else {
                notificacoes++;
            }
        }

        // Exibe o valor final de "notificacoes" após o código rodar por completo
        System.out.println(notificacoes);
    }
}
