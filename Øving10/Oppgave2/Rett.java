package Øvinger.Øving10.Oppgave2;

import java.util.Objects;

public class Rett {
    private final String navn;
    private final String type;
    private final int pris;
    private final String oppskrift;

    /**
     * Oppretter en ny rett
     * @param navn
     * @param type
     * @param pris
     * @param oppskrift
     */
    public Rett(String navn, String type, int pris, String oppskrift) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public String getType() {
        return type;
    }

    public int getPris() {
        return pris;
    }

    // Det her trengs for at hashSet skal fungere. Ellers vet den ikke hva som defineres som to av det samme objektet.
    // I dette eksempelet sa vi at like navn er nok til at de skal regnes som like,
    // men når man genererer en equals-metode kan man velge alle objektvariablene hvis man vil.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rett rett = (Rett) o;
        return Objects.equals(navn, rett.navn);
    }

    // Dette er vel også en del av det over.
    @Override
    public int hashCode() {
        return Objects.hash(navn);
    }

    // Generate -> equals() and hashCode(), for å velge hva man skal inkludere.

    @Override
    public String toString() {
        return "Rett{" +
                "navn='" + navn + '\'' +
                ", type='" + type + '\'' +
                ", pris=" + pris +
                ", oppskrift='" + oppskrift + '\'' +
                '}';
    }
}
