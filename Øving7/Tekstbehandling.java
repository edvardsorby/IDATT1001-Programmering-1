package Øvinger.Øving7;

public class Tekstbehandling {
    String tekst;

    /**
     * Konstruktør som henter teksten
     * @param tekst tekst fra bruker
     */
    Tekstbehandling(String tekst) {
        this.tekst = tekst;
    }

    public int getAntallOrd() {
        //Deler opp teksten i ord:
        String[] ord = tekst.split(" ");
        return ord.length;
    }

    public double getAvgOrdlengde() {
        // Deler opp teksten, uten tegnene:
        String[] ord = tekst.split("[ .!:?]");

        int antallBokstaver = 0;
        int antallOrd = 0;

        for (int i = 0; i < ord.length; i++) {
            // Hvis ordet ikke er tomt:
            if (ord[i] != "") {
                antallBokstaver += ord[i].length();
                antallOrd++;
            }
        }
        return (double)(antallBokstaver)/(double)(antallOrd);
    }

    public double getOrdPerPeriode() {
        // Deler teksten inn i perioder:
        String[] ord = tekst.split("[.!:?]");
        int antallPerioder = ord.length;

        // Deler periodene inn i enkeltord og fjerner mellomrom:
        ord = tekst.strip().split(" ");
        int antallOrd = ord.length;

        return (double)(antallOrd)/(double)(antallPerioder);
    }

    public String erstattOrd(String ord, String nyttOrd) {
        return tekst.replace(ord, nyttOrd);
    }

    public String getTekst() {
        return tekst;
    }

    public String getTekstCaps() {
        return tekst.toUpperCase();
    }
}
