package prova1;

public class Musica {
    public int id;
    public String titulo;
    public String artista;
    public int duracaoSeg;
    public String genero;

    // Implementando o método construtor vazio da classe 'Musica'
    public Musica (){

    }

    // Implementando o método construtor cheio da classe 'Musica'
    public Musica (int id, String titulo, String artista, int duracaoSeg, String genero){
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSeg = duracaoSeg;
        this.genero = genero;
    }
}



