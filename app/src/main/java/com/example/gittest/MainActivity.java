package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Documentación inicial de onCreate la wea mala mala t
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //solucion
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickboton_incrementar(View view) {
        TextView numero = (TextView) findViewById(R.id.numero);
        TextView aviso = (TextView) findViewById(R.id.aviso);
        Spinner saludo = (Spinner) findViewById(R.id.lista);
        String numero_enString = String.valueOf(numero.getText());
        int numero_enInteger = Integer.parseInt(numero_enString);
        String saludo_enString = String.valueOf(saludo.getSelectedItem());

        if(saludo_enString.equals("hola")){
            if (numero_enInteger < 9) {
                numero_enInteger++;
                aviso.setText("");
            }else {
                aviso.setText("");
                numero_enInteger = 0;
            }

        } else{
            aviso.setText("has seleccionado: " + String.valueOf(saludo.getSelectedItem()) + "\n" +  "debes seleccionado -hola- wei!");
        }
        Log.d("Incrementa",saludo_enString);   // esto es lo mismo que un system.out pero bien hecho con tag para saber de que se trata
    //  System.out.println(saludo_enString);
        numero.setText(String.valueOf(numero_enInteger));

    }

    public void onClickboton_Enviar(View view) {
        Intent intent = new Intent(this, RecibirMensaje.class);
        EditText mensaje = (EditText) findViewById(R.id.mensaje);
        String mensajeTexto = mensaje.getText().toString();
        intent.putExtra(RecibirMensaje.RECIBIR, mensajeTexto);
        startActivity(intent);

    }
}
