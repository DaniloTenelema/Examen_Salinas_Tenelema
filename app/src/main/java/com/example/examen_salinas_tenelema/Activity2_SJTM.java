package com.example.examen_salinas_tenelema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

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
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, cargarDatos());
        listIngreso_SJTM.setAdapter(adapter);
        listIngreso_SJTM.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valor =  listIngreso_SJTM.getAdapter().getItem(position).toString();
                // Toast.makeText(getApplicationContext(), valor, Toast.LENGTH_LONG).show();


            }
        });


    }

    private List<String> cargarDatos(){
        List<String> lista = new ArrayList<>();
        for (int i=0; i<=30; i++){
            String item = "Numero"+i;
            lista.add(item);
        }
        return lista;
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