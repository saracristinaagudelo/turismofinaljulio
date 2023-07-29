package com.example.vengaamipueblo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.vengaamipueblo2.adaptadores.TurismoAdaptador;

import com.example.vengaamipueblo2.moldes.TurismoMolde;

import java.util.ArrayList;

public class listaturismo extends AppCompatActivity
{
    ArrayList<TurismoMolde>listaturismo=new ArrayList<>();
    RecyclerView recyclerTurismo;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaturismo);
        recyclerTurismo=findViewById(R.id.listadinamicaturismo);
        recyclerTurismo.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        TurismoAdaptador adaptador=new TurismoAdaptador(listaturismo);
        recyclerTurismo.setAdapter(adaptador);

    }
    public void crearLista()
    {
        listaturismo.add(new TurismoMolde( R.drawable.turismo1,"Sitio1", "20.000","3004578964"));
        listaturismo.add(new TurismoMolde( R.drawable.turismo2,"Sitio2", "25.000","3004561212"));
        listaturismo.add(new TurismoMolde( R.drawable.turismo3,"Sitio3", "28.000","3008974546"));
        listaturismo.add(new TurismoMolde( R.drawable.turismo4,"Sitio4", "29.000","3004589696"));
        listaturismo.add(new TurismoMolde( R.drawable.turismo5,"Sitio5", "30.000","3014568787"));
    }
}