package co.edu.uniquindio.android.electiva.vozarron.fragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import co.edu.uniquindio.android.electiva.vozarron.R;
import co.edu.uniquindio.android.electiva.vozarron.util.AdaptadorEntrenador;
import co.edu.uniquindio.android.electiva.vozarron.util.AdaptadorParticipante;
import co.edu.uniquindio.android.electiva.vozarron.vo.Entrenador;
import co.edu.uniquindio.android.electiva.vozarron.vo.Participante;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListaParticipantesFragment extends Fragment implements AdaptadorParticipante.OnClickAdaptadorDeParticipante{

    private RecyclerView listaParticipantes;
    private ArrayList<Participante> participantes;
    private AdaptadorParticipante adaptador;
    private OnParticipanteSeleccionadoListener listener;

    public ListaParticipantesFragment() {
        // Required empty public constructor
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_participantes, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listaParticipantes = (RecyclerView) getView().findViewById(R.id.listaParticipantes);

        adaptador = new AdaptadorParticipante(participantes, this);
        listaParticipantes.setAdapter(adaptador);
        listaParticipantes.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        int [] fotos={ R.drawable.andrea, R.drawable.carlos, R.drawable.juana, R.drawable.martin, R.drawable.susana,
                R.drawable.jose, R.drawable.camila, R.drawable.hernesto, R.drawable.valentina, R.drawable.alejandra,
                R.drawable.rafael, R.drawable.ralph, R.drawable.jennifer, R.drawable.lindsay, R.drawable.andrew};

        String [] nombres= {"Jackie", "Carl","Helen", "Mike","Megan",
                "Joey", "Samantha",  "Bob", "Barb","Linda",
                "Ralph","Andrew", "Jennifer", "Lindsay","Ken" };

        int [] votos ={1000, 3444, 6532, 5432, 5844,
                1234, 9483,   48395, 58500, 56475,
                76854, 38384, 38354, 4898, 15946};

        int [] edad  ={24, 30, 17, 22, 22,
                23,48, 50, 21, 18,
                35, 28, 27, 32, 30};

        String url="https://www.youtube.com/results?search_query=the+voice+audtion+";

        participantes = new ArrayList<>();

        participantes.add(new Participante(0, nombres[0], fotos[0], edad[0], 2, 2, votos[0], url, true));
        participantes.add(new Participante(1, nombres[1], fotos[1], edad[1], 1, 3, votos[1], url, true));
        participantes.add(new Participante(2, nombres[2], fotos[2], edad[2], 1, 1, votos[2], url, true));
        participantes.add(new Participante(3, nombres[3], fotos[3], edad[3], 0, 0, votos[3], url, true));
        participantes.add(new Participante(4, nombres[4], fotos[4], edad[4], 0, 2, votos[4], url, true));
        participantes.add(new Participante(5, nombres[5], fotos[5], edad[5], 2, 3, votos[5], url, true));
        participantes.add(new Participante(6, nombres[6], fotos[6], edad[6], 1, 0, votos[6], url, true));
        participantes.add(new Participante(7, nombres[7], fotos[7], edad[7], 1, 1, votos[7], url, true));
        participantes.add(new Participante(8, nombres[8], fotos[8], edad[8], 2, 2, votos[8], url, true));
        participantes.add(new Participante(9, nombres[9], fotos[9], edad[9], 0, 2, votos[9], url, true));
        participantes.add(new Participante(10, nombres[10], fotos[10], edad[10], 2, 0, votos[10], url, true));
        participantes.add(new Participante(11, nombres[11], fotos[11], edad[11], 0, 1, votos[11], url, true));
        participantes.add(new Participante(12, nombres[12], fotos[12], edad[12], 0, 1, votos[12], url, true));
        participantes.add(new Participante(13, nombres[13], fotos[13], edad[13], 1, 2, votos[13], url, true));
        participantes.add(new Participante(14, nombres[14], fotos[14], edad[14], 2, 3, votos[14], url, true));


        setParticipantes(participantes);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity;

        if (context instanceof Activity){
            activity = (Activity) context;
            try {
                listener = (OnParticipanteSeleccionadoListener) activity;
            } catch (ClassCastException e) {
                throw new ClassCastException(activity.toString() + " debe implementar la interfaz OnParticipanteSeleccionadoListener");
            }
        }
    }

    @Override
    public void onClickPosition(int pos) {
        listener.onParticipanteSeleccionado(pos);
    }

    public interface OnParticipanteSeleccionadoListener {
        void onParticipanteSeleccionado(int position);
    }
}
