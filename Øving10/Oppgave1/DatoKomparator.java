package Øvinger.Øving10.Oppgave1;

/**
 * Komparator som brukes for å sammenligne datoene.
 */
public class DatoKomparator implements java.util.Comparator<Arrangement> {

    public int compare(Arrangement a1, Arrangement a2) {

        if (a1.getTidspunkt() == a2.getTidspunkt()) {
            return 0; // Tidspunktene er like
        } else if (a1.getTidspunkt() < a2.getTidspunkt()) {
            return -1; // a1 er før a2
        } else {
            return 1; // a1 er etter a2
        }
    }
}
