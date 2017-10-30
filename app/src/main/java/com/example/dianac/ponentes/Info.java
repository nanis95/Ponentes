package com.example.dianac.ponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    public TextView titulo;
    public TextView lugar;
    public TextView fecha;
    public ImageView imagen;
    public TextView universidad;
    public TextView hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        titulo = (TextView) findViewById(R.id.id_titulo);
        lugar = (TextView) findViewById(R.id.id_lugar);
        fecha = (TextView) findViewById(R.id.id_fec);
        imagen = (ImageView) findViewById(R.id.id_img);
        universidad = (TextView) findViewById(R.id.id_u);
        hora = (TextView) findViewById(R.id.id_h);

        Bundle b = getIntent().getExtras();
        String t = b.getString("titulo");
        titulo.setText(t);

        String l = b.getString("lugar");
        String aud = l.split("-")[0];
        String uni = l.split("-")[1];
        lugar.setText(aud);
        universidad.setText(uni);

        String f = b.getString("fecha");
        String fec = f.split("-")[0];
        String h = f.split("-")[1];
        fecha.setText(fec);
        hora.setText(h);


        String g = b.getString("grupo");

        switch (g){
            case "1":
                imagen.setImageResource(R.drawable.i1);
                break;
            case "2":
                imagen.setImageResource(R.drawable.i2);
                break;
            case "3":
                imagen.setImageResource(R.drawable.i3);
                break;
            case "4":
                imagen.setImageResource(R.drawable.i4);
                break;
            case "5":
                imagen.setImageResource(R.drawable.i5);
                break;
            case "6":
                imagen.setImageResource(R.drawable.i6);
                break;
            case "7":
                imagen.setImageResource(R.drawable.i7);
                break;
            case "8":
                imagen.setImageResource(R.drawable.i8);
                break;
            default:
                break;
        }
    }
}
