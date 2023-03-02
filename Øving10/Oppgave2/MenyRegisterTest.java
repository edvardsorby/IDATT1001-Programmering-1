package Øvinger.Øving10.Oppgave2;

public class MenyRegisterTest {
    public static void main(String[] args) {
        // Lager et nytt register:
        MenyRegister menyRegister1 = new MenyRegister();

        // Oppretter testdata:
        String kakeOppskrift = "Bak en kake";
        String burgerOppskrift = "Stek en burger";
        String spaghettiOppskrift = "Kok spaghetti";
        menyRegister1.registrerRett("Kake", "Dessert", 200, kakeOppskrift);
        menyRegister1.registrerRett("Burger", "Hovedrett", 280, burgerOppskrift);
        menyRegister1.registrerRett("Spaghetti", "Hovedrett", 240, spaghettiOppskrift);


        System.out.println(menyRegister1.finnRett("Kake"));
        System.out.println(menyRegister1.finnRetter("Hovedrett"));

        String[] retterTilMeny1 = {"Kake", "Spaghetti"}; // Totalpris 440
        menyRegister1.registrerMeny(retterTilMeny1);

        String[] retterTilMeny2 = {"Burger", "Spaghetti"}; // Totalpris 530
        menyRegister1.registrerMeny(retterTilMeny2);

        String[] retterTilMeny3 = {"Burger"}; // Totalpris 280
        menyRegister1.registrerMeny(retterTilMeny3);

        System.out.println(menyRegister1.menyerIPrisIntervall(279, 281));
    }
}
