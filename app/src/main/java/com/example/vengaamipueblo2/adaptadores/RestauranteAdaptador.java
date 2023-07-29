package com.example.vengaamipueblo2.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vengaamipueblo2.R;
import com.example.vengaamipueblo2.moldes.MoldeHotel;
import com.example.vengaamipueblo2.moldes.RestauranteMolde;

import java.util.ArrayList;

public class RestauranteAdaptador extends RecyclerView.Adapter<RestauranteAdaptador.viewHolder>
{
    //Atributos:
    public ArrayList<RestauranteMolde> listarestaurantes;

    //Constructor:

    public RestauranteAdaptador(ArrayList<RestauranteMolde> listarestaurantes) {
        this.listarestaurantes = listarestaurantes;
    }

    @NonNull//Anotaciones
    @Override
    public RestauranteAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.molderestaurantes,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listarestaurantes.get(i));
    }

    @Override
    public int getItemCount() {
        return listarestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder
    {
        TextView nombreRestaurante;
        ImageView fotoRestaurante;
        TextView platoRestaurante;
        TextView precioplatoRestaurante;

        public viewHolder(View item)
        {
            super(item);
            nombreRestaurante=item.findViewById(R.id.nombrerestaurante);
            fotoRestaurante=item.findViewById(R.id.imagenrestaurante1);
            platoRestaurante=item.findViewById(R.id.platorestaurante1);
            precioplatoRestaurante=item.findViewById(R.id.preciorestaurante1);
        }

        public void actualizarDatos(RestauranteMolde moldeRestaurante)
        {
            fotoRestaurante.setImageResource(moldeRestaurante.getFoto());
            nombreRestaurante.setText(moldeRestaurante.getNombre());
            platoRestaurante.setText(moldeRestaurante.getDescripcion());
            precioplatoRestaurante.setText(moldeRestaurante.getRangoPrecios());
        }
    }
}
