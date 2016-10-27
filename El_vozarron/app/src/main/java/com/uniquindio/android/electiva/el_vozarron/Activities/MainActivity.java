package com.uniquindio.android.electiva.el_vozarron.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.uniquindio.android.electiva.el_vozarron.R;

public class MainActivity extends Activity implements View.OnClickListener  {
    ///AppCompatActivity
    private Button button1;
    private Button button2;
    private ImageView image;
    private int current;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // getActionBar().hide();
        setContentView(R.layout.activity_main);

        setCurrent(R.drawable.collage);

        button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(this);
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        image=(ImageView) findViewById(R.id.imageViewMain);
        image.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if( button1.getId() == v.getId()){
        //Ejecutar tarea 1
            Intent myIntent = new Intent(MainActivity.this, ListaEntranadores.class);
            MainActivity.this.startActivity(myIntent);
    }

        else if( button2.getId() == v.getId()){
            //Ejecutar tarea 2
            Intent myIntent = new Intent(MainActivity.this, ListaPersonajes.class);
            MainActivity.this.startActivity(myIntent);


        }else{

            if(image.getId()==v.getId()){
                 if(getCurrent()==R.drawable.collage){
                      image.setImageResource(R.drawable.adele3);
                     setCurrent(R.drawable.adele3);
                 }else{

                     if(getCurrent()==R.drawable.adele3){
                         image.setImageResource(R.drawable.rihanna3);
                         setCurrent(R.drawable.rihanna3);
                     }else
                     {


                         if(getCurrent()==R.drawable.rihanna3){
                             image.setImageResource(R.drawable.madonna3);
                             setCurrent(R.drawable.madonna3);
                         }else{

                             if(getCurrent()==R.drawable.madonna3){
                                 image.setImageResource(R.drawable.collage);
                                 setCurrent(R.drawable.collage);

                             }
                         }


                     }


                 }
            }
        }
    }

}
