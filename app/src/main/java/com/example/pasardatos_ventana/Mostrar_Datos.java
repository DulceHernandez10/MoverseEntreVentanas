package com.example.pasardatos_ventana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class Mostrar_Datos extends AppCompatActivity {
    public EditText personales1,personales2, personales3;
    public EditText domicilio, domicilio2, domicilio3;
    public EditText escolares, escolares2, escolares3;
    public Button salir;
           Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);
        personales1=findViewById(R.id.personales1);
        personales2=findViewById(R.id.personales2);
        personales3=findViewById(R.id.personales3);
        domicilio=findViewById(R.id.domicilio);
        domicilio2=findViewById(R.id.domicilio2);
        domicilio3=findViewById(R.id.domicilio3);
        escolares=findViewById(R.id.escolares);
        escolares2=findViewById(R.id.escolares2);
        escolares3=findViewById(R.id.escolares3);
        datos=getIntent().getExtras();
        personales1.setText(datos.getString("nombre"));
        personales2.setText(datos.getString("a_paterno"));
        personales3.setText(datos.getString("a_materno"));
        domicilio.setText(datos.getString("calle"));
        domicilio2.setText(datos.getString("municipio"));
        domicilio3.setText(datos.getString("estado"));
        escolares.setText(datos.getString("control"));
        escolares2.setText(datos.getString("carrera"));
        escolares3.setText(datos.getString("semestre"));



    }
    public void salir(View view){
        finish();
    }

    public void limpiar(View view) {
        personales1.setText("");
        personales2.setText("");
        personales3.setText("");
        domicilio.setText("");
        domicilio2.setText("");
        domicilio3.setText("");
        escolares.setText("");
        escolares2.setText("");
        escolares3.setText("");

    }
}