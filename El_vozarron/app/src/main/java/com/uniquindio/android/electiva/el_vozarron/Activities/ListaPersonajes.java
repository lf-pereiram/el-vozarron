package com.uniquindio.android.electiva.el_vozarron.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.uniquindio.android.electiva.el_vozarron.Activities.logic.Register;
import com.uniquindio.android.electiva.el_vozarron.Activities.util.AdaptadorDePersonaje;
import com.uniquindio.android.electiva.el_vozarron.Activities.vo.Personaje;
import com.uniquindio.android.electiva.el_vozarron.R;

import java.util.ArrayList;
import java.util.Date;

public class ListaPersonajes extends Activity implements View.OnClickListener {


    private RecyclerView singersList;
    private ArrayList <Personaje> singers;
    private ImageView addUser;
    private String url;
    private String trainer ;


    private String [] trainers  ={"Adele", "Madonna", "Rihanna" };
    private String [] dates  ={"15/07/1993", "15/08/1983", "30/12/1990", "24/09/1978", "21/07/1993",
                               "10/07/1992","2/07/1995" , "5/07/1978", "25/07/1973", "15/07/1993",
                                "25/07/1993", "1/07/1993", "4/07/1993", "15/06/1993", "15/08/1993"};
    private int [] pictures={ R.drawable.andrea, R.drawable.carlos, R.drawable.juana, R.drawable.martin, R.drawable.susana,
                             R.drawable.jose, R.drawable.camila, R.drawable.hernesto, R.drawable.valentina, R.drawable.alejandra,
                             R.drawable.rafael, R.drawable.ralph, R.drawable.jennifer, R.drawable.lindsay, R.drawable.andrew};

    private Date birthDate;
    private String [] names= {"Jackie", "Carl","Helen", "Mike","Megan",
                              "Joey", "Samantha",  "Bob", "Barb","Linda",
                              "Ralph","Andrew", "Jennifer", "Lindsay","Ken" };
    private String [] jobs={"Student", "Engeneer", "Teacher" };
    private int [] votes ={1000, 3444, 6532, 5432, 5844,
                           1234, 9483,   48395, 58500, 56475,
                            76854, 38384, 38354, 4898, 15946};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_personajes);

        addUser = (ImageView) findViewById(R.id.addSinger);
        addUser.setOnClickListener(this);
///String nombre, Date fechaNacimiento, String url, String entrenador, String ocupacion, int numeroVotos, int foto
         url="https://www.youtube.com/results?search_query=the+voice+audtion+";

        singers = new ArrayList();
        singers.add(new Personaje(names[0],  dates[0],  url,  trainers[0], jobs[0], votes[0],  pictures[0], true));
        singers.add(new Personaje(names[1],  dates[1],  url,  trainers[1], jobs[1], votes[1],  pictures[1], true));
        singers.add(new Personaje(names[2],  dates[2],  url,  trainers[2], jobs[2], votes[2],  pictures[2], true));
        singers.add(new Personaje(names[3],  dates[3],  url,  trainers[0], jobs[0], votes[3],  pictures[3], true));
        singers.add(new Personaje(names[4],  dates[4],  url,  trainers[1], jobs[1], votes[4],  pictures[4], true));
        singers.add(new Personaje(names[5],  dates[5],  url,  trainers[2], jobs[2], votes[5],  pictures[5], false));
        singers.add(new Personaje(names[6],  dates[6],  url,  trainers[0], jobs[0], votes[6],  pictures[6], true));
        singers.add(new Personaje(names[7],  dates[7],  url,  trainers[1], jobs[1], votes[7],  pictures[7], true));
        singers.add(new Personaje(names[8],  dates[8],  url,  trainers[2], jobs[2], votes[8],  pictures[8], false));
        singers.add(new Personaje(names[9],  dates[9],  url,  trainers[0], jobs[2], votes[9],  pictures[9], true));
        singers.add(new Personaje(names[10], dates[10], url,  trainers[1], jobs[1], votes[10], pictures[10], true));
        singers.add(new Personaje(names[11], dates[11], url,  trainers[2], jobs[2], votes[11], pictures[11], false));
        singers.add(new Personaje(names[12], dates[12], url,  trainers[0], jobs[2], votes[12], pictures[12], true ));
        singers.add(new Personaje(names[13], dates[13], url,  trainers[1], jobs[0], votes[13], pictures[13], true));
        singers.add(new Personaje(names[14], dates[14], url,  trainers[2], jobs[0], votes[14], pictures[14], true));



        singersList= (RecyclerView)
                findViewById(R.id.listaPersonajes);
        final  AdaptadorDePersonaje adaptador = new AdaptadorDePersonaje(singers);
        singersList.setAdapter(adaptador);
        singersList.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                        false));


    }

    @Override
    public void onClick(View v) {
        if( addUser.getId() == v.getId()){
            //Ejecutar tarea 1
            Intent myIntent = new Intent(ListaPersonajes.this, Register.class);
            ListaPersonajes.this.startActivity(myIntent);

        }
    }
}
