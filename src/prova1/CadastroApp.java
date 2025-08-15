package prova1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    public static void main(String[] args) {

        // Instanciando três músicas a partir do método construtor cheio previamente criado
        Musica musica1 = new Musica(001, "Always", "Bon Jovi", 366, "Rock");
        Musica musica2 = new Musica(002, "Coleção", "Cassiano", 191, "R&B/soul");
        Musica musica3 = new Musica(002, "A Estrada", "Cidade Negra", 249, "MPB/Pop");

        // Criando a lista de músicas e adicionando as músicas nela
        ArrayList<Musica> listaDeMusicas = new ArrayList<>();
        listaDeMusicas.add(musica1);
        listaDeMusicas.add(musica2);
        listaDeMusicas.add(musica3);

        // Associando atributos a classe 'Playlist'
        Playlist playlist = new Playlist(01, "Só o néctar musical", false, 3, 700, LocalDateTime.now(), List.of(musica1, musica2, musica3)); 
    
            System.out.println("\n\n============== P L A Y L I S T S ==============");
            System.out.println("\n-> ID : " + playlist.id);
            System.out.println("-> NOME : " + playlist.nome);
            System.out.println("-> PÚBLICA : " + playlist.publica);
            System.out.println("-> TOTAL DE MÚSICAS : " + playlist.totalMusicas);
            System.out.println("-> DATA DE CRIAÇÃO : " + playlist.dataCriacao);
            System.out.println("\n============== M Ú S I C A S ==============");

            for(Musica musica : playlist.musicas){
                
                System.out.println("\n-> ID : " + musica.id);
                System.out.println("-> TÍTULO : " + musica.titulo);
                System.out.println("-> ARTISTA : " + musica.artista);
                System.out.println("-> DURAÇÃO EM SEGUNDOS : " + musica.duracaoSeg);
                System.out.println("-> GÊNERO : " + musica.genero);
            }
            System.out.println("\n\n\n");
       }
}

