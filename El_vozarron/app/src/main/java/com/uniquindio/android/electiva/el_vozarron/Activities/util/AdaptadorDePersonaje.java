package com.uniquindio.android.electiva.el_vozarron.Activities.util;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.uniquindio.android.electiva.el_vozarron.Activities.vo.Personaje;
import com.uniquindio.android.electiva.el_vozarron.R;

import java.util.ArrayList;

/**
 * Created by Alfonso on 17/10/2016.
 */
public class AdaptadorDePersonaje extends RecyclerView.Adapter<AdaptadorDePersonaje.PersonajeViewHolder> {


    private ArrayList <Personaje> personajes;


    public AdaptadorDePersonaje(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    @Override
    public PersonajeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.resumen_personajes, parent, false);
        PersonajeViewHolder peliculaVH = new
                PersonajeViewHolder(itemView);
        return peliculaVH;
    }

    @Override
    public void onBindViewHolder(PersonajeViewHolder holder, int position) {
        Personaje personaje = personajes.get(position);
        holder.binPersonaje(personaje);

    }

    @Override
    public int getItemCount() {
        return personajes.size() ;
    }

    public static class PersonajeViewHolder
            extends RecyclerView.ViewHolder {
        private TextView txtNombrePresonaje;
        private TextView txtFechaNacimiento;
        private ImageView imagen;
        public PersonajeViewHolder(View itemView) {
            super(itemView);
            txtNombrePresonaje = (TextView)
                    itemView.findViewById(R.id.nombre);
            txtFechaNacimiento = (TextView)
                    itemView.findViewById(R.id.fecha_nacimiento);
            imagen=(ImageView)itemView.findViewById(R.id.imagen);

        }
        public void binPersonaje(Personaje personaje) {
            txtNombrePresonaje.setText(personaje.getNombre());
            txtFechaNacimiento.setText(personaje.getFechaNacimiento().toString()
            );

            imagen.setImageResource(personaje.getFoto());
        }


    }
}