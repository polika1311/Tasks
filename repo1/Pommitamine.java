import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Polina on 25.01.2016.
 */
public class Pommitamine {

        public static void main(String[] args) {

            int[] laud = {randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev(), randLaev()};

            Scanner kasutaja = new Scanner(System.in);

            while (!gameover(laud)) {
               // System.out.println(Arrays.toString(laud));
                System.out.println("Sisesta number 1-"+laud.length);
                int sisestus = kasutaja.nextInt() - 1;

                int hit = laud[sisestus];
                if (hit == 0) {
                    System.out.println("haha, mööda!");
                } else if (hit == 2) {
                    System.out.println("kuule kuule, siia oled juba lasknud.");
                } else if (hit == 1) {
                    System.out.println("Yea, pihtas!");
                    laud[sisestus] = 2;
                }
            }
            System.out.println("Mäng läbi!");
        }

        public static int randLaev() {
            int tulemus = (int) (Math.random() * 2);
            return tulemus;
        }

        public static boolean gameover(int[] laud) {
            for (int i = 0; i < laud.length; i++) {
                if (laud[i] == 1) {
                    return false;
                }
            }
            return true;
        }
    }


