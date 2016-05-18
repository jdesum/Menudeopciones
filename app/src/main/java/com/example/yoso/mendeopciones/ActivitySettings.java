package com.example.yoso.mendeopciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivitySettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_settings);

        // Navegación regreso
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }
}
