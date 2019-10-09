package br.com.senac.projetoreferencia;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import br.com.senac.projetoreferencia.model.Mensagem;
import br.com.senac.projetoreferencia.model.Status;

public class Tab1Fragment extends Fragment {

    ListView listViewMensagensEnviadas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        listViewMensagensEnviadas = (ListView) view.findViewById(R.id.lista_mensagens_enviadas);

        List<Mensagem> mensagens = new ArrayList<Mensagem>();

        for(int i=0; i<30; i++)
            mensagens.add(new Mensagem(1L, "Mensagem " + i, Status.ENVIADA));

        ArrayAdapter<Mensagem> adapter = new ArrayAdapter<Mensagem>(getActivity(),
                android.R.layout.simple_list_item_1, mensagens);

        listViewMensagensEnviadas.setAdapter(adapter);

        return view;
    }
}