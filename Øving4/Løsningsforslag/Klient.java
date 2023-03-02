package Øvinger.Øving4.Løsningsforslag;

import java.util.Scanner;

public class Klient {
    public static void main(String[] args) {
        //Valuta har nå blitt en gyldig klasse, på samme måte som f. eks. String og Scanner:
        Valuta dollar = new Valuta("Dollar", 9.0); //navn: "Dollar", kurs: 9.0
        Valuta euro = new Valuta("Euro", 7.0);
        Valuta yen = new Valuta("Yen", 0.08);

        Scanner input = new Scanner(System.in);
        
        //Alt over trenger vi bare definere en gang, så det er derfor utenfor while-løkka

        while (true) {
            System.out.println("Velkommer til valutakalkulatoren!");
            System.out.println("Vennligst velg valuta");
            System.out.println("1. Dollar");
            System.out.println("2. Euro");
            System.out.println("3. Yen");
            System.out.println("4. Avslutt");
            
            String stringInput = input.nextLine(); 
            //Vi lager en ny String-variabel
            //nextLine sørger for minst mulig problemer, som nextInt osv. kan medføre 
            int valutaValg = Integer.parseInt(stringInput);//Denne konverterer Stringen til int. Noe annet enn tall vil krasje programmet.
        
            /*
            // TODO: BRUKERINPUT - Velg valuta
            int valutaValg = 1;
            */

            Valuta valgtValuta = null;//En del av trikset vi gjør i switch-løkka

            //Kunne tatt masse if else etter hverandre, men switch er laget for akkurat dette formålet med mange muligheter:
            switch (valutaValg) {
                case 1: {
                    //Her kunne vi skrevet resten av progarmmet tre ganger, men et triks vil være å lage en ny valuta:
                    valgtValuta = dollar;//Nå kan vi senere i programmet bare skrive valgtValuta.tilNok() for eksempel, i stedet for separat for alle valutaene
                    break;//break må alltid være i en switch, siden ellers vil den gjøre alt, uten å hoppe ut på riktig sted
                }
                case 2: {
                    valgtValuta = euro;
                    break;
                }
                case 3: {
                    valgtValuta = yen;
                    break;
                }
                default: {//default er et eget kodeord i switch, som blir der den går hvis brukeren skriver noe annet enn 1, 2 eller 3.
                    //Vi kunne også bare skrevet case 4:
                    System.exit(0);//Gir en slags feilmelding
                    break;
                }
            }


            //vi bruker stringInput om og om igjen - praktisk:
            System.out.println("Vennligst oppgi beløp");
            stringInput = input.nextLine();
            double mengde = Double.parseDouble(stringInput);//Denne tar tekst, og omgjør det til desimaltall.

            /*
            //TODO: BRUKERINPUT - Mengde
            double mengde = 100.0;
            */

            System.out.println("Vil du konvertere til(1) eller fra(2) NOK?");
            stringInput = input.nextLine();
            int tilFra = Integer.parseInt(stringInput);
            boolean tilNok = (tilFra == 1); //Triks: tilFra lik 1 vil da gi true, mens hva som helst annet vil gi false
                                            //Kunne også brukt en inline-if, med spørsmålstegn
            /*
            //TOTO: BRUKERINPUT - Til/Fra
            boolean tilNok = false; // boolean er naturlig å bruke, siden vi har bare to forskjellige verdier.
            */

            //Denne fremgangsmåten, med hardkodede verdier først, er lur for å sjekke at resten av koden fungerer før vi begynner å hente inn verdier.

            if (tilNok) {//Samme som tilNok == true, siden det er en boolean
                // 100.0 Dollar er 800 NOK
                System.out.println(mengde + " " + valgtValuta.getNavn() + " er " + valgtValuta.tilNok(mengde) + " NOK");
                //Her foreslå også VS Code at mengde skulle stå inne i parantesen, siden tilNok-metoden krever en input
            }
            else {
                System.out.println(mengde + " NOK er " + valgtValuta.fraNok(mengde) + " " + valgtValuta.getNavn());
            }
            
        }
        
    }
}
