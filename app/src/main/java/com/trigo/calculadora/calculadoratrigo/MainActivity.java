package com.trigo.calculadora.calculadoratrigo;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v4.math.MathUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private RadioGroup grupo;
    private RadioGroup grupo2;
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupo = (RadioGroup) findViewById(R.id.RGrados);
        grupo2=(RadioGroup) findViewById(R.id.RFunciones);



    }

    public void comprobarGrados(View view) {
        if (grupo.getCheckedRadioButtonId() == R.id.n) {
            imageView = (ImageView) findViewById(R.id.imageView2);
            imageView.setImageResource(R.drawable.a43514);
            float grado = 90;
            comprobarFuncion(view,grado);
        }
        if (grupo.getCheckedRadioButtonId() == R.id.cc) {
            imageView = (ImageView) findViewById(R.id.imageView2);
            imageView.setImageResource(R.drawable.a43609);
            float grado = 45;
            comprobarFuncion(view,grado);
        }
        if (grupo.getCheckedRadioButtonId() == R.id.co) {
            imageView = (ImageView) findViewById(R.id.imageView2);
            imageView.setImageResource(R.drawable.a43303);
            float grado = 180;
            comprobarFuncion(view,grado);

        }

    }

    public void comprobarFuncion(View view,float grado) {
        double resultado;
        if(grupo2.getCheckedRadioButtonId()==R.id.sin){
            System.out.println(grado);
            resultado = Math.sin(Math.toRadians(grado));
            textView=(TextView) findViewById(R.id.Resultado);
            if(resultado < 0.00000001)
                resultado = 0;
            textView.setText("Resultado: "+ resultado);
        }
        if(grupo2.getCheckedRadioButtonId()==R.id.cos){
            resultado = Math.cos(Math.toRadians(grado));
            textView=(TextView) findViewById(R.id.Resultado);
            if(resultado < 0.00000001 && resultado != -1)
                resultado = 0;
            textView.setText("Resultado: "+resultado);
        }
        if(grupo2.getCheckedRadioButtonId()==R.id.tan){
            resultado = Math.tan(Math.toRadians(grado));
            textView=(TextView) findViewById(R.id.Resultado);
            if(resultado < 0.00000001)
                resultado = 0;
            if(resultado > 1) {
                textView.setText("Resultado: ERROR");
                return;
            }
            textView.setText("Resultado: "+Math.round(resultado));
        }
    }




}
