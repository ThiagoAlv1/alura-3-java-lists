package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        var filme1 = new Filme("O poderoso chefão", 1970);
        filme1.avalia(9);
        var filme2 = new Filme("Avatar", 2023);
        filme2.avalia(6);
        var filme3 = new Filme("Dogville", 2003);
        filme3.avalia(10);
        var serie1 = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);


        for (Titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Thiago");
        buscaPorArtistas.add("Livia");
        buscaPorArtistas.add("Daniel");
        System.out.println(buscaPorArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);
    }
}
