package prova1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    public int id;
    public String nome;
    public boolean publica;
    public int totalMusicas;
    public int duracaoTotalSeg;
    public LocalDateTime dataCriacao;
    public List<Musica> musicas = new ArrayList<>(); // Lista presente na classe Playlist, mas associada a classe Musica, uma vez que esse elemento possui distintas características

    // Implementando o método construtor vazio da classe 'Playlist'
    public Playlist (){

    }

    // Implementando o método construtor cheio da classe 'Playlist'
    public Playlist (int id, String nome, boolean publica, int totalMusicas, int duracaoTotalSeg, LocalDateTime dataCriacao, List<Musica> musicas){
        this.id = id;
        this.nome = nome;
        this.publica = publica;
        this.totalMusicas = totalMusicas;
        this.duracaoTotalSeg = duracaoTotalSeg;
        this.dataCriacao = dataCriacao;
        this.musicas = musicas;

    }
}

