package com.example.tugasminggu5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class daftar extends AppCompatActivity {


    public static final String NAMA_KEY = "nama";
    public static final String HARGA_KEY = "harga";
    public static final String ITEMS_KEY = "items";

    private EditText inputNama;
    private EditText inputHarga;
    private EditText inputItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        inputNama = findViewById(R.id.input_nama);
        inputHarga = findViewById(R.id.input_harga);
        inputItems = findViewById(R.id.input_items);
    }

    public void handleHasil(View view) {
        String nama = inputNama.getText().toString();
        int harga = Integer.parseInt(inputHarga.getText().toString());
        int items = Integer.parseInt(inputItems.getText().toString());

        Intent intent = new Intent(this, daftar_hasil.class);
        intent.putExtra(NAMA_KEY, nama);
        intent.putExtra(HARGA_KEY, harga);
        intent.putExtra(ITEMS_KEY, items);

        startActivity(intent);
    }
}
