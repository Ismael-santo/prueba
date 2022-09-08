package com.example.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Notificacion extends AppCompatActivity {
    private EditText etnoti;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacion);

        etnoti = (EditText) findViewById(R.id.etnoti);
        num = (int) (Math.random() * 100001);
        String cadena = String.valueOf(num);
        Toast notificacion = Toast.makeText(this, cadena, Toast.LENGTH_LONG);
        notificacion.show();
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

    public void controlar(View v) {
        String valorIngresado = etnoti.getText().toString();
        int valor = Integer.parseInt(valorIngresado);
        if (valor==num) {
            Toast notificacion = Toast.makeText(this, "Muy bien recordastes el numero", Toast.LENGTH_LONG);
            notificacion.show();
        }
        else {
            Toast notificacion = Toast.makeText(this, "Lo siento pero no es el numero correcto", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}