import static javax.swing.JOptionPane.*;
public class O2Primtall {
    public static void main(String[] args) {
        Integer tall;
        do{
            String inpTall = showInputDialog("Tall: ");
            tall = Integer.parseInt(inpTall);
        }while(tall < 0);

        String erPrimtall = " er ";

        for(int i=2;i<tall;i++){
            if(tall%i==0){erPrimtall = " er ikke ";}
        }
        System.out.println(tall + erPrimtall + "et primtall");
    }
}
