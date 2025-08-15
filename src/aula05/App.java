package aula05;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.id = 10;
        aluno1.nome = "John Doe";
        aluno1.matricula = "202510070001";
        aluno1.idade = 19;

        aluno2.id = 11;
        aluno2.nome = "Alberto Vernaz";
        aluno2.matricula = "202510070002";
        aluno2.idade = 17;

        aluno3.id = 12;
        aluno3.nome = "Ingrid Precheco";
        aluno3.matricula = "202510070003";
        aluno3.idade = 18;

        Aluno aluno4 = aluno3;

        // imprimir dados
        aluno1.imprimirDados(1); 
        System.out.print("\n");
        aluno2.imprimirDados(2);
        System.out.print("\n");
        aluno3.imprimirDados(3);
        System.out.print("\n\n\n");
        
    }
    
}
