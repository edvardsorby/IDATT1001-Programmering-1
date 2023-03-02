package Øvinger.Øving6;

import java.util.*;

public class TekstanalyseKlient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringInput;

        do {
            System.out.println("Skriv inn ønsket tekst:");
            stringInput = input.nextLine();
            Tekstanalyse test = new Tekstanalyse(stringInput);

            System.out.println("antallTegn: " + Arrays.toString(test.getAntallTegn()));

            System.out.println("Antall forskjellige bokstaver: " + test.getForskjelligeBokstaver());
            System.out.println("Antall bokstaver totalt: " + test.getAntallBokstaver());
            System.out.println("Andel ikke bokstaver: " + test.getProsentTegn());
            System.out.println("Forekomster av T: " + test.getAntallDenneBokstaven('T'));
            System.out.println("Mest brukte bokstav(er): " + test.getMestBrukteBokstaver());

            System.out.println("Vil du analysere mer tekst? (Y/N)");
            stringInput = input.nextLine().toLowerCase();
                
        } while (stringInput.equals("y"));
        input.close();
    }
}
