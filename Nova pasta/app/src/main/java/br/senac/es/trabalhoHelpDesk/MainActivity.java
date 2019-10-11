package br.senac.es.helpdeskrennan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;


import br.senac.es.trabalhoHelpDesk.API.LoginTask;
import br.senac.es.trabalhoHelpDesk.API.OnEventListener;
import br.senac.es.trabalhoHelpDesk.API.Usuario;
import br.senac.es.trabalhoHelpDesk.R;

public class MainActivity extends Fragment {
    ListView listaDeUsuariosCadastrados;


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_main, container, false);
        final List<Usuario> listaDeUsuariosCadastrados = new ArrayList<Usuario>();
        LoginTask loginTask = new LoginTask(view.getContext(), new OnEventListener<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                final Usuario[] usuarios = gson.fromJson(result, Usuario[].class);

                final Button logar = (Button) view.findViewById(R.id.botaoLogarRn);
                final EditText login = (EditText) view.findViewById(R.id.txtNomeRn);
                final EditText senha = (EditText) view.findViewById(R.id.txtSenhaRn);
                logar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        for (Usuario usuario : listaDeUsuariosCadastrados) {
                            if (usuario.getLogin().equals(login.toString()) && usuario.getPassword().equals(senha.toString())) {
                                listaDeUsuariosCadastrados.add(usuario);
                                Toast.makeText(view.getContext(), "Login correto", Toast.LENGTH_LONG).show();

                            }

                        }

                    }
                });

            }

            @Override
            public void onFailure(Exception e) {
                Toast.makeText(view.getContext(), "Login incorreto", Toast.LENGTH_LONG).show();

            }
        });

        return view;
    }
}

