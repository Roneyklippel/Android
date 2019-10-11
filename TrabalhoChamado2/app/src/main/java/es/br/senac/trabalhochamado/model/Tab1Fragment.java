package es.br.senac.trabalhochamado.model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;

import br.com.senac.projetoreferencia.api.MensagemTask;
import br.com.senac.projetoreferencia.api.OnEventListener;
import br.com.senac.projetoreferencia.model.Mensagem;

public class Tab1Fragment extends Fragment {

    ListView listViewMensagensEnviadas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View viewFragment = inflater.inflate(R.layout.fragment_one, container, false);

        final FloatingActionButton btnAtualizar = (FloatingActionButton) viewFragment.findViewById(R.id.btn_atualizar);

        atualizaListaMensagens(viewFragment);

        btnAtualizar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                atualizaListaMensagens(viewFragment);

            }
        });


        return viewFragment;
    }

    private void atualizaListaMensagens(final View viewMetodo) {

        MensagemTask mensagemTask = new MensagemTask(viewMetodo.getContext(), new OnEventListener<String>() {
            @Override
            public void onSuccess(String result) {

                Gson gson = new Gson();

                Mensagem[] mensagens = gson.fromJson(result, Mensagem[].class);

                ArrayAdapter<Mensagem> adapter = new ArrayAdapter<Mensagem>(getActivity(),
                        android.R.layout.simple_list_item_1, mensagens);

                listViewMensagensEnviadas = (ListView) viewMetodo.findViewById(R.id.lista_mensagens_enviadas);
                listViewMensagensEnviadas.setAdapter(adapter);
            }

            @Override
            public void onFailure(Exception e) {
                Toast.makeText(viewMetodo.getContext(), "ERROR: " + e.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        mensagemTask.execute();
    }
}