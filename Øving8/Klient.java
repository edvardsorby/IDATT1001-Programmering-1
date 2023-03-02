package Øvinger.Øving8;

import static javax.swing.JOptionPane.*;

public class Klient {
    public static void main(String[] args) {

        // Oppretter et nytt objekt av klassen Person:
        Person person1 = new Person("Ola", "Halvorsen", 1990);

        // Oppretter et nytt objekt av klassen ArbTaker, med det
        ArbTaker arbeidstaker1 = new ArbTaker(person1, 7, 2009, 37000, 30);

        // Testklient
        // Tester alle metodene og resultatene:

        System.out.println("Fornavn: " + person1.getFornavn());
        System.out.println("Etternavn: " + person1.getEtternavn());
        System.out.println("Fødselsår: " + person1.getFoedselsaar());

        System.out.println("\nPersonalia: " + arbeidstaker1.getPersonalia());
        System.out.println("Arbeidstakernummer: " + arbeidstaker1.getArbtakernr());
        System.out.println("Ansettelsesår: " + arbeidstaker1.getAnsettelsesaar());
        System.out.println("Månedslønn: " + arbeidstaker1.getMaanedsloenn());
        System.out.println("Skatteprosent: " + arbeidstaker1.getSkatteprosent());

        System.out.println("Skatt per måned: " + arbeidstaker1.skattPerMaaned());
        System.out.println("Bruttolønn: " + arbeidstaker1.bruttoLoenn());
        System.out.println("Skattetrekk per år: " + arbeidstaker1.skattetrekkPerAar());
        System.out.println("Navn: " + arbeidstaker1.navn());
        System.out.println("Alder: " + arbeidstaker1.alder());
        System.out.println("År i bedriften: " + arbeidstaker1.aarIBedriften());
        System.out.println("Ansatt lenger enn 10 år: " + arbeidstaker1.ansattLengerEnn(10));

        // Menystyrt program
        // Går i loop til brukeren er ferdig med programmet
        while (true){

            // Lar brukeren bestemme hva som skal gjøres
            String input = showInputDialog(null,"1: Hent info \n2: Endre månedslønn \n3: Endre skatteprosent \n4: Avslutt","Velkommen, " + person1.getFornavn() + " " + person1.getEtternavn() ,QUESTION_MESSAGE);
            int tall = Integer.parseInt(input);

            // Utfører valgt handling
            switch (tall) {
                case 1: {
                    // Henter nåværende info

                    showMessageDialog(null, arbeidstaker1);

                    break;
                }
                case 2: {
                    // Angir ny månedslønn

                    input = showInputDialog("Angi ny månedslønn:");
                    int maanedsloenn = Integer.parseInt(input);

                    arbeidstaker1.setMaanedsloenn(maanedsloenn);

                    break;
                }
                case 3: {
                    // Angir ny skatteprosent

                    input = showInputDialog("Angi ny skatteprosent:");
                    int skatteprosent = Integer.parseInt(input);

                    arbeidstaker1.setSkatteprosent(skatteprosent);

                    break;
                }
                default: {
                    //Avslutter programmet

                    System.exit(0);
                    break;
                }
            }
        }
    }
}
