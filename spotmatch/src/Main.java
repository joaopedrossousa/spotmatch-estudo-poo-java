import model.Audio;
import utils.Musica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Musica musica = new Musica();

        musica.setTitulo("Sunglasses At Night - Corey Hart");
        musica.setDuracao(5.20);

        while (true) {

            System.out.println("------------------------");
            System.out.println("        SPOTMATCH      ");
            System.out.println("------------------------");
            System.out.println("""
                    Selecione uma Opção:
                    [1] Reproduzir Musica
                    [2] Reproduzir Podcast
                    
                    [3] Fechar Reprodutor 
                    """);
            int opcaoSelecionada = scanner.nextInt();

            if (opcaoSelecionada == 3){
                System.out.println("Saindo...");
                break;
            } else if (opcaoSelecionada == 1) {
                musica.reproduzir();
                System.out.println(" ");
                musica.avaliacao();
                musica.informacoesMusica();


            }
                
            }
        }
    }

