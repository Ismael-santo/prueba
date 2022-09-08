package com.example.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv3 = findViewById(R.id.tv3);
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

        if (id == R.id.action_op2){
            //Acciones de la opcion2
            Toast.makeText(this, "Has hecho clik a Opcion2", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent ( this, Radio_group.class);
            startActivity(intent);

        }

        if (id == R.id.action_op3){
            //Acciones de la opcion3
            Toast.makeText(this, "Has hecho clik a Opcion3", Toast.LENGTH_SHORT).show();
            Intent chekboox = new Intent ( this, chekboox.class);
            startActivity(chekboox);

        }

        if (id == R.id.action_op4){
            //Acciones de la opcion4
            Toast.makeText(this, "Has hecho clik a Opcion4", Toast.LENGTH_SHORT).show();
            Intent chekboox = new Intent ( this, ControlSpinner.class);
            startActivity(chekboox);

        }


        if (id == R.id.action_op5){
            //Acciones de la opcion5
            Toast.makeText(this, "Has hecho clik a Opcion5", Toast.LENGTH_SHORT).show();
            Intent listview = new Intent ( this, ControlListView.class);
            startActivity(listview);

        }

        if (id == R.id.action_op6){
            //Acciones de la opcion6
            Toast.makeText(this, "Has hecho clik a Opcion6", Toast.LENGTH_SHORT).show();
            Intent imagen = new Intent ( this, ImagenButt.class);
            startActivity(imagen);

        }

        if (id == R.id.action_op7){
            //Acciones de la opcion7
            Toast.makeText(this, "Has hecho clik a Opcion7", Toast.LENGTH_SHORT).show();
            Intent toast = new Intent ( this, Notificacion.class);
            startActivity(toast);

        }

        if (id == R.id.action_op8){
            //Acciones de la opcion8
            Toast.makeText(this, "Has hecho clik a Opcion8", Toast.LENGTH_SHORT).show();
            Intent EdiT = new Intent ( this, EdiText.class);
            startActivity(EdiT);

        }

        if (id == R.id.action_op9){
            //Acciones de la opcion9
            Toast.makeText(this, "Has hecho clik a Opcion9", Toast.LENGTH_SHORT).show();
            Intent doble = new Intent ( this, dobleactivity.class);
            startActivity(doble);

        }

        if (id == R.id.action_op10){
            //Acciones de la opcion10
            Toast.makeText(this, "Has hecho clik a Opcion10", Toast.LENGTH_SHORT).show();
            Intent problema = new Intent ( this, problem.class);
            startActivity(problema);

        }
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_op11){
            //Acciones de la opcion11
            Toast.makeText(this, "Has hecho clik a Opcion11", Toast.LENGTH_SHORT).show();
            Intent problema = new Intent ( this, PasarParametrosActivity.class);
            startActivity(problema);

        }
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_op12){
            //Acciones de la opcion12
            Toast.makeText(this, "Has hecho clik a Opcion12", Toast.LENGTH_SHORT).show();
            Intent problema = new Intent ( this, Email.class);
            startActivity(problema);

        }
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_op13){
            //Acciones de la opcion13
            Toast.makeText(this, "Has hecho clik a Opcion13", Toast.LENGTH_SHORT).show();
            Intent problema = new Intent ( this, Problema2.class);
            startActivity(problema);

        }
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    //Este metodo se ejecutara cuando se presione el boton
    public  void sumar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        int suma=nro1+nro2;
        String resu=String.valueOf(suma);
        tv3.setText(resu);
    }
}
