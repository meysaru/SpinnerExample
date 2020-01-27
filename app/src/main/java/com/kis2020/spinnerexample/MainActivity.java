package com.kis2020.spinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        List<String> categories = new ArrayList<>();
        categories.add(0,"Kategori Seçiniz");
        categories.add("Çanta");
        categories.add("Kalem");
        categories.add("Silgi");
        categories.add("Defter");
        categories.add("Çanta");
        categories.add("Kalem");
        categories.add("Silgi");
        categories.add("Defter");
        categories.add("Kitap");
        categories.add("Kalemlik");



        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
    }
}
