package Exercicio7; // Informa que está no pacote "Exercicio7"

/*
   Neste código instanciamos um novo objeto da classe Livro
   o objeto possuí nome e podemos fazer a verificação se ele está disponível por meio do metodo "emprestar()"
*/

public class Livro {
    String titulo; // Atributo do tipo String chamado "titulo"
    boolean emprestado; // Atributo do tipo booleano chamado "emprestado"

    // Quando este metodo é chamado o valor de "emprestado" do objeto se torna true (verdadeiro)
    public void emprestar() {
        emprestado = true;
    }

    // Este metodo faz uma verificação se a variável "emprestado" do objeto está setada como true ou false
    public String status() {
        // Se "emprestado" estiver como true, então ele retorna "Indisponível" e finaliza a verificação e o metodo
        if(emprestado){
            return "Indisponível";
        }
        // Caso a verificação acima não seja verdadeira então ele retorna "Disponível"
        return "Disponível";
    }

    public static void main(String[] args) {
        Livro l = new Livro(); // Instancia um novo objeto da classe Livro
        l.titulo = "Java para Iniciantes"; // Informa que o atributo "titulo" do objeto "l" é "Java para Iniciantes"

        // Faz a verificação se o livro está emprestado e retorna a informação
        System.out.println(l.status());

        // "Seta" emprestado como true
        l.emprestar();

        // Faz a verificação se o livro está emprestado e retorna a informação
        System.out.println(l.status());
    }
}
