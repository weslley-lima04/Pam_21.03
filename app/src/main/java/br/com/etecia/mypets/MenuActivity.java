package br.com.etecia.mypets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_pets, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.icCadastrar:
                Toast.makeText(
                        getApplicationContext(),
                        "Cadastrado com sucesso!",
                        Toast.LENGTH_LONG
                ).show();
            break;
            case R.id.icAtualizar:
                Toast.makeText(
                        getApplicationContext(),
                        "Atualizado com sucesso!",
                        Toast.LENGTH_LONG
                ).show();
            break;
            case R.id.icExcluir:
                Toast.makeText(
                        getApplicationContext(),
                        "Excluído com sucesso!",
                        Toast.LENGTH_LONG
                ).show();
            break;
            case R.id.icPesquisar:
                Toast.makeText(
                        getApplicationContext(),
                        "Pesquisando...",
                        Toast.LENGTH_LONG
                ).show();
            break;


        }
        return super.onOptionsItemSelected(item);
    }
}