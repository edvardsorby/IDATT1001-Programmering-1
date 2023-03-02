package Øvinger.Øving9;

public class Oppgaveoversikt {
    private Student[] studenter;
    private int antStud = 0;

    public int getAntStud() {
        return antStud;
    }

    /**
     * Finner antall oppgaver løst av en student
     * @param navn tar inn navnet til studenten
     * @return returnerer antallet oppgaver løst
     */
    public int getAntOppg(String navn) {
        return finnStudent(navn).getAntOppg();
    }

    /**
     * Registrerer en ny student
     * @param navn tar inn et navn
     * @param antOppg tar inn antall oppgaver løst
     */
    public void regNyStudent(String navn, int antOppg) {
        int nyLengde = antStud + 1;

        // Kopierer listen:
        Student[] studenterKopi = new Student[nyLengde];
        for (int i = 0; i < antStud; i++) {
            studenterKopi[i] = studenter[i];
        }
        // Oppretter en ny student bakerst i listen:
        studenterKopi[nyLengde-1] = new Student(navn,antOppg);

        studenter = studenterKopi;
        antStud++;
    }

    /**
     * Øker antallet oppgaver for en bestemt student
     * @param navn henter navnet til studenten
     * @param oekning henter antallet oppgaver man øker med
     */
    public void oekAntOppg(String navn, int oekning) {
        finnStudent(navn).oekAntOppg(oekning);
    }

    /**
     * Hjelpemetode for å finne riktig student i listen
     * @param navn tar inn navnet i form av en String
     * @return returnerer student-objektet med samme navn
     */
    private Student finnStudent(String navn) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn.trim())) {
                return studenter[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String svar = "Oppgaveoversikt: ";
        for (int i = 0; i < antStud; i++) {
            svar += studenter[i];
        }
        return svar;
    }
}