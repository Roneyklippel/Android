package br.com.senac.projetoreferencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NovaMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_mensagem);

        final EditText edtMensagem = (EditText) findViewById(R.id.edt_mensagem);
        Button btnEnviarMensagem = (Button) findViewById(R.id.btn_enviar_mensgem);

        btnEnviarMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mensagem = edtMensagem.getText().toString();

                Intent intent = new Intent(NovaMensagemActivity.this, TabsActivity.class);
                intent.putExtra("msgm", mensagem);
                startActivity(intent);

            }
        });
    }
}
