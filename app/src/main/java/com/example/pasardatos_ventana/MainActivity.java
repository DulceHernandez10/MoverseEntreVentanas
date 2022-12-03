package com.example.pasardatos_ventana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public Button guardar;
    public Button salir;
    //String no="Dulce", aP="Hernandez", aM="Garcia";
   // String ca="16 de Septiembre", mu="San Juan del Rio", es="Queretaro";
   // String co="18590267", ca="ITICS", se="9no";
    public EditText nombre, a_paterno, a_materno, calle, municipio, estado, control, carrera, semestre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=findViewById(R.id.personales);
        a_paterno=findViewById(R.id.a_paterno);
        a_materno=findViewById(R.id.a_materno);
        calle=findViewById(R.id.domicilio);
        municipio=findViewById(R.id.municipio);
        estado=findViewById(R.id.estado);
        control=findViewById(R.id.escolares);
        carrera=findViewById(R.id.carrera);
        semestre=findViewById(R.id.semestre);
    }
     public void enviar(View view){
        Intent v1=new Intent(MainActivity.this,Mostrar_Datos.class);
         String no=nombre.getText().toString();
         String ap=a_paterno.getText().toString();
         String am=a_materno.getText().toString();
         String ca=calle.getText().toString();
         String mu=municipio.getText().toString();
         String es=estado.getText().toString();
         String co=control.getText().toString();
         String car=carrera.getText().toString();
         String se=semestre.getText().toString();
         v1.putExtra("nombre", no);
         v1.putExtra("a_paterno", ap);
         v1.putExtra("a_materno", am);
         v1.putExtra("calle", ca);
         v1.putExtra("municipio", mu);
         v1.putExtra("estado", es);
         v1.putExtra("control", co);
         v1.putExtra("carrera", car);
         v1.putExtra("semestre", se);
         startActivity(v1);

     }
     public void salir(View view){
        finish();
     }
}