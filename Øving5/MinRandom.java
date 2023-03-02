public class MinRandom {
    private java.util.Random tilfeldig = new java.util.Random();
    
    /**
     * Hva metoden gjør
     * @param nedre
     * @param ovre
     * @return
     */

    //På eksamen vil de at man skal gjøre dette^^
    
    public int nesteHeltall(int nedre, int ovre){ // intervallet (nedre, ovre)
        return tilfeldig.nextInt(ovre)+nedre;
    }
    
    public double nesteDesimaltall(double nedre, double ovre){ // intervallet >nedre, ovre>15. Denne notasjonen betyr at 0,0 er med, mens 1,0 ikke er med.
        return tilfeldig.nextDouble()*(ovre-nedre)+nedre;
    }
}
