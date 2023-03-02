package Øvinger.Øving8;

public class ArbTaker {
    private final Person personalia;
    private final int arbtakernr;
    private final int ansettelsesaar;
    private double maanedsloenn;
    private double skatteprosent;

    /**
     * Konstruktør som oppretter et objekt av klassen ArbTaker
     * @param personalia henter personalia fra et objekt av klassen Person
     * @param arbtakernr henter oppgitt arbeidstakernummer
     * @param ansettelsesaar henter oppgitt ansettelsesår
     * @param maanedsloenn henter oppgitt månedslønn
     * @param skatteprosent henter oppgitt skatteprosent
     */
    public ArbTaker(Person personalia, int arbtakernr, int ansettelsesaar, double maanedsloenn, double skatteprosent) {
        this.personalia = personalia; // Kanskje egentlig mer rett i følge sekvensdiagrammet å skrive "new Person osv." (komposisjon?)
        this.arbtakernr = arbtakernr;
        this.ansettelsesaar = ansettelsesaar;
        this.maanedsloenn = maanedsloenn;
        this.skatteprosent = skatteprosent;
    }

    public Person getPersonalia() {
        return personalia;
    }

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getAnsettelsesaar() {
        return ansettelsesaar;
    }

    public double getMaanedsloenn() {
        return maanedsloenn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    /**
     * Setter ny månedslønn
     * @param maanedsloenn henter inn ny månedslønn fra brukeren
     */
    public void setMaanedsloenn(double maanedsloenn) {
        this.maanedsloenn = maanedsloenn;
    }

    /**
     * Setter ny skatteprosent
     * @param skatteprosent henter inn ny skatteprosent fra bruker
     */
    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    /**
     * Regner ut skatt per måned
     * @return returnerer utregnet skatt
     */
    public double skattPerMaaned() {
        // Ganger månedslønn med skatteprosent delt på 100:
        return maanedsloenn*skatteprosent/100;
    }

    /**
     * Regner ut bruttolønn
     * @return returnerer utregnet bruttolønn
     */
    public double bruttoLoenn() {
        // Ganger månedslønna med antall måneder:
        return maanedsloenn*12;
    }

    /**
     * Regner ut skattetrekk per år
     * @return returnerer skatt per måned
     */
    public double skattetrekkPerAar() {
        // Ganger skatten per måned med antall måneder med skattetrekk:
        // Juni er skattefri og desember har halv skatt
        return 10.5*skattPerMaaned();
    }

    /**
     * Henter og skriver navnet på formen: etternavn, fornavn.
     * @return returnerer navnet
     */
    public String navn() {
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }

    /**
     * Regner ut arbeidstakerens alder
     * @return returnerer denne alderen
     */
    public int alder() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int aar = kalender.get(java.util.Calendar.YEAR);

        // Finner alderen ved å subtrahere fødselsår fra nåværende år:
        return aar - personalia.getFoedselsaar();
    }

    /**
     * Regner ut antall år i bedriften
     * @return returnerer antallet år i bedriften
     */
    public int aarIBedriften() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int aar = kalender.get(java.util.Calendar.YEAR);

        // FInner antall år i bedriften ved å subtrahere ansettelsesåret fra det nåværende året:
        return aar - getAnsettelsesaar();
    }

    /**
     * Sjekker om arbeidstakeren har vært ansatt i mer enn et visst antall år
     * @param aar henter inn ønsket år å sjekke
     * @return returnerer true eller false
     */
    public boolean ansattLengerEnn(int aar) {
        // Sjekker om antall år i bedriften er større enn eller lik oppgitt år:
        return (aarIBedriften() >= aar);
    }

    @Override
    public String toString() {
        return "Navn: " + navn() +
                "\nArbeidstakernummer: " + arbtakernr +
                "\nAnsettelsesår: " + ansettelsesaar +
                "\nMånedslønn: " + maanedsloenn + " kr" +
                "\nSkatteprosent: " + skatteprosent + " %" +
                "\nSkatt per måned: " + skattPerMaaned() + " kr" +
                "\nBruttolønn per år: " + bruttoLoenn() + " kr" +
                "\nSkattetrekk per år: " + skattetrekkPerAar() + " kr";
    }
}
