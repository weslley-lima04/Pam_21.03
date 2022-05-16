package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CafeBadilicoActivity extends AppCompatActivity {
    CardView idCardView;
    Button btnCincoeMeia;
    Button btnSeteeMeia;
    Button btnOitohoras;
    Button btnNovehoras;
    Button btnReserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_badilico_layout);
        //Cardview
        idCardView = findViewById(R.id.idCardView);
        idCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //BtnCincoeMeia
        btnCincoeMeia = findViewById(R.id.btnCincoeMeia);
        btnCincoeMeia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        //BtnSeteeMeia
        btnSeteeMeia = findViewById(R.id.btnSeteeMeia);
        btnSeteeMeia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //BtnOitohoras
        btnOitohoras = findViewById(R.id.btnOitohoras);
        btnOitohoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //BtnNovehoras
        btnNovehoras = findViewById(R.id.btnNovehoras);
        btnNovehoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //BtnReserve
        btnReserve = findViewById(R.id.btnReserve);
        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}