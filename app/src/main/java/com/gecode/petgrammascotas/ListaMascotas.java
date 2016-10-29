package com.gecode.petgrammascotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaMascotas extends AppCompatActivity {

    private RecyclerView listadoMascotas;
    ArrayList<Mascota> lstmascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mascotas);
        // creamos nuestro Toolbat personalizado.
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miToolBar);
        setSupportActionBar(miActionBar);

        // Creamos el RecyclerView
        listadoMascotas = (RecyclerView) findViewById( R.id.rvMascota );
        LinearLayoutManager llm = new LinearLayoutManager( this );
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listadoMascotas.setLayoutManager( llm );

        inicializarDatos();
        inicializarAdaptador();
        agregarFAB();
    }


    // ActionView Estrella: nos lleva a una nueva actividad (MascotasFavoritas)
    public  void  irSegundaActividad (View v) {
        Intent intent = new Intent(this,MascotasFavoritas.class);
        startActivity(intent);
    }

    // DataSet: Cargamos los datos que queremos mostrar
    public  void  inicializarDatos(){
        lstmascotas = new ArrayList<>();
        lstmascotas.add(new Mascota(R.drawable.mascota_19_2,"Muñeco","5"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_3,"Laica","6"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_4,"Petrolero","7"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_5,"Valvula","13"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_6,"Gordo","52"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_7,"Mariposa","2"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_8,"Campeón","15"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_9,"Dumbo","7"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_10,"Chimbo","1"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_11,"Lasi","10"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_12,"Poker","5"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_13,"Thimboy","98"));

    }

    public void inicializarAdaptador(){
        AdapterMascota adaptador = new AdapterMascota(lstmascotas,this);
        listadoMascotas.setAdapter(adaptador);
    }

    //Creamos un menu a nuestra aplicacion principal.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    // Accion del boton Camara, solo nos muestra un mensaje por el momento.
    public void agregarFAB(){
        FloatingActionButton mFAB = (FloatingActionButton) findViewById(R.id.FAB_Camera);
        mFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),getResources().getString(R.string.btn_subir),Toast.LENGTH_LONG).show();
            }
        });
    }


}
