package Øvinger.Øving9;

public class Klient {
    public static void main(String[] args) {

        Oppgaveoversikt oversikt1 = new Oppgaveoversikt();

        // Oppretter "dummy-studenter":
        oversikt1.regNyStudent("Ole Håvard",13);
        oversikt1.regNyStudent("Eivind",4);
        oversikt1.regNyStudent("Albert Odin",11);
        oversikt1.regNyStudent("Sindre",8);


        System.out.println(oversikt1);

        System.out.println("Det er " + oversikt1.getAntStud() + " studenter registrert");

        System.out.println("Antall oppgaver Eivind har løst: " + oversikt1.getAntOppg("Eivind"));

        oversikt1.oekAntOppg("Eivind",3);

        System.out.println("Antall oppgaver Eivind har løst: " + oversikt1.getAntOppg("Eivind"));



    }
}
