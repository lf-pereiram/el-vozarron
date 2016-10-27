package com.uniquindio.android.electiva.el_vozarron.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.uniquindio.android.electiva.el_vozarron.Activities.logic.TrainerDetails;
import com.uniquindio.android.electiva.el_vozarron.Activities.util.AdaptadorEntrenadores;
import com.uniquindio.android.electiva.el_vozarron.Activities.vo.Trainer;
import com.uniquindio.android.electiva.el_vozarron.R;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class ListaEntranadores extends Activity implements View.OnClickListener {


    private RecyclerView singersList;
    private ArrayList <Trainer> trainers;
    private ImageView imageplus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_lista_entranadores);

       imageplus= (ImageView) findViewById(R.id.imageSeeTrainerDetails);
       imageplus.setOnClickListener(this);





        trainers =new ArrayList();
        trainers.add(new Trainer("Adele", "Pop, Jazz and Soul", "",R.drawable.adele2));
        trainers.add(new Trainer("Rihanna", "Pop", "",R.drawable.rihanna2 ));
        trainers.add(new Trainer("Madonna", "Pop", "",R.drawable.madonna2    ));
        singersList= (RecyclerView)
                findViewById(R.id.listaEntrenadores);
        final  AdaptadorEntrenadores adaptador = new AdaptadorEntrenadores(trainers);
        singersList.setAdapter(adaptador);
        singersList.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                        false));
    }

    @Override
    public void onClick(View v) {


   if(imageplus.getId()==v.getId())

   {      Intent myIntent = new Intent(ListaEntranadores.this, TrainerDetails.class);
            ListaEntranadores.this.startActivity(myIntent);
        }

    }

}


