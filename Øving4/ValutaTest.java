package Øvinger.Øving4;

import java.util.*;
import static javax.swing.JOptionPane.*;

public class ValutaTest {
    public static void main(String[] args) {
        int valg;
        do{
            String velgValuta = showInputDialog("Velg valuta:\n 1: dollar\n 2: euro\n 3: svenske kroner\n 4: avslutt");
	        int valgtValuta = Integer.parseInt(velgValuta);

            if (valgtValuta == 1 || valgtValuta == 2  || valgtValuta == 3 ){

                String[] options = new String[] {"Til NOK", "Fra NOK"};
                int valgtRetning = showOptionDialog(null,"Vil du regne til eller fra norske kroner?", "Valutakalkulator", DEFAULT_OPTION, PLAIN_MESSAGE, null, options, options[0]); 
                
                String velgBeloep = showInputDialog("Velg beløp:");
	            double beloep = Double.parseDouble(velgBeloep);       

                //Lager objekter:
                Valuta dollar = new Valuta(beloep,8.62);
                Valuta euro = new Valuta(beloep,10.15);
                Valuta svenske = new Valuta(beloep,1.00);
                    
                double svar = 0;
                double dollarSvar;
                double euroSvar;
                double svenskeSvar;

                String valuta1 = "";
                String valuta2 = "";

                if(valgtRetning == 0){//Til NOK
                    dollarSvar = dollar.tilNOK();
                    euroSvar = euro.tilNOK();
                    svenskeSvar = svenske.tilNOK();
                    valuta2 = "norske kroner";
                } else {//Fra NOK
                    dollarSvar = dollar.fraNOK();
                    euroSvar = euro.fraNOK();
                    svenskeSvar = svenske.fraNOK();
                    valuta1 = "norske kroner";
                }

                //Bare for utskriftens skyld:
                if (valgtValuta == 1){
                    svar = dollarSvar;
                    if (valgtRetning == 0){
                        valuta1 = "dollar";
                    } else {
                        valuta2 = "dollar";
                    }
                } else if (valgtValuta == 2){
                    svar = euroSvar;
                    if (valgtRetning == 0){
                        valuta1 = "euro";
                    } else {
                        valuta2 = "euro";
                    }
                } else if (valgtValuta == 3){
                    svar = svenskeSvar;
                    if (valgtRetning == 0){
                        valuta1 = "svenske kroner";
                    } else {
                        valuta2 = "svenske kroner";
                    }
                }

                showMessageDialog(null, Math.round(beloep) + " " + valuta1 + " er " + Math.round(svar) + " " + valuta2);
           }
            valg = showConfirmDialog(null, "Vil du gjøre en ny utregning?", "Valutakalkulator", YES_NO_OPTION);  
        } while (valg == YES_OPTION);
    }
}















//Scanner in = new Scanner(System.in);
                //String velgRetning = showInputDialog("Vil du regne til eller fra norske kroner? \n 0: Til NOK \n 1: Fra NOK");
                //int valgtRetning = Integer.parseInt(velgRetning);
                
                //System.out.println("Vil du regne til eller fra norske kroner?\n1: Til NOK\n2: Fra NOK");
                //int valgtRetning = in.nextInt();*/

                //System.out.println(valgtRetning);


                //System.out.println("Velg beløp:");
                //int beloep = in.nextInt();*/

                //System.out.println(svar);