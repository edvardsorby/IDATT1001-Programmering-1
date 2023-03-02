package Øvinger.Øving6;

import java.util.Arrays;

public class Matrise {
    // final fordi den er immutabel
    private final int[][] matrise;
    private final int rader;
    private final int kolonner;

    /**
     * Konstruktør når man har verdiene til matrisen
     * @param matrise matrise lagd av bruker
     */
    public Matrise(int[][] matrise) {
        // Ikke ha sånn logikk i konstruktøren:
        for (int i = 1; i < matrise.length; i++) {
            if (matrise[i-1].length != matrise[i].length) {
                throw new IllegalArgumentException("Formatet i matrisen er ikke riktig.");
            }
        }

        this.matrise = matrise;
        rader = matrise.length;
        kolonner = matrise[0].length;
    }

    /**
     * Konstruktør når man bare har dimensjonene til matrisen
     * @param rader rader lest inn av metoden
     * @param kolonner kolonner lest inn av metoden
     */
    public Matrise(int rader, int kolonner) {
        matrise = new int[rader][kolonner];
        this.rader = rader;
        this.kolonner = kolonner;
    }

    public Matrise adder(Matrise matrise2) {
        if (rader != matrise2.rader || kolonner != matrise2.kolonner) {return null;}

        Matrise tempMatrise = new Matrise(rader, kolonner);

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                tempMatrise.matrise[i][j] = matrise[i][j] + matrise2.matrise[i][j];
            }
        }
        return tempMatrise;
    }

    public Matrise multipliser(Matrise matrise2) {
        if (kolonner != matrise2.rader) {return null;}
        Matrise tempMatrise = new Matrise(rader, matrise2.kolonner);

        for (int i = 0; i < tempMatrise.rader; i++) {
            for (int j = 0; j < tempMatrise.kolonner; j++) {
                for (int k = 0; k < tempMatrise.kolonner; k++) {
                    tempMatrise.matrise[i][j] += matrise[i][k] * matrise2.matrise[k][j];
                }
            }
        }
        return tempMatrise;
    }

    public Matrise transponer() {
        Matrise tempMatrise = new Matrise(kolonner, rader);

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                tempMatrise.matrise[j][i] = matrise[i][j];
            }
        }
        return tempMatrise;
    }

    public String toString() {
        String printMatrise = "";
        for (int i = 0; i < rader; i++) {
            printMatrise += Arrays.toString(matrise[i]) + "\n";
        }
        return printMatrise;
    }
}