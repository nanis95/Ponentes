package com.example.dianac.ponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.dianac.ponentes.models.Ponentes;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    public String linea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Ponentes> lista = new ArrayList<Ponentes>();

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);

        // Usar un administrador para LinearLayout
        recycler.setLayoutManager(new LinearLayoutManager(this));

        InputStream is = this.getResources().openRawResource(R.raw.datos);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        if (is != null){
            try {
                while ((linea=reader.readLine()) != null){
                    lista.add(new Ponentes(linea.split(";")[0], linea.split(";")[1], linea.split(";")[2], linea.split(";")[3]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //lista.add(new Ponentes("Titulo", "Angel Beats", " ", " ", " "," "));
        // Crear un nuevo adaptador
        adapter = new PonenteAdapter(lista);
        recycler.setAdapter(adapter);

    }
}