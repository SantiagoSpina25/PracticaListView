package com.example.practicalistview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaCampeones listaCampeones = new ListaCampeones();
        ArrayList<Campeon> datos = listaCampeones.getCampeones();

        listView = findViewById(R.id.listView);
        listView.setAdapter(new ListAdapter(this, R.layout.activity_articulos, datos));

        //setOnItemClickListener es un escuchador del item que selecciona de la lista y te devuelve la posicion del item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posItem, long l) {



                //Para iniciar otra actividad voy a usar Intent
                Intent siguienteActivity = new Intent(view.getContext(), descripcionArticulo.class);

                siguienteActivity.putExtra("imagenCampeon", datos.get(posItem).getImagenCampeon());
                siguienteActivity.putExtra("nombreCampeon", datos.get(posItem).getNombreCampeon());
                siguienteActivity.putExtra("fechaMundial", datos.get(posItem).getFechaMundial());
                startActivity(siguienteActivity);



//                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                View view2 = inflater.inflate(R.layout.activity_descripcion_articulo, null);
//                imgvDescArticulo = view2.findViewById(R.id.imgvDescArticulo);
//                txtDesc = view2.findViewById(R.id.txtDesc);
//
//                imgvDescArticulo.setImageResource(datos.get(posItem).getImagenCampeon());
//                txtDesc.setText(datos.get(posItem).getNombreCampeon());
//
//                Button btnAtras = view2.findViewById(R.id.btnAtras);
//                btnAtras.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                    }
//                });
//
//                setContentView(view2);



            }
        });


    }
}