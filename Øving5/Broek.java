package Øvinger.Øving5;

public class Broek {
    private int teller;
    private int nevner;
    
    public Broek(int teller, int nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevneren kan ikke være lik 0");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    public Broek(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public void summer(Broek broek2) {
        this.teller *= broek2.getNevner();
        this.teller += broek2.getTeller()*this.nevner;
        this.nevner *= broek2.getNevner();
    }
    
    public void subtraher(Broek broek2) {
        this.teller *= broek2.getNevner();
        this.teller -= broek2.getTeller()*this.nevner;
        this.nevner *= broek2.getNevner();
    }

    public void multipliser(Broek broek2) {
        this.teller *= broek2.getTeller();
        this.nevner *= broek2.getNevner();
    }

    public void divider(Broek broek2) {
        this.teller *= broek2.getNevner();
        this.nevner *= broek2.getTeller();
    }
  
    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }
    
    public String toString(){
        String resultat = teller + "/" + nevner;
        return resultat;
    }

    // Dette var riktig måte å lage testprogram som del av klassen:
    public static void main(String[] args) {
        int teller1 = 1;
        int nevner1 = 2;
        Broek broek = new Broek(teller1, nevner1);
            
        int teller2 = 3;
        int nevner2 = 4;
        Broek broek2 = new Broek(teller2,nevner2);

        // Addisjon(1) Subtraksjon(2) Multiplikasjon(3) Divisjon(4):
        int velgRegneoperasjon = 4;

        String regneoperasjon = "";
        
        switch (velgRegneoperasjon) {
            case 1: {
                broek.summer(broek2);
                regneoperasjon = "+";
                break;
            }
            case 2: {
                broek.subtraher(broek2);
                regneoperasjon = "-";
                break;
            }
            case 3: {
                broek.multipliser(broek2);
                regneoperasjon = "*";
                break;
            }
            case 4: {
                broek.divider(broek2);
                regneoperasjon = ":";
                break;
            }
        }

        System.out.println(teller1 + "/" + nevner1 + " " + regneoperasjon + " " + teller2 + "/" + nevner2 + " = " + broek);
    } 
}