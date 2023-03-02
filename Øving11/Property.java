package Øvinger.Øving11;

public class Property {
    private int municipalityNr;
    private String municipalityName;
    private int lotNr;
    private int sectionNr;
    private String name;
    private double area;
    private String nameOfOwner;

    /**
     * Oppretter en ny eiendom
     * @param municipalityNr kommunens nummer
     * @param municipalityName kommunens navn
     * @param lotNr eiendommens gårdsnummer
     * @param sectionNr eiendommens bruksnummer
     * @param name eiendommens eventuelle bruksnavn
     * @param area eiendommens areal i kvadratmeter
     * @param nameOfOwner navn på eier av eiendommen
     */
    public Property(int municipalityNr, String municipalityName, int lotNr, int sectionNr, String name, double area, String nameOfOwner) {
        // Her burde vi testet for gyldig input
        this.municipalityNr = municipalityNr;
        this.municipalityName = municipalityName;
        this.lotNr = lotNr;
        this.sectionNr = sectionNr;
        this.name = name;
        this.area = area;
        this.nameOfOwner = nameOfOwner;
    }

    /**
     * Henter kommunenummer.
     * @return returnerer kommunenummer.
     */
    public int getMunicipalityNr() {
        return municipalityNr;
    }

    /**
     * Henter kommunenavn.
     * @return returnerer kommunenavnet.
     */
    public String getMunicipalityName() {
        return municipalityName;
    }

    /**
     * Henter gårdsnummer.
     * @return returnerer gårdsnummeret.
     */
    public int getLotNr() {
        return lotNr;
    }

    /**
     * Henter bruksnummer.
     * @return returnerer bruksnummeret.
     */
    public int getSectionNr() {
        return sectionNr;
    }

    /**
     * Henter det eventuelle navnet til eiendommen.
     * @return returnerer navnet.
     */
    public String getName() {
        return name;
    }

    /**
     * Henter arealet til eiendommen.
     * @return returnerer arealet, i m^2.
     */
    public double getArea() {
        return area;
    }

    /**
     * Henter navnet til eiendommens eier.
     * @return returnerer eierens navn.
     */
    public String getNameOfOwner() {
        return nameOfOwner;
    }

    /**
     * Mutator-metode for å endre navnet på tomta.
     * @param name nytt navn på tomta.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mutator-metode for å endre navnet på eier.
     * @param nameOfOwner nytt navn, siden ei tomt kan skifte eiere.
     */
    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    /**
     * Setter sammen og henter eiendommens unike ID.
     * @return returnerer den unike ID-en.
     */
    public String getPropertyID() {
        return getMunicipalityNr() + "-" + getLotNr() + "/" + getSectionNr();
    }

    @Override
    public String toString() {
        return "Property: " +
                "Municipality number: " + municipalityNr +
                ". Municipality name: " + municipalityName +
                ". Lot number: " + lotNr +
                ". Section number: " + sectionNr +
                ". Name: " + name +
                ". Area: " + area +
                ". Name of owner: " + nameOfOwner +
                '\n';
    }
}
