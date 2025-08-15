package aula05;

// Classe DNA
// Objetivo: Definir a estrutura

public class Aluno {
    public int id;
    public int idade;
    public String nome;
    public String matricula;

    //declarando explicitamente o método construtor vazio
    // alémdecxriar objeto, executa o código contido no bloco 
    public Aluno(){
        System.out.println("chamou o construtor vazio!");
    }

    public Aluno(String nome){
        this.nome = nome; 
    }
    
    public Aluno(int id, String nome, String matricula, int idade){
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    // assinatura:
    // proteção + retorno + nome + parâmetros
    public void imprimirDados(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
    }

    // sobrecarga de métodos = repetição da mesma assinatura
    // mudando somente o parâmetro
    public void imprimirDados(int ordem){
        System.out.println("Aluno: " + ordem);
        imprimirDados();        
    }
}