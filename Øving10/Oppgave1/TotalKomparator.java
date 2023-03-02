package Øvinger.Øving10.Oppgave1;

/**
 * Komparator som brukes for å sortere arrangementer etter henholdsvis sted, type og tidspunkt.
 */
public class TotalKomparator implements java.util.Comparator<Arrangement> {

    public int compare(Arrangement a1, Arrangement a2) {

        int stedCompare = a1.getSted().compareTo(a2.getSted()); // Sammenligner stedene
        int typeCompare = a1.getType().compareTo(a2.getType()); // Sammenligner typen arrangement

        if (stedCompare != 0) { // Sjekker om stedene er like eller ulike
            return stedCompare; // Hvis stedene er ulike
        } else if(typeCompare != 0) { // Hvis stedene like går den videre og sammenligner typen arrangement
            return typeCompare; // Hvis de er ulike
        } else if (a1.getTidspunkt() == a2.getTidspunkt()) { // Hvis typene også er like sammenlignes tidspunkt
            return 0; // Tidspunktet er likt
        } else if (a1.getTidspunkt() < a2.getTidspunkt()) {
            return -1; // a1 er før a2
        } else {
            return 1; // a1 er etter a2
        }
    }
}
