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

    private EditText Number_SJTM;
    private Button Ingresar_SJTM;
    private  Button Cerrar_SJTM;
    private ListView Ingreso_SJTM;
    private List<Vector> Vector_SJTM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_sjtm);

        Number_SJTM = findViewById(R.id.editNumber_SJTM);
        Ingresar_SJTM = findViewById(R.id.btnIngresar_SJTM);
        Cerrar_SJTM = findViewById(R.id.btnCerrar_SJTM);
        Ingreso_SJTM = findViewById(R.id.listIngreso_SJTM);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Ingresar_SJTM());
        Ingreso_SJTM.setAdapter(adapter);
        Ingreso_SJTM.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valor = Ingreso_SJTM.getAdapter().getItem(position).toString();
                // Toast.makeText(getApplicationContext(), valor, Toast.LENGTH_LONG).show();


            }
        });

    }

    public List<String> Ingresar_SJTM () {
        List<String> lista = new ArrayList<>();
        for (int i = 0; i <= lista.size(); i++) {
            String numero = getIntent().getStringExtra("numero");
            Number_SJTM.setText(numero);
        }
        return lista;
    }

    public void Cerrar_SJTM(View view){
        Intent activity1_SJTM = new Intent(this, Activity1_SJTM.class );
        startActivity(activity1_SJTM);
    }





}