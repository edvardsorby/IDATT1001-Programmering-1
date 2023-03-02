package Øvinger.Øving7;

public class TekstbehandlingKlient {
    public static void main(String[] args) {
        String tekst = "Denne setningen er en test. Den kan ikke forkortes! Men kan den gjøre noe annet?";

        Tekstbehandling test = new Tekstbehandling(tekst);

        System.out.println("Antall ord: " + test.getAntallOrd());
        System.out.println("Gjennomsnittlig ordlengde: " + test.getAvgOrdlengde());
        System.out.println("Gjennomsnitlig antall ord per periode: " + test.getOrdPerPeriode());
        System.out.println("Erstatt ord: " + test.erstattOrd("setningen", "stringen"));
        System.out.println("Tekst uten endringer: " + test.getTekst());
        System.out.println("Store bokstaver: " + test.getTekstCaps());
    }
}
