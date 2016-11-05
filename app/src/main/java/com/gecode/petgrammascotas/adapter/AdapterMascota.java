package com.gecode.petgrammascotas.adapter;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.gecode.petgrammascotas.R;
import com.gecode.petgrammascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by gregorybr on 28-10-16.
 */

public class AdapterMascota extends RecyclerView.Adapter<AdapterMascota.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

    public AdapterMascota( ArrayList<Mascota> mascotas, Activity activity ) {

        this.activity = activity;
        this.mascotas = mascotas;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.cardview_mascotas, parent, false );
        return new MascotaViewHolder( v );
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder holder, int position) {
        final Mascota mascota = mascotas.get( position );
        holder.tvNombreMascota.setText( mascota.getNombreMascota() );
        holder.imgFoto.setImageResource( mascota.getFoto() );
        holder.tvRaiting.setText( mascota.getRaiting() );

        holder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mascota.setRaiting(String.valueOf(Integer.parseInt(mascota.getRaiting()) + 1));
                notifyDataSetChanged();
                Snackbar.make(v,"Diste like a " + mascota.getNombreMascota(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNombreMascota;
        private ImageView imgFoto;
        private TextView tvRaiting;
        private ImageButton btnLike;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            tvNombreMascota = (TextView) itemView.findViewById( R.id.tvNombreMascotaCV );
            imgFoto = (ImageView) itemView.findViewById( R.id.imgFotoMascota );
            tvRaiting = (TextView) itemView.findViewById( R.id.tvRaitingCV );
            btnLike = (ImageButton) itemView.findViewById(R.id.btnLike);

        }

    }
}
