package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //Declaração de componentes
    EditText edt_user, edt_pass;
    Button btn_entrar, btn_sair;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        edt_user = findViewById(R.id.edt_user);
        edt_pass = findViewById(R.id.edt_pass);
        btn_entrar = findViewById(R.id.btn_entrar);
        btn_sair = findViewById(R.id.btn_sair);

        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = edt_user.getText().toString();
                String email = edt_pass.getText().toString();

                if (nome.equals("etecia") && email.equals("etecia"))
                {

                    //abrindo outra janela
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha inválidos!!!",
                            Toast.LENGTH_SHORT).show();
                    //chamando método limpar tela
                    limparTela();
                }
            }
        });


    }

    //criando o método para limpar a tela
    public void limparTela()
    {
        edt_user.setText("");
        edt_pass.setText("");
        edt_user.requestFocus();
    }



    public void acessarJanela(View view)
    {

    }
}