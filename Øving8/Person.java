package Øvinger.Øving8;

public class Person {
    private final String fornavn;
    private final String etternavn;
    private final int foedselsaar;

    /**
     * Oppretter et nytt objekt av klassen Person
     * @param fornavn henter inn fornavn
     * @param etternavn henter inn etternavn
     * @param foedselsaar henter inn fødselsår
     */
    public Person(String fornavn, String etternavn, int foedselsaar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.foedselsaar = foedselsaar;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getFoedselsaar() {
        return foedselsaar;
    }

    @Override
    public String toString() {
        return "Fornavn: " + fornavn + ", etternavn: " + etternavn +", fødselsår: " + foedselsaar;
    }
}
