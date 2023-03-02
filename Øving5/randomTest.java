public class randomTest {
    public static void main(String[] args) {
        int intNedre = 1;
        int intOvre = 6;

        double doubleNedre = 0.0;
        double doubleOvre = 1.0;

        MinRandom test = new MinRandom();

        System.out.println(test.nesteHeltall(intNedre, intOvre));
        System.out.println(test.nesteDesimaltall(doubleNedre, doubleOvre));

        
        for (int i=0;i<10;i++) {
            int tilfeldigTall = test.nesteHeltall(intNedre, intOvre);
            
            if (tilfeldigTall >= intNedre && tilfeldigTall <= intOvre) {
                System.out.println(tilfeldigTall);
            } else {
                throw new IllegalArgumentException("Tallet er utenfor intervallet");
            }
        }
        
        for (int i=0;i<10;i++) {
            double tilfeldigTall = test.nesteDesimaltall(doubleNedre, doubleOvre);
            
            if (tilfeldigTall > doubleNedre && tilfeldigTall < doubleOvre) {
                System.out.println(tilfeldigTall);
            } else {
                throw new IllegalArgumentException("Tallet er utenfor intervallet");
            }
        }
        
        
    }
}
