import static javax.swing.JOptionPane.*;
public class O1Skuddaar {
    public static void main(String[] args) {
        String aarstallLest= showInputDialog("Årstall:");
        int aarstall = Integer.parseInt(aarstallLest);
        String melding = " er ikke et skuddår";

        if((aarstall%100!=0 && aarstall%4==0) || (aarstall%100==0 && aarstall%400==0)){
            melding = " er et skuddår";
        }
        
        showMessageDialog(null,aarstall + melding);
    }
  }