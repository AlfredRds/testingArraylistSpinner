package com.jarlab.testingarraylistspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner sp ;
    private SpinAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = (Spinner) findViewById(R.id.spinner);

        ArrayList<pruebaModel> al = new ArrayList<pruebaModel>();

        al.add(new pruebaModel(1,"marte"));
        al.add(new pruebaModel(2,"urano"));
        al.add(new pruebaModel(3,"venus"));
        al.add(new pruebaModel(4,"mercurio"));
        al.add(new pruebaModel(5,"sol"));
        al.add(new pruebaModel(6,"luna"));

        adapter= new SpinAdapter(getApplicationContext(), android.R.layout.simple_spinner_item,al);
        sp.setAdapter(adapter);
    }
}
