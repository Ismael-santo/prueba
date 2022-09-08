package com.example.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Radio_group extends AppCompatActivity implements View.OnClickListener{
    private EditText etv1,etv2;
    private TextView resul;
    private RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        etv1=(EditText) findViewById(R.id.etv1);
        etv2=(EditText) findViewById(R.id.etv2);
        resul=(TextView) findViewById(R.id.resul);
        r1=(RadioButton) findViewById(R.id.r1);
        r2=(RadioButton) findViewById(R.id.r2);
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

    //Este metodo se ejecutara cuando se presione el botton
    public void Operar(View view){
        String valor1=etv1.getText().toString();
        String valor2=etv2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        if (r1.isChecked()==true){
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            resul.setText(resu);
        } else
            if (r2.isChecked()==true){
                int resta=nro1-nro2;
                String resu=String.valueOf(resta);
                resul.setText(resu);
            }
    }

    @Override
    public void onClick(View view) {

    }
}