package co.edu.uniquindio.android.electiva.vozarron.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import co.edu.uniquindio.android.electiva.vozarron.R;
import co.edu.uniquindio.android.electiva.vozarron.fragment.ListaEntrenadoresFragment;
import co.edu.uniquindio.android.electiva.vozarron.fragment.ListaParticipantesFragment;
import co.edu.uniquindio.android.electiva.vozarron.vo.Entrenador;
import co.edu.uniquindio.android.electiva.vozarron.vo.Participante;

public class ParticipanteActivity extends AppCompatActivity implements ListaParticipantesFragment.OnParticipanteSeleccionadoListener {

    private ArrayList<Participante> participantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participante);
        ListaParticipantesFragment listaParticipantesFragment = (ListaParticipantesFragment) getSupportFragmentManager().findFragmentById(R.id.fragmento_lista_participantes);

        participantes = listaParticipantesFragment.getParticipantes();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onParticipanteSeleccionado(int position) {
        Intent intent = new Intent(this, DetalleParticipanteActivity.class);
        intent.putExtra("participante", participantes.get(position));
        startActivity(intent);
    }
}
