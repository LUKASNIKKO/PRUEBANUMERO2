package com.stto.pruebanumero2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner sp1;
    Button BTN1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1=(Spinner) findViewById(R.id.spinner);
        BTN1=(Button) findViewById(R.id.button);

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Seleccionado=sp1.getSelectedItem().toString();
                Integer Lat,Longi;
                Lat=0;
                Longi=0;
                Intent I=new Intent(getApplicationContext(),MainActivity2.class);
                I.putExtra("LUGAR",Seleccionado);
                I.putExtra("LATITUD",Lat);
                I.putExtra("LONGITUD",Longi);
                startActivity(I);
            }
        });
    }
}