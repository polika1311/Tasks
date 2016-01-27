/**
 * Prindi konsooli 9x9 maatriks selliselt, et
 * joonistub suur X üle laua, nagu bingo diagonaalid.
 *
 * Näide:
 *
 * x       x
 *  x     x
 *   x   x
 *    x x
 *     x
 *    x x
 *   x   x
 *  x     x
 * x       x
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class Maatriks {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                if (i == j || j==(9-i))
                    System.out.printf("x ");
                else
                    System.out.printf(" ");
            }
            System.out.println();
        }
    }

}
