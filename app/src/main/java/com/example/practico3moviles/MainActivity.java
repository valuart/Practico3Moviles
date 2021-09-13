package com.example.practico3moviles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.practico3moviles.modelo.Peliculas;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private PeliculaAdapter padapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rvPeli);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL,false);
        rv.setLayoutManager(gridLayoutManager);
        padapter = new PeliculaAdapter(ObtenerPeliculas(), this,getLayoutInflater());
        rv.setAdapter(padapter);

    }

    private ArrayList<Peliculas> ObtenerPeliculas(){
        ArrayList<Peliculas> lista = new ArrayList<>();
        lista.add(new Peliculas("Candyman",R.drawable.peli1, "Narra la historia del famoso asesino con un gancho en la mano, el cual puede ser invocado al decir su nombre 5 veces frente al espejo, pero quienes se atrevan a llamarlo deberán pagar un alto precio","Yahya Abdul-Mateen II y Teyonah Parris", " Jordan Peele"));
        lista.add(new Peliculas("Luca", R.drawable.peli2, "Luca es un monstruo marino que vive debajo de un pueblo de la costa italiana. Cuando sale a la superficie, adquiere una apariencia humana, y conoce nuevos amigos", "Jacob Tremblay y Jack Dylan Grazer", " Enrico Casarosa"));
        lista.add(new Peliculas("Cruella",R.drawable.peli3, "Estella está decidida a hacerse un nombre en el mundo de la moda. Tras hacerse amiga de la baronesa von Hellman, abraza su lado malvado para convertirse en la vengativa Cruella.", "Emma Stone y Emma Thompson", "Craig Gillespie"));
        lista.add(new Peliculas( "Viuda Negra",R.drawable.peli4, "Una peligrosa conspiración, relacionada con su pasado, persigue a Natasha Romanoff. La agente tendrá que lidiar con las consecuencias de haber sido espía, así como con las relaciones rotas, para sobrevivir.", "Scarlett Johansson y David Harbour ", "Cate Shortland"));

        return lista;
    }

    }

