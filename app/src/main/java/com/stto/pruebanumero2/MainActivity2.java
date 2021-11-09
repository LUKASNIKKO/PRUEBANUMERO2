package com.stto.pruebanumero2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String lugarcito;
    TextView GG;
    ImageButton im1,im2,im3;
    String latitud,longitud;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        im1= (ImageButton) findViewById(R.id.fotobuca);
        im2= (ImageButton) findViewById(R.id.fotosanta);
        im3= (ImageButton) findViewById(R.id.fotoLolol);
        GG=(TextView)findViewById(R.id.indicado);
        Bundle B = getIntent().getExtras();
        lugarcito=B.getString("LUGAR");
        latitud=B.getString("LATITUD");
        longitud=B.getString("LONGITUD");

        btn2=(Button)findViewById(R.id.button2);
        GG.setText("Selecciono  "+lugarcito);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(I);
            }
        });
        if (GG.equals("Lolol"))
        {
            latitud="-34.7683900";
            longitud="-71.6484200";
        }
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aa= new Intent(getApplicationContext(),MapsActivity.class);
               aa.putExtra("LUGAR",lugarcito);
                 aa.putExtra("LATITUD",latitud);
               aa.putExtra("LONGITUD",longitud);
                startActivity(aa);


            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aa= new Intent(getApplicationContext(),MapsActivity2.class);
                aa.putExtra("LUGAR",lugarcito);
                startActivity(aa);


            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aa= new Intent(getApplicationContext(),MapsActivity3.class);
                aa.putExtra("LUGAR",lugarcito);
                startActivity(aa);


            }
        });


    }
}