package br.senac.es.trabalhoreferencia.model;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

public class Funcao  {
    public boolean verificar_login(Context context, EditText nome, EditText senha){
        if (nome.getText().toString().equals("admin") && (senha.getText().toString().equals("admin"))){
            Toast tost = Toast.makeText(context, "Login feito com sucesso", Toast.LENGTH_LONG);
            tost.show();
            return true;
        }else {   Toast tost = Toast.makeText(context, "Login ou senha incorretos", Toast.LENGTH_LONG);
            tost.show();
            return false;

        }
    }





}
