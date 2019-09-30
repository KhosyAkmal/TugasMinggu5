package com.example.tugasminggu5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class daftar_hasil extends AppCompatActivity {




    private TextView textNama;
    private TextView textHarga;
    private TextView textItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_hasil);
        textNama = findViewById(R.id.nama_text);
        textHarga = findViewById(R.id.harga_text);
        textItems = findViewById(R.id.items_text);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // TODO: display value here
            String Nama = extras.getString(daftar.NAMA_KEY);
            int Harga = extras.getInt(daftar.HARGA_KEY);
            int Items = extras.getInt(daftar.ITEMS_KEY);

            textNama.setText(Nama);
            textHarga.setText(String.valueOf(Harga));
            textItems.setText(String.valueOf(Items));

        }


    }
}
