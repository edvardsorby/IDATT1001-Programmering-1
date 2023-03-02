public class Broekv1 {
    private int teller1;
    private int nevner1;
    
    public Broekv1(int teller1, int nevner1) {
        if (nevner1 == 0) {
            throw new IllegalArgumentException("Nevneren kan ikke være lik 0");
        }
        this.teller1 = teller1;
        this.nevner1 = nevner1;
    }

    public Broekv1(int teller1) {
        this.teller1 = teller1;
        this.nevner1 = 1;
    }

    public void summer(int teller2, int nevner2) {
        teller1 *= nevner2;
        teller2 *= nevner1;
        teller1 += teller2;
        nevner1 *= nevner2;
    }
    
    public void subtraher(int teller2, int nevner2) {
        teller1 *= nevner2;
        teller2 *= nevner1;
        teller1 -= teller2;
        nevner1 *= nevner2;
    }

    public void multipliser(int teller2, int nevner2) {
        teller1 *= teller2;
        nevner1 *= nevner2;
    }

    public void divider(int teller2, int nevner2) {
        teller1 *= nevner2;
        nevner1 *= teller2;
    }
    
    public int getTeller() {
        return teller1;
    }

    public int getNevner() {
        return nevner1;
    }
    
    public String toString(){
        String resultat = teller1 + "/" + nevner1;
        return resultat;
    }

    public static void main(String[] args) {
        int teller1 = 1;
        int nevner1 = 2;
            
        Broekv1 broek1 = new Broekv1(teller1, nevner1);
        Broekv1 broek2 = new Broekv1(teller1, nevner1);
        Broekv1 broek3 = new Broekv1(teller1, nevner1);
        Broekv1 broek4 = new Broekv1(teller1, nevner1);
            
        int teller2 = 3;
        int nevner2 = 4;

        broek1.summer(teller2,nevner2);
        broek2.subtraher(teller2,nevner2);
        broek3.multipliser(teller2,nevner2);
        broek4.divider(teller2,nevner2);
            
        System.out.println(teller1 + "/" + nevner1 + " + " + teller2 + "/" + nevner2 + " = " + broek1);
        System.out.println(teller1 + "/" + nevner1 + " - " + teller2 + "/" + nevner2 + " = " + broek2);
        System.out.println(teller1 + "/" + nevner1 + " * " + teller2 + "/" + nevner2 + " = " + broek3);
        System.out.println(teller1 + "/" + nevner1 + " : " + teller2 + "/" + nevner2 + " = " + broek4);
    } 
}


