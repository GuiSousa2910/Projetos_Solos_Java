package DESAFIOS.JAVA.PARTEDEAUDIO;

public class Audio {

    private String nome;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public void getFichaTecnica() {
        System.out.println("O nome da musica é: " + nome);
        System.out.println("O tempo de duração da musica é: " + duracao + " minutos.");
        System.out.println("Esta musica tem um total de " + totalDeReproducoes + " reproduções.");
        System.out.println("A musica ja foi curtida " + curtidas + " vezes.");
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }
    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
