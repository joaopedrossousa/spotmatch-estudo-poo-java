package utils;

import model.Audio;

import java.util.Scanner;

public class Musica extends Audio implements Comportamentos{
    //Contrutor para atribuir e icremetar a quantidade de visualizacoes;
    public Musica(){
        this.totalDeReproducoes = 1000;
        this.curtidas = 0;
        this.classificacao = 3.8;
    }



    @Override
    public void reproduzir() {
        System.out.println("""
                Reproduzindo:
                %s
                Duração: %.1f minutos
                """.formatted(getTitulo(), getDuracao()));
        totalDeReproducoes += 1;

    }

    @Override
    public void avaliacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Curtir música? [1] SIM [2] NÃO");
        int opcaoSelecionada = scanner.nextInt();
        if (opcaoSelecionada == 1){
            curtidas += 1;
        }
        System.out.println("Infome uma nota de 0 a 5: ");
        double notaInformada = scanner.nextDouble();
        classificacao = ((classificacao * totalDeReproducoes) + notaInformada) / totalDeReproducoes;

    }

    public void informacoesMusica(){
        System.out.println("Total de Visualizações: " + totalDeReproducoes);
        System.out.println("Total de Curtidas " + curtidas);
    }




}
