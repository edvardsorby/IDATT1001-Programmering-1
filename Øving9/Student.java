package Øvinger.Øving9;

import java.util.Objects;

/**
 * @author Edvard
 */
public class Student {
    private final String navn;
    private int antOppg;

    /**
     * Oppretter en ny student
     * @param navn henter inn navn
     * @param antOppg henter inn antall oppgaver som er godkjent
     */
    public Student(String navn, int antOppg) {
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    /**
     * Øker antall oppgaver som er godkjent
     * @param oekning henter inn hvor mye antOppg skal øke med
     */
    public void oekAntOppg(int oekning) {
        antOppg += oekning;
    }

    @Override
    public String toString() {
        return navn + " har løst " + antOppg + " oppgaver. ";
    }
}


// Enkelt testprogram
class StudentTest {
    public static void main(String[] args) {
        // Oppretter en testStudent:
        String testNavn = "Ole Håvard";
        int testAntOppg = 13;
        Student testStudent = new Student(testNavn,testAntOppg);

        // Sjekker om getNavn() stemmer:
        if (Objects.equals(testStudent.getNavn(), testNavn)) {
            System.out.println("Test 1 vellykket");
        }

        // Sjekker om getAntOppg() stemmer:
        if (testStudent.getAntOppg() == testAntOppg) {
            System.out.println("Test 2 vellykket");
        }

        // Sjekker om oekAntOppg stemmer:
        int testOekning = 3;
        testStudent.oekAntOppg(testOekning);
        if (testStudent.getAntOppg() == testAntOppg+testOekning) {
            System.out.println("Test 3 vellykket");
        }

        // Printer ut toString:
        System.out.println(testStudent);

    }
}
