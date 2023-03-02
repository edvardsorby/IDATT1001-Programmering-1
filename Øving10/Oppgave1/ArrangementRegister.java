package Øvinger.Øving10.Oppgave1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrangementRegister {
    private final ArrayList<Arrangement> arrangementer = new ArrayList<Arrangement>();

    /**
     * Oppretter og registrerer et nytt arrangement i registeret
     * @param navn navn på arrangementet
     * @param sted stedet arrangementet foregår
     * @param arrangoer arrangøren av arrangementet
     * @param type typen arrangement
     * @param tidspunkt tidspunktet arrangementet holdes
     */
    public void regNyttArrengement(String navn, String sted, String arrangoer, String type, long tidspunkt) {
        int nummer = arrangementer.size(); // Gir hvert nye arrangement et nytt nummer i rekkefølge.
        Arrangement nyttArrangement = new Arrangement(nummer, navn, sted, arrangoer, type, tidspunkt);
        arrangementer.add(nyttArrangement);
    }

    /**
     * Finner alle arrangementene på et bestemt sted
     * @param sted henter inn valgt sted fra klientprogrammet
     * @return returnerer alle arrangementene den finner
     */
    public String hentAllePaaSted(String sted){ // Bør heller returnere en liste med f.eks. Strings
        // Oppretter en ny ArrayList med arrangementene på gitt sted:
        ArrayList<Arrangement> fraSted = new ArrayList<Arrangement>();

        Iterator<Arrangement> iterator = arrangementer.iterator(); // Bruker en iterator for å gå gjennom ArrayList
        while(iterator.hasNext()){
            Arrangement arrangement = iterator.next();
            if (arrangement.getSted().equals(sted)) fraSted.add(arrangement);
        }
        if (fraSted.size()>0)return arrayListToString(fraSted);
        else return null; // ingen funnet
        // Fikk tilbakemelding på at det var bedre å bare returnere en liste med f.eks. Strings, i stedet for kun en String.
        // Da kan man også droppe else return null, siden den heller bar vil returnere en tom liste da.
    }

    /**
     * Finner alle arrangementene på en gitt dato
     * @param dato henter inn ønsket dato fra klientprogrammet
     * @return returnerer alle arrangementene den finner
     */
    public String hentAllePaaDato(int dato){
        // Oppretter en ny ArrayList med arrangementene på gitt dato:
        ArrayList<Arrangement> paaDato = new ArrayList<Arrangement>();

        Iterator<Arrangement> iterator = arrangementer.iterator(); // Bruker en iterator for å gå gjennom ArrayList
        while(iterator.hasNext()){
            Arrangement arrangement = iterator.next();
            if (arrangement.getDato() == dato) paaDato.add(arrangement);
        }
        if (paaDato.size()>0)return arrayListToString(paaDato);
        else return null; // ingen funnet
    }

    /**
     * Finner alle arrangementene i et gitt datointervall
     * @param startDato henter inn startdato
     * @param sluttDato henter inn sluttdato
     * @return returnerer alle arrangementene som den finner
     */
    public String hentAlleIDatoIntervall(int startDato, int sluttDato){
        // Oppretter en ny ArrayList med arrangementene i gitt datointervall:
        ArrayList<Arrangement> paaDato = new ArrayList<Arrangement>();

        Iterator<Arrangement> iterator = arrangementer.iterator(); // Bruker en iterator for å gå gjennom ArrayList
        while(iterator.hasNext()){
            Arrangement arrangement = iterator.next();
            if (arrangement.getDato() >= startDato && arrangement.getDato() <= sluttDato) paaDato.add(arrangement);
        }
        if (paaDato.size()>0) {

            // Sorterer vha. List.sort med DatoKomparator som komparator:
            // paaDato.sort(new DatoKomparator());

            // Bedre variant, foreslått av Tobias:
            // Comparator.comparing(Arrangement::getDato).thenComparing(Arrangement::getSted);

            Collections.sort(paaDato, Comparator.comparing(Arrangement::getDato));
            // Det .sort gjør er at den sammenligner to og to objekter i lista.
            // Hvis svaret i comparatoren gir blir 1 skal de bytte plass, hvis den blir -1 skal de ikke...
            // (Eller noe sånt)
            // Så går den gjennom hele lista og sammenligner to og to, til den er sortert ferdig.

            return arrayListToString(paaDato);
        } else {
            return null; // ingen funnet
        }
    }

    public String hentAlleArrangementer() {
        // Lager en kopi av lista:
        ArrayList<Arrangement> tempArrangementer = new ArrayList<Arrangement>(arrangementer);

        // Sorterer vha. List.sort med TotalKomparator som komparator:
        // tempArrangementer.sort(new TotalKomparator());

        // Bedre variant igjen, som sammenligner først sted, så type, så tidspunkt.
        Collections.sort(tempArrangementer, Comparator.comparing(Arrangement::getSted).thenComparing(Arrangement::getType).thenComparing(Arrangement::getTidspunkt));

        // Returnerer en String med den sorterte lista:
        return arrayListToString(tempArrangementer);
    }

    /**
     * Metode som formaterer ArrayListene som Strings
     * @param arrayList tar inn en ArrayList
     * @return returnerer en String som kan brukes i klientprogrammet
     */
    private String arrayListToString(ArrayList<Arrangement> arrayList) {
        String svar = "";

        for (Arrangement arrangement : arrayList) {
            svar += arrangement;
        }
        return svar;

    }
}
