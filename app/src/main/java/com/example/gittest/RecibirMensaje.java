package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class RecibirMensaje extends AppCompatActivity {
    public static final String RECIBIR = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_mensaje);
        Log.d("RecibirMensaje", "Hello World");
        Intent intent = getIntent();
        String mensajeTexto = intent.getStringExtra(RECIBIR);
        TextView mensajeVista = (TextView) findViewById(R.id.mensajeVista);
        mensajeVista.setText(mensajeTexto);
    }
}
