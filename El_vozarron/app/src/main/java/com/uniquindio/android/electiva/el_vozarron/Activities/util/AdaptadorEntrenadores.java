package com.uniquindio.android.electiva.el_vozarron.Activities.util;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.uniquindio.android.electiva.el_vozarron.Activities.ListaEntranadores;
import com.uniquindio.android.electiva.el_vozarron.Activities.logic.TrainerDetails;
import com.uniquindio.android.electiva.el_vozarron.Activities.vo.Trainer;
import com.uniquindio.android.electiva.el_vozarron.R;

import java.util.ArrayList;

/**
 * Created by Alfonso on 18/10/2016.
 */
public class AdaptadorEntrenadores  extends RecyclerView.Adapter<AdaptadorEntrenadores.EntrenadorViewHolder> {

    private ArrayList <Trainer> entrenadores;




    public AdaptadorEntrenadores(ArrayList<Trainer> entrenadores) {
        this.entrenadores = entrenadores;
    }

    @Override
    public EntrenadorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.resumen_entrenadores, parent, false);
        EntrenadorViewHolder peliculaVH = new
                EntrenadorViewHolder(itemView);



        return peliculaVH;
    }

    @Override
    public void onBindViewHolder(EntrenadorViewHolder holder, int position) {

        Trainer trainer = entrenadores.get(position);
        holder.binEntrenador(trainer);
    }

    @Override
    public int getItemCount() {
        return entrenadores.size();
    }



    public static class EntrenadorViewHolder
            extends RecyclerView.ViewHolder  {
        private TextView txtNombrePresonaje;
        private TextView txtGenero;
        private ImageView imagen;

        public EntrenadorViewHolder(View itemView) {
            super(itemView);
            txtNombrePresonaje = (TextView)
                    itemView.findViewById(R.id.nombreEntrenador);
            txtGenero = (TextView)
                    itemView.findViewById(R.id.genero);
            imagen=(ImageView)itemView.findViewById(R.id.imagenEntrenador);


            //picture = (ImageView) findViewById(R.id.imagenEntrenador);



        }
        public void binEntrenador(Trainer trainer) {
            txtNombrePresonaje.setText(trainer.getNombre());
            txtGenero.setText(trainer.getGenero());


             imagen.setImageResource(trainer.getFoto());

        }




        }
    }

