package com.example.practicalistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    Context contexto;
    private int R_layout_idView;
    ArrayList<?> campeones;

    public ListAdapter(Context contexto, int R_layout_idView, ArrayList<?> campeones) {
        super();
        this.contexto = contexto;
        this.R_layout_idView = R_layout_idView;
        this.campeones = campeones;
    }

    @Override
    public View getView(int posicion, View view, ViewGroup viewGroup) {
        if (view == null) {

            //LayoutInflater vi = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Inflamos la vista con nuestro propio layout
            LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());

            view= layoutInflater.inflate(R.layout.activity_articulos, null);
            // Valor actual según la posición

            //view = vi.inflate(R_layout_idView, null);
        }
        //onEntrada (entradas.get(posicion), view);
        Campeon campeon=(Campeon) campeones.get(posicion);
        if (campeon != null) {
            TextView txtArticulo = view.findViewById(R.id.txtArticulo);
            if (txtArticulo != null)
                txtArticulo.setText(campeon.getNombreCampeon());

            ImageView imgvCampeon = view.findViewById(R.id.imgvCampeon);
            if (imgvCampeon != null)
                imgvCampeon.setImageResource(campeon.getImagenCampeon());
        }
        return view;
    }

    @Override
    public int getCount() {
        return campeones.size();
    }

    @Override
    public Object getItem(int i) {
        return campeones.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


}
