package com.example.examen_salinas_tenelema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity2_SJTM extends AppCompatActivity {

    private EditText editNumber_SJTM;
    private Button btnIngresar_SJTM;
    private  Button btnCerrar_SJTM;
    private ListView listIngreso_SJTM;
    private ArrayList<String> Vector_SJTM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_sjtm);

        editNumber_SJTM = findViewById(R.id.editNumber_SJTM);
        btnIngresar_SJTM = findViewById(R.id.btnIngresar_SJTM);
        btnCerrar_SJTM = findViewById(R.id.btnCerrar_SJTM);
        listIngreso_SJTM = findViewById(R.id.listIngreso_SJTM);
        Vector_SJTM = new ArrayList<String>()
        String numero = getIntent().getStringExtra("numero");
        editNumber_SJTM.setText(numero);

    }

    public  void Ingresar_SJTM(View view){

        String numero = getIntent().getStringExtra("numero");
        editNumber_SJTM.setText(numero);
    }

    public void Cerrar_SJTM(View view){
        Intent activity1_SJTM = new Intent(this, Activity1_SJTM.class );
        startActivity(activity1_SJTM);
    }





}