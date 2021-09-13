package com.example.practico3moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {
private TextView nom,act,dir,det;
private ImageView fot;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        inicializarVista();
        nom.setText(getIntent().getExtras().getString("nombre"));
        fot.setImageResource(getIntent().getExtras().getInt("foto"));
        det.setText(getIntent().getExtras().getString("descripcion"));
        act.setText(getIntent().getExtras().getString("actores"));
        dir.setText(getIntent().getExtras().getString("director"));
        }

    private void inicializarVista(){
        nom = findViewById(R.id.tvNombre);
        fot= findViewById(R.id.ivFoto);
        det= findViewById(R.id.tvDetalle);
        act = findViewById(R.id.tvActores);
        dir= findViewById(R.id.tvDirector);
    }


}


