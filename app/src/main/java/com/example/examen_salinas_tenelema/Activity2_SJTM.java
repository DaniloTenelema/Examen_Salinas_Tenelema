package com.example.examen_salinas_tenelema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Activity2_SJTM extends AppCompatActivity {

    private EditText editNumber_SJTM;
    private Button btnIngresar_SJTM;
    private  Button btnCerrar_SJTM;
    private ListView listIngreso_SJTM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_sjtm);

        editNumber_SJTM = findViewById(R.id.editNumber_SJTM);
        btnIngresar_SJTM = findViewById(R.id.btnIngresar_SJTM);
        btnCerrar_SJTM = findViewById(R.id.btnCerrar_SJTM);
        listIngreso_SJTM = findViewById(R.id.listIngreso_SJTM);



    }
    public void Cerrar(View view){
        Intent siguiente = new Intent(this, Activity1_SJTM.class );
        startActivity(siguiente);
    }


}