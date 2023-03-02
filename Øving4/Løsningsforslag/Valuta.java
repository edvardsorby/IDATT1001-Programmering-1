package Øvinger.Øving4.Løsningsforslag;

public class Valuta {
    private double kurs; // 1 fremmed = kurs NOK
    private String navn;//Denne bruker vi for å kunne uthente navnet på kursene i slutten av klientprogrammet
    //private for å forhindre at man kan oppdatere verdien fra utenfor klassen, som for eksempel i klientprogrammet. 
    //Private bestemmer altså om man ønsker at den skal være modifiserbar. 
    //Siden variablene ikke blir brukt fr konstruktøren blir kjørt, kan vi bare definere dem i konstruktøren, så vi slipper å gi dem en verdi.
    
    //Konstruktør:
    public Valuta(String navn, double kurs) {
        //Public fordi ellers forsvinner poenget med å ha klasser og å ha dem i separate filer.
        //ValutaLoesning er bare en "blueprint"
        //Vi putter navn og kurs inne i parantesen for å få verdien av dem til å bli assigned til variablene på toppen avn klassen
        this.navn = navn;//Når vi lager en ny valuta i klientprogrammet vil konstruktøren kjøre og sette verdiene på riktig sted.
        this.kurs = kurs;//Disse verdiene blir da plassert i variablene på toppen
        //Lurt å bruke samme navnene og derfor også bruke this, for å ha så beskrivende navn som mulig
    }

    //Metode 1:
    public double tilNok(double mengde) {
        //Også public for å kunne referere til den fra klientprogrammet i en annen fil.
        //Vi tar 'mengde' inn, som den fremmede valutaen. Denne sendes inn fra klientprogrammet.
        //Vi ønsker at metoden skal returnere en verdi, og bruker derfor return.
        //Vi må ha return hvis datatypen ikke er riktig...
        return mengde * kurs;
        //Kursen har vi definert i konstruktøren, og mengden tar vi inn i denne metoden.
    }

    //Metode 2:
    public double fraNok(double mengde) {
        return mengde / kurs;
    }

    //get-metoden brukes for å gi oss verdien til navn
    public String getNavn() {//VS Code foreslår alt dette hvis man skriver 'get'
        return navn;
    }
}