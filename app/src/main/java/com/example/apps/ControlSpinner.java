package com.example.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ControlSpinner extends AppCompatActivity {
    private EditText numS1;
    private EditText numS2;
    private TextView resuSp;
    private Spinner spin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_spinner);

        numS1=(EditText) findViewById(R.id.numS1);
        numS2=(EditText) findViewById(R.id.numS2);
        resuSp=(TextView) findViewById(R.id.resuSp);

        spin2 = (Spinner) findViewById(R.id.spin2);
        String [] opciones ={"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        spin2.setAdapter(adapter);

    }

    //Este metodo se ejecutara cuando se presione el boton
    public void operar(View view){
        String valor1=numS1.getText().toString();
        String valor2=numS2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        String selec=spin2.getSelectedItem().toString();
        if (selec.equals("sumar")) {
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            resuSp.setText(resu);
        } else
            if (selec.equals("restar")) {
                int resta=nro1-nro2;
                String resu=String.valueOf(resta);
                resuSp.setText(resu);
            }
            else
                if (selec.equals("multiplicar")) {
                    int multi=nro1*nro2;
                    String resu=String.valueOf(multi);
                    resuSp.setText(resu);
                }
                else
                    if (selec.equals("dividir")) {
                        int divi=nro1/nro2;
                        String resu=String.valueOf(divi);
                        resuSp.setText(resu);
                    }
    }
}