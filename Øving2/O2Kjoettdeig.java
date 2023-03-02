import static javax.swing.JOptionPane.*;
public class O2Kjoettdeig {
    public static void main(String[] args) {
        double kd1pris = 35.90;
        int kd1vekt = 450;
        double kd1kilopris = kd1pris/(kd1vekt*0.001);
        
        double kd2pris = 39.50;
        int kd2vekt = 500;
        double kd2kilopris = kd2pris/(kd2vekt*0.001);

        int billigst = 1;
        if(kd1kilopris>kd2kilopris){
            billigst = 2;
        }
        
        System.out.println("Kilopris 1: " + kd1kilopris + " kr/kg");
        System.out.println("Kilopris 2: " + kd2kilopris + " kr/kg");
        showMessageDialog(null,"Kjøttdeig " + billigst + " er billigst.");
    }
  }