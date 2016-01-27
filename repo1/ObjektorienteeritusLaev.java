import Laev.Laev;

/**
 * Created by Polina on 24.01.2016.
 */
public class ObjektorienteeritusLaev {


        public static void main(String[] args) {

            String laevaNimi = "Laineraidur";
            Laev raidur = new Laev(laevaNimi);

            raidur.lisaReisija("Teet Kalluste");
            raidur.lisaReisija("Peeter Kaan");
            raidur.lisaReisija("Maire Kaunaste");
            raidur.eemaldaReisija("Peeter Kaan");

            System.out.println("Pardal on järgmised isikud: " + raidur.votaReisijad());
            System.out.println("Pardal on nii mitu inimest: " + raidur.reisijateArv());
            System.out.println("Laeva nimi on " + raidur.misNimi());

            raidur.kalaHammustasKummipaatiAugu(); // Paanika!! mis nüüd saab?

            System.out.println("Pardal on järgmised isikud: " + raidur.votaReisijad());
            System.out.println("Pardal on nii mitu inimest: " + raidur.reisijateArv());
            System.out.println("Laeva nimi on " + raidur.misNimi());
        }
    }


