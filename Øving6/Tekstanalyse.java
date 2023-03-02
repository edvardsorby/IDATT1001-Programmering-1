package Øvinger.Øving6;

import java.text.NumberFormat;

public class Tekstanalyse {
    int[] antallTegn = new int[30];

    public Tekstanalyse(String input) {
        // Ikke ha logikk i konstruktøren!
        // En if-setning går bra, men hvis det blir for mye kan programmet krasje.
        // Bruk heller separate metoder som kalles på i konstruktøren.

        for (int i = 0; i < input.length(); i++) {
            int tall = input.toLowerCase().charAt(i)-97;
            if (tall >= 0 && tall <= 25) {
                antallTegn[tall]++;
            } else if (tall == 133) {// 230 - 97 = 133 (æ)
                antallTegn[26]++;
            } else if (tall == 151) {// 258 - 97 = 151 (ø)
                antallTegn[27]++;
            } else if (tall == 132) {// 229 - 97 = 132 (å)
                antallTegn[28]++;
            } else {
                antallTegn[29]++;
            }
        }
    }

    public int getForskjelligeBokstaver() {
        int antallForskjelligeBokstaver = 0;
        for (int i = 0; i < antallTegn.length-1; i++) {
            if (antallTegn[i] != 0) {
                antallForskjelligeBokstaver++;
            }
        }
        return antallForskjelligeBokstaver;
    }

    public int getAntallBokstaver() {
        int antallBokstaver = 0;
        for (int i = 0; i < antallTegn.length-1; i++) {
            antallBokstaver += antallTegn[i];
        }
        return antallBokstaver;
    }

    public String getProsentTegn() {
        double prosent = 0;
        double antallTegnTotalt = 0;
        for (int i = 0; i < antallTegn.length; i++) {
            antallTegnTotalt += antallTegn[i];
        }
        double tegn = antallTegn[29];
        prosent = tegn/antallTegnTotalt;
        String prosent2 = NumberFormat.getPercentInstance().format(prosent); // Caster fra double til String
        return prosent2;
    }

    public int getAntallDenneBokstaven(char bokstav) {
        int tall = Character.toLowerCase(bokstav)-97;
        return antallTegn[tall];
    }

    public String getMestBrukteBokstaver() {
        String stoersteBokstaver = "";
        int stoerst = 0;

        for (int i = 0; i < antallTegn.length-1; i++) {
            if (antallTegn[i] > stoerst) {
                stoersteBokstaver = "";
                stoerst = antallTegn[i];
                char tallTilBokstav = (char)(i+65);
                stoersteBokstaver += tallTilBokstav;
            } else if (antallTegn[i] == stoerst && antallTegn[i] != 0) {
                char tallTilBokstav = (char)(i+65);
                stoersteBokstaver += " og " + tallTilBokstav;
            }
        }
        return stoersteBokstaver + ": " + stoerst + " ganger.";
    }

    public int[] getAntallTegn() {
        return antallTegn;
    }
}


