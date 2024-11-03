package com.example.practicalistview;

import java.util.ArrayList;

public class ListaCampeones {

    ArrayList<Campeon> campeones = new ArrayList<>();

    public ListaCampeones() {
        campeones.add(new Campeon("Uruguay", R.drawable.uruguay,"1930"));
        campeones.add(new Campeon("Italia", R.drawable.italia,"1934"));
        campeones.add(new Campeon("Italia", R.drawable.italia,"1938"));
        campeones.add(new Campeon("Uruguay", R.drawable.uruguay,"1950"));
        campeones.add(new Campeon("Alemania Federal", R.drawable.alemania, "1954"));
        campeones.add(new Campeon("Brasil", R.drawable.brasil,"1958"));
        campeones.add(new Campeon("Brasil", R.drawable.brasil,"1962"));
        campeones.add(new Campeon("Inglaterra", R.drawable.inglaterra,"1966"));
        campeones.add(new Campeon("Brasil", R.drawable.brasil,"1970"));
        campeones.add(new Campeon("Alemania Federal", R.drawable.alemania,"1974"));
        campeones.add(new Campeon("Argentina", R.drawable.argentina,"1978"));
        campeones.add(new Campeon("Italia", R.drawable.italia,"1982"));
        campeones.add(new Campeon("Argentina", R.drawable.argentina,"1986"));
        campeones.add(new Campeon("Alemania Federal", R.drawable.alemania,"1990"));
        campeones.add(new Campeon("Brasil", R.drawable.brasil,"1994"));
        campeones.add(new Campeon("Francia", R.drawable.francia,"1998"));
        campeones.add(new Campeon("Brasil", R.drawable.brasil,"2002"));
        campeones.add(new Campeon("Italia", R.drawable.italia,"2006"));
        campeones.add(new Campeon("España", R.drawable.espana,"2010"));
        campeones.add(new Campeon("Alemania", R.drawable.alemania,"2014"));
        campeones.add(new Campeon("Francia", R.drawable.francia,"2018"));
        campeones.add(new Campeon("Argentina", R.drawable.argentina,"2022"));

    }

    public ArrayList<Campeon> getCampeones() {
        return campeones;
    }

    public void setCampeones(ArrayList<Campeon> campeones) {
        this.campeones = campeones;
    }
}
