package Øvinger.Øving10.Oppgave1;

public class Arrangement {
    private final int nummer;
    private final String navn;
    private final String sted;
    private final String arrangoer;
    private final String type;
    private final long tidspunkt;

    /**
     * Oppretter et nytt arrangement
     * @param nummer
     * @param navn
     * @param sted
     * @param arrangoer
     * @param type
     * @param tidspunkt
     */
    public Arrangement(int nummer, String navn, String sted, String arrangoer, String type, long tidspunkt) {
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangoer = arrangoer;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    public String getNavn() {
        return navn;
    }

    public String getSted() {
        return sted;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }

    /**
     * Omformer et tidspunkt til en dato
     * @return returnerer datoen
     */
    public int getDato() {
        String dato = String.valueOf(tidspunkt); // Caster tidspunktet til en String
        return Integer.parseInt(dato.substring(0,8)); // Velger ut kun de første 8 sifrene, og gjør om til datatypen int
        // Kunne også gjort det med heltallsdivisjon, for å fjerne de 4 siste sifrene.
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return nummer +
                ": Tidspunkt: " + tidspunkt +
                ". Sted: " + sted +
                ". Type: " + type +
                ". Navn: " + navn +
                ". Arrangør: " + arrangoer + ".\n";
    }
}
