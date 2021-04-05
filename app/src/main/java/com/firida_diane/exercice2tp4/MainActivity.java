package com.firida_diane.exercice2tp4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button carte;
    private Button paypal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carte = findViewById(R.id.carte);
        paypal = findViewById(R.id.paypal);
        carte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentCarte fragmentCarte = FragmentCarte.newInstance("Titre");
                fragmentCarte.show(fm, "fragmentcarte");
            }
        });
        paypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentPaypal fragmentPaypal = FragmentPaypal.newInstance("Titre");
                fragmentPaypal.show(fm, "fragmentpaypal");
            }
        });

    }


}