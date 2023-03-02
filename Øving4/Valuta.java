package Øvinger.Øving4;

class Valuta {
    private double beloep;
    private double kurs;

    public Valuta(double beloep, double kurs){
        this.beloep = beloep;
        this.kurs = kurs;
    }

    public double tilNOK(/*Studassen sa at jeg heller bør putte navnet på valutaen her inne, i stedet for kursen i konstruktøren*/){
        return beloep*kurs;
    }

    public double fraNOK(){
        return beloep/kurs;
    }
}


