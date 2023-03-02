class Spiller {
    private int sumPoeng = 0;
    private java.util.Random terning = new java.util.Random();//La til private foran denne. Hvis programmet slutter å fungere, prøv å fjern private.

    public Spiller() {
    }

    public int getSumPoeng() {
        return sumPoeng;
    }
    
    public void kastTerningen() {
        int terningkast = terning.nextInt(6)+1;

        if(terningkast == 1) {
            sumPoeng = 0;
        } else {
            sumPoeng += terningkast;

            if(sumPoeng > 100 ) {
                sumPoeng -= terningkast;
            }
        }
    }

    public boolean erFerdig(){
        return sumPoeng == 100;
    }
}
