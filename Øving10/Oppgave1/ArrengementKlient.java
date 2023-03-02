package Øvinger.Øving10.Oppgave1;

import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showInputDialog;

public class ArrengementKlient {
    public static void main(String[] args) {
        // Oppretter et nytt register:
        ArrangementRegister register1 = new ArrangementRegister();

        // Legger inn testdata:
        register1.regNyttArrengement("Vi synger julen inn","Nidarosdomen","Nidarosdomens guttekor", "Konsert", 202112121800L);
        register1.regNyttArrengement("Levva livet","Olavshallen","Åge Aleksandersen", "Konsert", 202111162100L);
        register1.regNyttArrengement("Sjostakovitsj & Brahms","Olavshallen","Trondheim Symfoniorkester", "Konsert", 202111111930L);
        register1.regNyttArrengement("Høytidsmesse","Nidarosdomen","Nidarosdomens jentekor", "Gudstjeneste", 202112251100L);
        register1.regNyttArrengement("Lær bridge på 1-2-3 (nybegynnerkurs)","Bridgehuset","NBF Midt-Trøndelag", "Kurs", 202111151830L);
        register1.regNyttArrengement("Alt er mulig","Olavshallen","Dag Otto Lauritzen", "Foredrag", 202111091900L);


        // Menystyrt klientprogram
        // Går i loop til brukeren er ferdig med programmet
        while (true){

            // Lar brukeren bestemme hva som skal gjøres
            String input = showInputDialog(null,"1: Registrer arrangement\n2: Finn arrangementer på sted\n3: Finn arrangementer å dato\n4: Finn arrangementer i datointervall\n5: Vis alle arrangementer\n6: Avslutt","Arrangementregister" ,PLAIN_MESSAGE);
            int tall = Integer.parseInt(input);

            // Utfører valgt handling
            switch (tall) {
                case 1: {
                    // Registrerer nytt arrangement

                    String navn = showInputDialog(null,"Navn på arrangement:","Registrer arrangement", QUESTION_MESSAGE);
                    String sted = showInputDialog(null,"Sted:","Registrer arrangement", QUESTION_MESSAGE);
                    String arrangoer = showInputDialog(null,"Arrangør:","Registrer arrangement", QUESTION_MESSAGE);
                    String type = showInputDialog(null,"Type arrangement:","Registrer arrangement", QUESTION_MESSAGE);
                    long tidspunkt = Long.parseLong(showInputDialog(null,"Tidspunkt (format: YYYYMMDDHHMM):","Registrer arrangement", QUESTION_MESSAGE));

                    register1.regNyttArrengement(navn, sted, arrangoer, type, tidspunkt);

                    showMessageDialog(null, navn + " har blitt registrert");

                    break;
                }
                case 2: {
                    // Henter alle på gitt sted

                    String sted = showInputDialog("Velg sted:");

                    showMessageDialog(null, register1.hentAllePaaSted(sted), "Arrangementregister", PLAIN_MESSAGE);

                    break;
                }
                case 3: {
                    // Henter alle på gitt dato

                    int dato = Integer.parseInt(showInputDialog("Velg dato (format: YYYYMMDD):"));

                    showMessageDialog(null, register1.hentAllePaaDato(dato), "Arrangementregister", PLAIN_MESSAGE);

                    break;
                }
                case 4: {
                    // Henter alle i datointervall

                    int startDato = Integer.parseInt(showInputDialog("Velg startdato:"));
                    int sluttDato = Integer.parseInt(showInputDialog("Velg sluttdato:"));

                    showMessageDialog(null, register1.hentAlleIDatoIntervall(startDato, sluttDato), "Arrangementregister", PLAIN_MESSAGE);

                    break;
                }
                case 5: {
                    // Printer ut alle arrangementer

                    showMessageDialog(null, register1.hentAlleArrangementer(), "Arrangementregister", PLAIN_MESSAGE);

                    break;
                }
                default: {
                    //Avslutter programmet

                    System.exit(0);
                    break;
                    // Skal lære i programmering 2 hvordan man unngår feilmeldinger når man trykker Cancel eller Esc.
                }
            }
        }
    }
}
