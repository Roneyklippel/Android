package br.senac.es.trabalhoreferencia.model;

import android.media.MediaDrm;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import br.senac.es.trabalhoreferencia.API.ChamadoTask;
import br.senac.es.trabalhoreferencia.API.MensagemTask;
import br.senac.es.trabalhoreferencia.API.OnEventListener;
import br.senac.es.trabalhoreferencia.R;
//import br.senac.trabalhoreferencia.api.OnEventListener;

public class Tab1Fragment extends Fragment {

    ListView listViewMensagensEnviadas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_one, container, false);
        final List<Mensagem> mensagens = new ArrayList<Mensagem>();


        ChamadoTask chamadoTask = new ChamadoTask(view.getContext(), new OnEventListener<String>() {


            @Override
            public void onSuccess(String result) {
                Toast.makeText(view.getContext(), "SUCCESS" + result, Toast.LENGTH_LONG).show();
                Log.e("JSON", result);
                Gson gson = new Gson();
                Chamado[] mensagens = gson.fromJson(result, Chamado[].class);
                ArrayAdapter<Chamado> adapter = new ArrayAdapter<Chamado>(getActivity(),
                        android.R.layout.simple_list_item_1, mensagens);

                listViewMensagensEnviadas = (ListView) view.findViewById(R.id.lista);
                listViewMensagensEnviadas.setAdapter(adapter);
            }

            @Override
            public void onFailure(Exception e) {
                Toast.makeText(view.getContext(), "ERROR" + e.getMessage(), Toast.LENGTH_LONG).show();

            }

        });
        chamadoTask.execute();
        return view;

    }
}