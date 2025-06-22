package Exercicio4; // Informa que está no pacote "Exercicio4"

/*
   Neste código utilizamos uma verificação de if/else para saber o nível de prioridade e urgência de uma tarefa
   Utilizamos como medição as próprias variáveis: "prioridade" e "urgencia"
   Após a verificação de valores, retorna a mensagem condizente com o tipo de tarefa
*/


public class Exercicio4 {
    public static void main(String[] args) {
        int prioridade = 4; // Variável "prioridade" do tipo inteiro de valor 4
        int urgencia = 8; // Variável "urgencia" do tipo inteiro de valor 8

        // Verificação para saber qual o tipo de tarefa
        // Se o valor de "prioridade" for maior que 3 E(&&) o valor de "urgencia" for maior que 7
        // Então exibe a mensagem "Tarefa crítica"
        if (prioridade > 3 && urgencia > 7) {
            System.out.println("Tarefa crítica");
        }
        // Se o valor de "prioridade" for maior que 3 OU(||) o valor de "urgencia" for maior que 7
        // Então exibe a mensagem "Tarefa importante"
        else if (prioridade > 3 || urgencia > 7) {
            System.out.println("Tarefa importante");
        }
        // Caso nenhuma das verificações acima for verdadeira, então exibe "Tarefa comum"
        else {
            System.out.println("Tarefa comum");
        }
    }
}
