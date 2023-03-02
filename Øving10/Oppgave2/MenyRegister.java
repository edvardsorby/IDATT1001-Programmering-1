package Øvinger.Øving10.Oppgave2;

import java.util.ArrayList;
import java.util.Iterator;

public class MenyRegister {
    private ArrayList<Meny> menyer = new ArrayList<Meny>();
    private ArrayList<Rett> retter = new ArrayList<Rett>();

    /**
     * Registrerer en ny rett i lista over alle rettene
     * @param navn navnet på retten
     * @param type typen rett
     * @param pris pris på retten
     * @param oppskrift oppskriften på retten
     */
    public void registrerRett(String navn, String type, int pris, String oppskrift) {
        Rett nyRett = new Rett(navn, type, pris, oppskrift);
        retter.add(nyRett);
    }

    /**
     * Søker gjennom alle rettene og finner en bestemt rett
     * @param navn henter inn et navn som parameter
     * @return returnerer objektet av den retten
     */
    public Rett finnRett(String navn) {
        for (Rett rett : retter) {
            if (rett.getNavn().equals(navn)) { // Sjekker om navnet til hver rett stemmer.
                return rett;
            }
        }
        return null; // Fant ikke retten
    }

    /**
     * Finner alle rettene av en gitt type
     * @param type henter inn en type fra klientprogrammet
     * @return returnerer en liste med alle rettene den fant
     */
    public ArrayList<Rett> finnRetter(String type) {
        // Oppretter en ny ArrayList med arrangementene på gitt sted:
        ArrayList<Rett> retterAvType = new ArrayList<Rett>();

        Iterator<Rett> iterator = retter.iterator(); // Bruker en iterator for å gå gjennom ArrayList
        while(iterator.hasNext()){
            Rett rett = iterator.next();
            if (rett.getType().equals(type)) retterAvType.add(rett);
        }
        if (retterAvType.size()>0)return retterAvType;
        else return null; // ingen funnet
    }

    /**
     * Registrerer en ny meny i registeret med menyer
     * @param nyeRetter tar inn en tabell med navn på de rettene man vil ha med
     */
    public void registrerMeny(String[] nyeRetter) { // Dette fungerer, men her hadde det kanskje vært greit å ta inn retter i stedet. Han sa noe om at agreggering hadde funket bra.
        Meny nyMeny = new Meny();

        for (String s : nyeRetter) {
            nyMeny.leggTilRett(finnRett(s)); // Bruker finnRett(navn) for å finne objektet, og legger til i menyen
        }

        menyer.add(nyMeny); // Legger til den nye menyen i menyregisteret
    }

    /**
     * Finner alle menyene i et gitt prisintervall
     * @param minPris henter inn minimumspris
     * @param maksPris henter inn maksimumspris
     * @return returnerer en liste med alle menyene den fant
     */
    public ArrayList<Meny> menyerIPrisIntervall (int minPris, int maksPris){
        // Oppretter en ny ArrayList med menyene i gitt prisintervall:
        ArrayList<Meny> menyerIprisIntervall = new ArrayList<Meny>();

        Iterator<Meny> iterator = menyer.iterator(); // Bruker en iterator for å gå gjennom ArrayList, for den kan gå både fram og tilbake.
        while(iterator.hasNext()){
            Meny meny = iterator.next();
            if (meny.getTotalPris() >= minPris && meny.getTotalPris() <= maksPris) menyerIprisIntervall.add(meny);
        }
        if (menyerIprisIntervall.size()>0) {
            return menyerIprisIntervall;
        } else {
            return null; // ingen funnet.
            // Bør heller returnere en tom liste og droppe else return null, som omtalt tidligere.
        }
    }
}
