package br.com.deborahferreira.screenmatchobjetos.main;

import br.com.deborahferreira.screenmatchobjetos.modelos.Filme;
import br.com.deborahferreira.screenmatchobjetos.modelos.Serie;
import br.com.deborahferreira.screenmatchobjetos.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainLista {
    public static void main(String[] args) {

        Filme filmePreferido = new Filme("A Cinco Passos de Você", 2019);
        filmePreferido.avalia(10);
        var filmeDaDisney = new Filme("Enrolados", 2015);
        filmeDaDisney.avalia(10);
        var filmeDaMarvel = new Filme("Homem-Aranha: Sem Volta Para Casa", 2021);
        filmeDaMarvel.avalia(10);
        Serie seriePreferida = new Serie("Gossip Girl", 2012);
        seriePreferida.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmePreferido);
        listaDeFilmes.add(filmeDaDisney);
        listaDeFilmes.add(filmeDaMarvel);
        System.out.println("O tamanho da lista é " + listaDeFilmes.size());
        System.out.println("O primeiro filme é " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(filmePreferido);
        listaDeTitulos.add(filmeDaDisney);
        listaDeTitulos.add(filmeDaMarvel);
        listaDeTitulos.add(seriePreferida);

        System.out.println(listaDeTitulos);
        for (Titulo item: listaDeTitulos) {
            System.out.println(item);
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("A sua classificação é " + filme.getClassificacao() + " estrelas.");
            }
        }

        ArrayList<String> listaDeAtores = new ArrayList<>();
        listaDeAtores.add("Deborah Ferreira");
        listaDeAtores.add("Igor Ribeiro");
        listaDeAtores.add("Chantilly");
        listaDeAtores.add("Sofia Melo");
        System.out.println(listaDeAtores);
        System.out.println("Ordenando por ordem alfabética:");
        Collections.sort(listaDeAtores);
        System.out.println(listaDeAtores);

        System.out.println(listaDeTitulos);
        System.out.println("Ordenando por ordem alfabética:");
        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);
        System.out.println("Ordenando por ano:");
        listaDeTitulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaDeTitulos);
    }
}
