package Laev;

import java.util.ArrayList;

/**
 * Created by Polina on 24.01.2016.
 */
public class Laev {
    private ArrayList<String> reisijad= new ArrayList<>();
    private String reisija;
    private String laevaNimi;

    public Laev (String kassapidaja) {
        laevaNimi = kassapidaja;
    }

    public ArrayList lisaReisija(String reisija) {
        reisijad.add(reisija);
        return reisijad;
    }

    public void eemaldaReisija(String reisija) {
        if (reisijad.contains(reisija)) {
            reisijad.remove(reisijad.indexOf(reisija));
        }
    }

    public String votaReisijad() {
        String reisijateArv = "";
        for (int i = 0; i < reisijad.size(); i++) {
            reisijateArv += reisijad.get(i);
            reisijateArv += " ";
        }
        return reisijateArv;
    }

    public int reisijateArv() {
        int reisijateArv = reisijad.size();
        return reisijateArv;

    }

    public String misNimi() {
        return laevaNimi;
    }



    public void kalaHammustasKummipaatiAugu() {
        System.out.println("Kõik välja");
        eemaldaReisija("Teet Kalluste");

    }
}



