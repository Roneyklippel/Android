package br.senac.es.trabalhoHelpDesk;

import android.os.Bundle;
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

import br.senac.es.trabalhoHelpDesk.API.ChamadoTask;
import br.senac.es.trabalhoHelpDesk.API.OnEventListener;
import br.senac.es.trabalhoHelpDesk.model.Chamados;
import br.senac.es.trabalhoHelpDesk.model.Status;


public class Tab1Fragment extends Fragment {
    ListView listChamadosAbertos;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
final View view = inflater.inflate(R.layout.fragment_one, container, false);

        final List<Chamados> listaDeChamadosAbertos = new ArrayList<Chamados>();

        ChamadoTask chamadoTask = new ChamadoTask(view.getContext(), new OnEventListener<String>() {
            @Override
            public void onSuccess(String result) {
                Toast.makeText(view.getContext(), "ABERTOS: ", Toast.LENGTH_LONG).show();
//                Log.e("JSON",result);
                Gson gson = new Gson();

                Chamados[] chamados = gson.fromJson(result, Chamados[].class);

            for (Chamados chamado: chamados){
                if(chamado.getStatus().toLowerCase().equals("aberto")){

                listaDeChamadosAbertos.add(chamado);



                }
                ArrayAdapter<Chamados> adapter = new ArrayAdapter<Chamados>(getActivity(),android.R.layout.simple_list_item_1, listaDeChamadosAbertos);



                listChamadosAbertos = (ListView) view.findViewById(R.id.lista);
                listChamadosAbertos.setAdapter(adapter);
            }


            }

            @Override
            public void onFailure(Exception e) {
                Toast.makeText(view.getContext(),"ERROR: " + e.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
        chamadoTask.execute();
        return view;
    }
}