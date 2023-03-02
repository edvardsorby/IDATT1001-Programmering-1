package Øvinger.Øving6;

import java.util.Arrays;

public class Tabeller {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        int[] antall = new int[10];

        for (int i = 0; i < 1000; i++) {
            int tall = random.nextInt(10);
            antall[tall]++;
        }

        System.out.println(Arrays.toString(antall));

        for (int i = 0; i < antall.length; i++) {
            String stjerner = " ";

            for (int j = 0; j < Math.round(antall[i]/10.0); j++) {
                stjerner += "*";
            }

            System.out.println(i + ": " + antall[i] + stjerner);
        }
    }
}
