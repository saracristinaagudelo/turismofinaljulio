package com.example.vengaamipueblo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vengaamipueblo2.adaptadores.HotelAdaptador;
import com.example.vengaamipueblo2.adaptadores.RestauranteAdaptador;
import com.example.vengaamipueblo2.moldes.MoldeHotel;
import com.example.vengaamipueblo2.moldes.RestauranteMolde;

import java.util.ArrayList;

public class listarestaurantes extends AppCompatActivity {
    ArrayList<RestauranteMolde> listarestaurantes=new ArrayList<>();

    RecyclerView recyclerRestaurantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarestaurantes);
        recyclerRestaurantes=findViewById(R.id.listadinamicarestaurantes);
        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        RestauranteAdaptador adaptador=new RestauranteAdaptador(listarestaurantes);
        recyclerRestaurantes.setAdapter(adaptador);

    }

    private void crearLista() {
        listarestaurantes.add(new RestauranteMolde("Restaurante1","delicioso","10.000", R.drawable.restaurantes1));
        listarestaurantes.add(new RestauranteMolde("Restaurante1","delicioso","10.000", R.drawable.restaurantes2));
        listarestaurantes.add(new RestauranteMolde("Restaurante1","delicioso","10.000", R.drawable.restaurantes3));
        listarestaurantes.add(new RestauranteMolde("Restaurante1","delicioso","10.000", R.drawable.restaurantes4));
        listarestaurantes.add(new RestauranteMolde("Restaurante1","delicioso","10.000", R.drawable.restaurantes5));


    }

}