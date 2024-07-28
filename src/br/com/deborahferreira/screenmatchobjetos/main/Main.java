package br.com.deborahferreira.screenmatchobjetos.main;

import br.com.deborahferreira.screenmatchobjetos.calculos.CalculadoraDeTempo;
import br.com.deborahferreira.screenmatchobjetos.calculos.FiltroRecomendacao;
import br.com.deborahferreira.screenmatchobjetos.modelos.Episodio;
import br.com.deborahferreira.screenmatchobjetos.modelos.Filme;
import br.com.deborahferreira.screenmatchobjetos.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme filmePreferido = new Filme("A Cinco Passos de Você", 2019);
        //filmePreferido.setNome("Barbie");
        //filmePreferido.setAnoDeLancamento(2019);
        filmePreferido.setDuracaoEmMinutos(150);
        filmePreferido.setIncluidoNoPlano(true);

        filmePreferido.exibeFichaTecnica();
        filmePreferido.avalia(9.5);
        filmePreferido.avalia(9.9);
        filmePreferido.avalia(9.0);
        System.out.println(filmePreferido.pegaMedia());

        Serie seriePreferida = new Serie("Gossip Girl", 2012);
        seriePreferida.setTemporadas(7);
        seriePreferida.setEpisodiosPorTemporada(20);
        seriePreferida.setMinutosPorEpisodio(45);
        seriePreferida.exibeFichaTecnica();
        System.out.println(seriePreferida.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(filmePreferido);
        System.out.println(calculadoraDeTempo.getTempoTotal());
        calculadoraDeTempo.inclui(seriePreferida);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(seriePreferida);
        primeiro.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(filmePreferido);
        filtro.filtrar(primeiro);

        var filmeDaDisney = new Filme("Enrolados", 2015);
        filmeDaDisney.setDuracaoEmMinutos(120);
        filmeDaDisney.avalia(10);

        var filmeDaMarvel = new Filme("Homem-Aranha: Sem Volta Para Casa", 2021);
        filmeDaMarvel.setDuracaoEmMinutos(150);
        filmeDaMarvel.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmePreferido);
        listaDeFilmes.add(filmeDaDisney);
        listaDeFilmes.add(filmeDaMarvel);
        System.out.println("A quantidade de filmes na lista é " + listaDeFilmes.size());
        System.out.println("O primeiro filme da lista é " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);
    }
}
