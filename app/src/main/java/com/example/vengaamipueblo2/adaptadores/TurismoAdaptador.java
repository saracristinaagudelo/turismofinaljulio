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
import com.example.vengaamipueblo2.moldes.TurismoMolde;

import java.util.ArrayList;

public class TurismoAdaptador extends RecyclerView.Adapter<TurismoAdaptador.viewHolder>
{
    //Atributos:
    public ArrayList<TurismoMolde> listadeturismo;

    //Constructor:

    public TurismoAdaptador(ArrayList<TurismoMolde> listadeturismo) {
        this.listadeturismo = listadeturismo;
    }

    @NonNull//Anotaciones
    @Override
    public TurismoAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldeturismo,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull TurismoAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listadeturismo.get(i));
    }

    @Override
    public int getItemCount() {
        return listadeturismo.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder
    {
        ImageView foto;
        TextView nombresitio;
        TextView telefonositio;
        TextView preciositio;

        public viewHolder(View item)
        {
            super(item);
            foto=item.findViewById(R.id.imagenturismo1);
            nombresitio=item.findViewById(R.id.nombreturismo1);
            telefonositio=item.findViewById(R.id.telefonoturismo1);
            preciositio=item.findViewById(R.id.precioturismo1);
        }

        public void actualizarDatos(TurismoMolde moldeturismo)
        {
            foto.setImageResource(moldeturismo.getFoto());
            nombresitio.setText(moldeturismo.getNombresitio());
            telefonositio.setText(moldeturismo.getTelefonositio());
            preciositio.setText(moldeturismo.getPreciositio());
        }
    }
}
