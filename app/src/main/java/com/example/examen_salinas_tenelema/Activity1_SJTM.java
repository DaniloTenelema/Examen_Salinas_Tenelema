package com.example.examen_salinas_tenelema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Activity1_SJTM extends AppCompatActivity {

    private Button btnOrdenar_SJTM;
    private Button btnActivity_SJTM;
    private Button btnMostrar_SJTM;
    private ListView ListVectorOrdenado_SJTM;
    private  ListView ListVectorIndices_SJTM;
    private ListView ListVectorOriginal_SJTM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1_sjtm);

        btnOrdenar_SJTM = findViewById(R.id.btnOrdenar_SJTM);
        btnActivity_SJTM = findViewById(R.id.btnActivity_SJTM);
        btnMostrar_SJTM = findViewById(R.id.btnMostrar_SJTM);
        ListVectorOrdenado_SJTM = findViewById(R.id.ListVectorOrdenado_SJTM);
        ListVectorIndices_SJTM = findViewById(R.id.ListVectorIndices_SJTM);
        ListVectorOriginal_SJTM = findViewById(R.id.ListVectorOriginal_SJTM);
    }

    public void Siguiente_SJTM(View view){
        Intent siguiente = new Intent(this, Activity2_SJTM.class );
        startActivity(siguiente);

    }
}