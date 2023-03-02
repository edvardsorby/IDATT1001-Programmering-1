package Øvinger.Øving6;

public class MatriseTest {
    public static void main(String[] args) {

        int[][] mat1 = {{1,0,-1},{1,2,0}};
        int[][] mat2 = {{4,0,2},{4,2,5}};
        int[][] mat3 = {{1,0,-1},{3,2,0},{-1,1,2}};

        Matrise matrise1 = new Matrise(mat1);
        Matrise matrise2 = new Matrise(mat2);
        Matrise matrise3 = new Matrise(mat3);

        System.out.println("Matrise 1: \n" + matrise1);
        System.out.println("Matrise 2: \n" + matrise2);
        System.out.println("Matrise 3: \n" + matrise3);

        System.out.println("Matrise 1 + matrise 2 = \n" + matrise1.adder(matrise2));
        System.out.println("Matrise 1 x matrise 3 = \n" + matrise1.multipliser(matrise3));
        System.out.println("Matrise 1 transponert: \n" + matrise1.transponer());

    }

    
}
