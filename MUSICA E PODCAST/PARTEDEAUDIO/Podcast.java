package DESAFIOS.JAVA.PARTEDEAUDIO;

public class Podcast extends Audio {

    private int numeroDeEpisodios;
    private String nomeDosApresentadores;
    private String assuntoPodcast;

    public void especificacoesPodcast(){
        System.out.println("Os apresentadores do seu podcast são: " + getNomeDosApresentadores());
        System.out.println("A media de episodios que vocês gostaria de ter no seu podcast é de: " + getNumeroDeEpisodios());
        System.out.println("O seu podcast terá o assunto virado para " + getAssuntoPodcast() + "\n");
        System.out.println("Com essas informações acreditamos que seu podcast será de extremo sucesso!!");
    }

    public String getNomeDosApresentadores() {
        return nomeDosApresentadores;
    }
    public void setNomeDosApresentadores(String nomeDosApresentadores) {
        this.nomeDosApresentadores = nomeDosApresentadores;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }
    public void setNumeroDeEpisodios(int numeroDeEpisodios){
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public String getAssuntoPodcast() {
        return assuntoPodcast;
    }
    public void setAssuntoPodcast(String assuntoPodcast) {
        this.assuntoPodcast = assuntoPodcast;
    }
}
