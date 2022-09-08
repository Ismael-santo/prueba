package com.example.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Problema2 extends AppCompatActivity {
    private EditText nom;
    private EditText nom2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problema2);

        nom = (EditText) findViewById(R.id.nom);
        nom2 = (EditText) findViewById(R.id.nom2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void grabar(View v) {
        String nombre = nom.getText().toString();
        String datos = nom2.getText().toString();
        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString(nombre, datos);
        editor.commit();
        Toast.makeText(this, "Datos Grabados", Toast.LENGTH_SHORT).show();
    }

    public void recuperar(View v) {
        String nombre = nom.getText().toString();
        SharedPreferences prefe = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String d = prefe.getString(nombre, "");
        if (d.length() == 0) {
            Toast.makeText(this, "No existe dicho nombre en la agenda", Toast.LENGTH_SHORT).show();
        } else {
            nom2.setText(d);
        }
    }
}