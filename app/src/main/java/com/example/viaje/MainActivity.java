package com.example.viaje;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroupDestino, radioGroupTransporte;
    RadioButton radioButtonDestino, radioButtonTransporte;
    Button buttonInformacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroupDestino = findViewById(R.id.radioGroupDestino);
        radioGroupTransporte = findViewById(R.id.radioGroupTransporte);
        buttonInformacion = findViewById(R.id.buttonInformacion);

        buttonInformacion.setOnClickListener(v -> {
            int destinoSeleccionado = radioGroupDestino.getCheckedRadioButtonId();
            radioButtonDestino = findViewById(destinoSeleccionado);

            int trasnporteSeleccionado = radioGroupTransporte.getCheckedRadioButtonId();
            radioButtonTransporte = findViewById(trasnporteSeleccionado);

            String mensaje = "Me voy a " + radioButtonDestino.getText() + " en " + radioButtonTransporte.getText();
            Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_LONG).show();
        });
    }
}