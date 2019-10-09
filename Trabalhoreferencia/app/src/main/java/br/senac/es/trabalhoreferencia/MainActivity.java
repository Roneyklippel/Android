package br.senac.es.trabalhoreferencia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import br.senac.es.trabalhoreferencia.model.Funcao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nome = (EditText) findViewById(R.id.textNome);
        final EditText senha = (EditText) findViewById(R.id.textsenha);
        final Button logar = (Button) findViewById(R.id.btnlogar);
        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Funcao funcao = new Funcao();
                      funcao.verificar_login(getApplicationContext(), nome, senha);
                      if (funcao.verificar_login(getApplicationContext(),nome, senha) == true){
                          Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                          startActivity(intent);
                      }

                }


            });


        }
    }




