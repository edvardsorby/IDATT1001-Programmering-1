import static javax.swing.JOptionPane.*;
class O3SekTilTid{
    public static void main(String[] args) {
        String sekunderLest = showInputDialog("Antall sekunder: ");
        int sekunderTotalt = Integer.parseInt(sekunderLest);

        int timer = sekunderTotalt/3600;
        int minutter = (sekunderTotalt%3600)/60;
        int sekunder = (sekunderTotalt%3600)%60;

        System.out.println(sekunderTotalt + " sekunder er " + timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder til sammen.");
        showMessageDialog(null,sekunderTotalt + " sekunder er " + timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder til sammen.");
    }
}