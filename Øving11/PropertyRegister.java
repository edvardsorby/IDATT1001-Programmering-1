package Øvinger.Øving11;

import java.util.ArrayList;
import java.util.HashSet;

public class PropertyRegister {
    // Bruker HashSet, for å unngå at man legger inn flere av samme eiendom.
    private HashSet<Property> properties = new HashSet<Property>();

    /**
     * Henter inn brukerdata og legger til en ny eiendom i registeret.
     * @param municipalityNr kommunenummer
     * @param municipalityName kommunenavn
     * @param lotNr gårdsnummer
     * @param sectionNr bruksnummer
     * @param name navn på tomta
     * @param area tomtas areal
     * @param nameOfOwner navn på tomtas eier
     */
    public void addProperty(int municipalityNr, String municipalityName, int lotNr, int sectionNr, String name, double area, String nameOfOwner) {
        // Sjekker gyldig input:
        if (municipalityNr < 101 || municipalityNr > 5054) {
            System.out.println("Invalid municipality number.");
        } else if (lotNr <= 0) {
            System.out.println("Invalid lot number.");
        } else if (sectionNr <= 0) {
            System.out.println("Invalid section number.");
        } else if (area <= 0) {
            System.out.println("Invalid area.");
        } else {
            properties.add(new Property(municipalityNr, municipalityName, lotNr, sectionNr, name, area, nameOfOwner));
            System.out.println("The property was added successfully.");
        }
        // Denne testen burde heller vært i konstruktøren til Property.
        // Burde også brukt throw new exeption i stedet for å printe, og bruke try catch for å forhindre at programmet krasjer når det kommer en exeption.
    }

    /**
     * Sletter en bestemt eiendom fra registeret.
     * @param property eiendommen man ønsker å slette.
     */
    public void deleteProperty(Property property) {
        properties.remove(property);
        // Dette er bra måte å gjøre det på, og det finnes mange varianter.
        // Man kunne for eksempel sendt inn et navn som må være likt, eller override equals()-metoden
        // Da kunne man nemlig sjekket om det som blir sendt inn er likt med et bestemt objekt osv.
    }

    /**
     * Henter antallet eiendommer i registeret.
     * @return returnerer antallet eiendommer.
     */
    public int getNrOfProperties() {
        return properties.size();
    }

    /**
     * Finner én bestemt eiendom, basert på kommunenummer, gårdsnummer og bruksnummer.
     * @param municipalityNr kommunenummer
     * @param lotNr gårdsnummer
     * @param sectionNr bruksnummer
     * @return returnerer eiendommen hvis den fant den, hvis ikke returneres null.
     */
    public Property findProperty(int municipalityNr, int lotNr, int sectionNr) {
        Property foundProperty = null;
        for (Property property : properties) {
            if (property.getMunicipalityNr() == municipalityNr && property.getLotNr() == lotNr && property.getSectionNr() == sectionNr) {
                foundProperty = property;
            }
        }
        if (foundProperty == null) {
            System.out.println("Could not find a matching property.");
        } // For å unngå å printe ut 'null' i klientprogrammet bør denne if-setningen heller være i klientprogrammet.
        return foundProperty;
    }

    /**
     * Regner ut og henter gjennomsnittsarealet på eiendommene i registeret.
     * @return returnerer gjennomdsnittsarealet, i m^2.
     */
    public double getAvgArea() {
        double totalArea = 0;
        for(Property p : properties){
            totalArea += p.getArea();
        }
        return totalArea/getNrOfProperties();
    }

    /**
     * Finner alle eiendommene med et bestemt gårdsnummer.
     * @param lotNr gårdsnummeret man ønsker å søke etter.
     * @return returnerer en liste med alle eiendommene den fant i registeret.
     */
    public ArrayList<Property> getPropertiesWithLotNr(int lotNr) {
        // Oppretter en midlertidig liste for å fylle med eiendommer vi søker etter:
        ArrayList<Property> tempProperties = new ArrayList<Property>();

        for (Property p : properties) { // Går gjennom alle eiendommene
            if (p.getLotNr() == lotNr) { // Hvis eiendommens gårdsnummer er likt det ønskede gårdsnummeret
                tempProperties.add(p); // Legg til eiendommen i den midlertidige lista
            }
        }

        return tempProperties;
    }

    /**
     * Denne brukes for å printe ut hele lista.
     * @return den returnerer en String med alle eiendommene.
     */
    @Override
    public String toString() {
        String text = "Property register:\n";

        for (Property property : properties) {
            text += property;
        }

        return text;
    }
}
