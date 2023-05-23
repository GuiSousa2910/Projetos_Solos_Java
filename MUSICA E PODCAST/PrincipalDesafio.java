package DESAFIOS.JAVA;

import DESAFIOS.JAVA.CALCULOS.CalculoDesafio;
import DESAFIOS.JAVA.PARTEDEAUDIO.Musica;
import DESAFIOS.JAVA.PARTEDEAUDIO.Podcast;
import java.util.Scanner;

public class PrincipalDesafio {
    public static void main(String[] args) {

        Scanner notinha = new Scanner(System.in);
        Scanner podcast = new Scanner(System.in);
        Scanner escolha = new Scanner(System.in);

        boolean f = true;
        Musica minhaMusica = new Musica();
        Podcast meuPodcast = new Podcast();

        int numero = 0;
        if (f) {
            while (numero != 3) {
                String opcoes = "Você gostaria de ouvir uma musica ou criar o seu podcast? \n" +
                        "1 - Para ouvir uma musica \n" +
                        "2 - Para criar o seu próprio podcast \n" +
                        "3 - Para sair";

                System.out.println(opcoes + "\n");
                System.out.println("Digite o numero de acordo com a opção desejada: ");
                numero = escolha.nextInt();

                switch (numero) {
                    case 1:
                        minhaMusica.setNome("ABC da Xuxa");
                        System.out.println("Está é a musica selecionada para você: " + minhaMusica.getNome() + "\n");
                        minhaMusica.setDuracao(3);
                        minhaMusica.setTotalDeReproducoes(100);
                        minhaMusica.setCurtidas(500);
                        minhaMusica.getFichaTecnica();
                        minhaMusica.setCantor("Xuxa");
                        minhaMusica.setAlbum("Mundo da Xuxa");
                        minhaMusica.setInformacoes();
                        System.out.println("Escreva uma nota de 0 - 10 para a musica");
                        int nota = notinha.nextInt();
                        minhaMusica.setClassificacao(nota);
                        CalculoDesafio avaliado = new CalculoDesafio();
                        avaliado.nota(minhaMusica);
                        System.exit(0);
                        break;

                    case 2:
                        System.out.println("Quem são os autores deste podcast?");
                        String autores = podcast.nextLine();
                        meuPodcast.setNomeDosApresentadores(autores);

                        System.out.println("Quantos numeros de episodios vocês pretendem ter?");
                        int numEpisodios = podcast.nextInt();
                        meuPodcast.setNumeroDeEpisodios(numEpisodios);

                        System.out.println("Qual sera o assunto principal do seu podcast?");
                        podcast.nextLine();
                        String assunto = podcast.nextLine();
                        meuPodcast.setAssuntoPodcast(assunto);

                        especificacoesPodcast(meuPodcast);
                        System.exit(0);
                    case 3:
                        System.out.println("Saindo...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Está opção não existe");
                        break;
                }
            }
        }
    }

    public static void especificacoesPodcast(Podcast meuPodcast) {
        meuPodcast.especificacoesPodcast();
    }
}