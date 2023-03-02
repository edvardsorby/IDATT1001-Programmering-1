package Øvinger.Øving1;

import static javax.swing.JOptionPane.*;
class O1TommerTilCM{
    public static void main(String[] args) {
        String tommerLest = showInputDialog("Antall tommer: ");//Oppretter en input-boks
        double tommer = Double.parseDouble(tommerLest);//Henter verdien fra input-boksen
        
        double cm = tommer * 2.54;

        System.out.println(tommer + " tommer er " + cm + " cm");//Vanlig utskrift av resultat
        showMessageDialog(null,tommer + " tommer er " + cm + " cm");//Meldingsboks med resultat
    }
}