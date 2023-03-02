package Øvinger.Øving7;

import java.util.Arrays;

public class NyString {
    String tekst;

    /**
     * Konstruktør til klassen NyString
     * @param tekst tekst innlest fra bruker
     */
    NyString(String tekst) {
        this.tekst = tekst;
    }

    String forkort() {
        String[] ord = tekst.split(" ");
        //System.out.println(Arrays.toString(ord));

        String tempTekst = "";

        for (int i = 0; i < ord.length; i++) {
            tempTekst += ord[i].charAt(0);
        }
        return tempTekst;
    }

    String fjern(char tegn) {

        String tempTekst = "";

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) != tegn) {
                tempTekst += tekst.charAt(i);
            }
        }
        return tempTekst;
    }

    public static void main(String[] args) {
        NyString test = new NyString("denne setningen kan forkortes");

        System.out.println("Forkorting: " + test.forkort());
        System.out.println("Fjerning av 'e': " + test.fjern('e'));
    }
}
