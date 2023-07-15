package com.example.vengaamipueblo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    //zona de atributos

    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitiosTuristicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //estoy asociando los atributos de tipo boton a los ID que pusimos en xml
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitiosTuristicos=findViewById(R.id.botonturismo);
        //escuchando los eventos del clic en el boton
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrimos una nueva actividad desde el home
                Intent intent =new Intent(Home.this,Hoteles.class);
                startActivity(intent);
            }
        });
        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Home.this, Restaurantes.class);
                startActivity(intent2);
            }
            });
        botonSitiosTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3=new Intent(Home.this, Restaurantes.class);
                startActivity(intent3);
                
            }
        });

    }

    //cargamos menu de opciones
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Funcion para cargar el funcionamiento del menu
    public boolean  onOptionsItemSelected(MenuItem item)
    {
        //observar el comportamiento del usuario frente al menu
        int itemSeleccionado=item.getItemId();

        switch (itemSeleccionado)
        {
            case (R.id.opcion1):
                Toast.makeText(this, "Accionaste Español", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.opcion2):
                Toast.makeText(this, "Accionaste Inglés", Toast.LENGTH_SHORT).show();
                break;


            case (R.id.opcion4):
                Toast.makeText(this, "Accionaste acerca de", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}