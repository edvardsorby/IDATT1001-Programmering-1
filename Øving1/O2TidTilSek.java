import static javax.swing.JOptionPane.*;
class O2TidTilSek{
    public static void main(String[] args) {
        String timerLest = showInputDialog("Antall timer: ");//Oppretter en input-boks
        String minutterLest = showInputDialog("Antall minutter: ");//Oppretter en input-boks
        String sekunderLest = showInputDialog("Antall sekunder: ");//Oppretter en input-boks

        int timer = Integer.parseInt(timerLest);//Henter verdien fra input-boksen
        int minutter = Integer.parseInt(minutterLest);//Henter verdien fra input-boksen
        int sekunder = Integer.parseInt(sekunderLest);//Henter verdien fra input-boksen
        
        int sekunderTotalt = timer*60*60 + minutter*60 + sekunder;
        System.out.println(timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder er " + sekunderTotalt + " sekunder til sammen.");
        showMessageDialog(null,timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder er " + sekunderTotalt + " sekunder til sammen.");//Meldingsboks med resultat
    }
}