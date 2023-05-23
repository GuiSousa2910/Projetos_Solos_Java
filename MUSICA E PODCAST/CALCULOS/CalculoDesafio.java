package DESAFIOS.JAVA.CALCULOS;

import DESAFIOS.JAVA.PARTEDEAUDIO.Audio;

public class CalculoDesafio extends Audio {

    public void nota (Classificavel c){
        if (c.getClassificacao() == 10 && c.getClassificacao() > 8 ){
            System.out.println("Colocaremos essa musica em sua playlist!");
        } else if (c.getClassificacao() <= 8 && c.getClassificacao() >= 6 ) {
            System.out.println("Te recomendaremos mais musicas como essa!");
        }else if (c.getClassificacao() <= 5 && c.getClassificacao() >= 0) {
                System.out.println("Recomendaremos menos musicas como essa.");
            } else {
                System.out.println("Por favor classifique está musica somente com numeros entre 1 - 10.");
            }
        }
    }