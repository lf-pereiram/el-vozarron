package com.uniquindio.android.electiva.el_vozarron.Activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.uniquindio.android.electiva.el_vozarron.Activities.util.AdaptadorDePersonaje;
import com.uniquindio.android.electiva.el_vozarron.Activities.vo.Personaje;
import com.uniquindio.android.electiva.el_vozarron.R;

import java.util.ArrayList;
import java.util.Date;

public class ListaPersonajes extends Activity {


    private RecyclerView listadoDePersonajes;
    private ArrayList <Personaje> personajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_personajes);


        personajes = new ArrayList();
        personajes.add(new Personaje("Jackie", new
                Date(System.currentTimeMillis()),R.drawable.helena));
        personajes.add(new Personaje("Carl", new
                Date(System.currentTimeMillis()), R.drawable.carlos));
        personajes.add(new Personaje("Helen", new
                Date(System.currentTimeMillis()),R.drawable.andrea));
        personajes.add(new Personaje("Megan", new
                Date(System.currentTimeMillis()), R.drawable.juana));
        personajes.add(new Personaje("Mike", new
                Date(System.currentTimeMillis()), R.drawable.martin));


        personajes.add(new Personaje("Samantha", new
                Date(System.currentTimeMillis()) , R.drawable.susana));
        personajes.add(new Personaje("Joey", new
                Date(System.currentTimeMillis()), R.drawable.jose));
        personajes.add(new Personaje("Linda", new
                Date(System.currentTimeMillis()), R.drawable.camila));
        personajes.add(new Personaje("Bob", new
                Date(System.currentTimeMillis()), R.drawable.hernesto));
        personajes.add(new Personaje("Barb", new
                Date(System.currentTimeMillis()),  R.drawable.valentina));
        personajes.add(new Personaje("Casey", new
                Date(System.currentTimeMillis()),R.drawable.alejandra));
        personajes.add(new Personaje("Ralph", new
                Date(System.currentTimeMillis()), R.drawable.rafael));
        listadoDePersonajes= (RecyclerView)
                findViewById(R.id.listaPersonajes);
        final AdaptadorDePersonaje adaptador = new
                AdaptadorDePersonaje(personajes);
        listadoDePersonajes.setAdapter(adaptador);
        listadoDePersonajes.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                        false));
    }
}
