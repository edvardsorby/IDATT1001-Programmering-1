public class Terningspill {
    public static void main(String[] args) {
        int rundeNummer = 0;

        Spiller spiller1 = new Spiller();
        Spiller spiller2 = new Spiller();

        while(!spiller1.erFerdig() && !spiller2.erFerdig()){
            rundeNummer++;

            spiller1.kastTerningen();
            spiller2.kastTerningen();

            System.out.println("Runde " + rundeNummer + ":");
            System.out.println("Spiller 1: " + spiller1.getSumPoeng() + " poeng");
            System.out.println("Spiller 2: " + spiller2.getSumPoeng() + " poeng");
        }
        System.out.println("Spiller 1 endte med " + spiller1.getSumPoeng() + " poeng og spiller 2 endte med " + spiller2.getSumPoeng() + " poeng, på runde " + rundeNummer);
    }
}
