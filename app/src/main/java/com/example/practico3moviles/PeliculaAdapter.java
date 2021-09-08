package com.example.practico3moviles;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practico3moviles.modelo.Peliculas;

import java.util.ArrayList;

public class PeliculaAdapter extends RecyclerView.Adapter <PeliculaAdapter.ViewHolder> {
    private ArrayList<Peliculas> pelicula;
    private Context context;
    private LayoutInflater layoutInflater;

    public PeliculaAdapter(ArrayList<Peliculas> pelicula, Context context, LayoutInflater layoutInflater) {
        this.pelicula = pelicula;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }
    @NonNull
    @Override
    //Referenciar a la vista item y pasarsela al viewholder
    public PeliculaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= layoutInflater.inflate(R.layout.item_pelicula, parent, false);
        return new ViewHolder(view);
    }

    @Override
    //Se ejecuta por cada item de la vista
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(pelicula.get(position).getNombre());
        holder.foto.setImageResource(pelicula.get(position).getFoto());
        holder.descrip.setText(pelicula.get(position).getDescripcion());

        holder.detalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }

    @Override
    public int getItemCount() {

        return pelicula.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre;
        private ImageView foto;
        private TextView descrip;
        private Button detalle;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.tvNombre);
            foto=itemView.findViewById(R.id.ivFoto);
            descrip=itemView.findViewById(R.id.etDetalle);
            detalle=itemView.findViewById(R.id.btdetalle);

        }
    }
}
