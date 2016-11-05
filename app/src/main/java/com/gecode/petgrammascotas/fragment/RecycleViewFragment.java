package com.gecode.petgrammascotas.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gecode.petgrammascotas.R;
import com.gecode.petgrammascotas.adapter.AdapterMascota;
import com.gecode.petgrammascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by gregorybr on 30-10-16.
 */

public class RecycleViewFragment extends Fragment {
    private RecyclerView listadoMascotas;
    ArrayList<Mascota> lstmascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recycleview,container,false);
        // Creamos el RecyclerView
        listadoMascotas = (RecyclerView) v.findViewById( R.id.rvMascota );
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listadoMascotas.setLayoutManager( llm );

        inicializarDatos();
        inicializarAdaptador();
        return v;

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
        AdapterMascota adaptador = new AdapterMascota(lstmascotas,getActivity());
        listadoMascotas.setAdapter(adaptador);
    }
}
