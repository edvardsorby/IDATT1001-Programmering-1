package Øvinger.Øving10.Oppgave2;

import java.util.HashSet;

public class Meny {
    private HashSet<Rett> menyRetter = new HashSet<Rett>(); // Sett, så vi bare kan ha én av hver rett
    private int totalPris;

    /**
     * Legger til en ny rett i denne menyen
     * @param nyRett tar inn en ny rett av klassen Rett
     */
    public void leggTilRett(Rett nyRett) {
        menyRetter.add(nyRett);
        totalPris += nyRett.getPris();
        System.out.println("Totalpris: " + totalPris + " " + nyRett.getNavn());
    }

    public int getTotalPris() {
        return totalPris;
    }

    @Override
    public String toString() {
        return "Meny{" +
                "menyRetter=" + menyRetter +
                ", totalPris=" + totalPris +
                '}';
    }
}
