package DESAFIOS.JAVA.PARTEDEAUDIO;

import DESAFIOS.JAVA.CALCULOS.Classificavel;

public class Musica extends Audio implements Classificavel {

    private String cantor;
    private String album;
    private String informacoes;
    private int classificacao;

    public void setInformacoes(){
        System.out.println("A cantora desta musica é a " + cantor + ".");
        System.out.println("Ela cantou está musica no album " + album);
    }

    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
