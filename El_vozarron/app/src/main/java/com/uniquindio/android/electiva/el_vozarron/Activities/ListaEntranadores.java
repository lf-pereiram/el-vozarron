package com.uniquindio.android.electiva.el_vozarron.Activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.uniquindio.android.electiva.el_vozarron.Activities.util.AdaptadorDePersonaje;
import com.uniquindio.android.electiva.el_vozarron.Activities.util.AdaptadorEntrenadores;
import com.uniquindio.android.electiva.el_vozarron.Activities.vo.Entrenador;
import com.uniquindio.android.electiva.el_vozarron.Activities.vo.Personaje;
import com.uniquindio.android.electiva.el_vozarron.R;

import java.util.ArrayList;
import java.util.Date;

public class ListaEntranadores extends Activity {


    private RecyclerView listadoDeEntrenadores;
    private ArrayList<Entrenador> entrenadors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_lista_entranadores);
        entrenadors=new ArrayList();
        entrenadors.add(new Entrenador("Adele", "Pop, Jazz and Soul", "",R.drawable.adele ));
        entrenadors.add(new Entrenador("Rihanna", "Pop", "",R.drawable.rihanna ));
        entrenadors.add(new Entrenador("Madonna", "Pop", "",R.drawable.madonna ));
        listadoDeEntrenadores= (RecyclerView)
                findViewById(R.id.listaEntrenadores);
        final  AdaptadorEntrenadores adaptador = new AdaptadorEntrenadores(entrenadors);
        listadoDeEntrenadores.setAdapter(adaptador);
        listadoDeEntrenadores.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                        false));
    }
}
