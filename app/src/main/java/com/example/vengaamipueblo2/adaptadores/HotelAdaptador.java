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

import java.util.ArrayList;

public class HotelAdaptador extends RecyclerView.Adapter<HotelAdaptador.viewHolder>
{
    //Atributos:
    public ArrayList<MoldeHotel> listadeHoteles;

    //Constructor:

    public HotelAdaptador(ArrayList<MoldeHotel> listadeHoteles) {
        listadeHoteles = listadeHoteles;
    }

    @NonNull//Anotaciones
    @Override
    public HotelAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdaptador.viewHolder viewHolder, int i) {
    viewHolder.actualizarDatos(listadeHoteles.get(i));
    }

    @Override
    public int getItemCount() {
        return listadeHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder
    {
        TextView nombreHotel;
        TextView precioHotel;
        ImageView fotohotel;

        public viewHolder(View item)
        {
            super(item);
            fotohotel=item.findViewById(R.id.fotoitem);
            nombreHotel=item.findViewById(R.id.tituloitem);
            precioHotel=item.findViewById(R.id.precioitem);
        }

        public void actualizarDatos(MoldeHotel moldeHotel)
        {
            fotohotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
        }
    }
}
