package Exercicio8; // Informa que está no pacote "Exercicio8"

/*
   Aqui temos um exemplo de como se instanciar um novo objeto da classe Usuario
*/

public class Usuario {
    String nome; // Atributo "nome" do tipo String
    int idade; // Atributo "idade" do tipo inteiro

    // Construtor onde na inicialização do objeto necessita informar o nome e a idade do mesmo
    public Usuario(String n, int i){
        nome = n;
        idade = i;
    }

    public static void main(String[] args) {
        Usuario u = new Usuario("João", 25); // Forma correta de se instanciar um novo objeto da classer Usuario
    }
}
