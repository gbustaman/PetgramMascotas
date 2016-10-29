package com.gecode.petgrammascotas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    private RecyclerView listadoMascotas;
    ArrayList<Mascota> lstmascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        listadoMascotas = (RecyclerView) findViewById( R.id.rvMascota );
        LinearLayoutManager llm = new LinearLayoutManager( this );
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listadoMascotas.setLayoutManager( llm );
        inicializarListaMascotas();
        inicializarAdaptador();
        agregarFAB();
    }

    // DataSet: Cargamos los datos que queremos mostrar
    public  void  inicializarListaMascotas(){
        lstmascotas = new ArrayList<>();
        lstmascotas.add(new Mascota(R.drawable.mascota_19_5,"Valvula","13"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_6,"Gordo","52"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_8,"Campeón","15"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_11,"Lasi","10"));
        lstmascotas.add(new Mascota(R.drawable.mascota_19_13,"Thimboy","98"));
    }

    public void inicializarAdaptador(){
        AdapterMascota adaptador = new AdapterMascota(lstmascotas,this);
        listadoMascotas.setAdapter(adaptador);
    }

    // Retorna a la Primera Activida al dar Click en el boton retroceso
    public  void  irPrimeraActividad (View v) {
        finish();
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
