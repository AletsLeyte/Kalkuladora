package com.machinegun.vaio.kalkuladora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    boolean decimal=false;
    boolean pareniz=false;
    boolean parender=false;
    boolean restar=false;
    boolean suma=false;
    boolean divide=false;
    boolean multiplica=false;
    boolean p=false;
    boolean ra=false;
    boolean co=false;
    boolean si=false;
    boolean ta=false;
    boolean lo=false;
    boolean expo=false;
    boolean porce=false;

    Double[] numeros=new Double[20];
    Double resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cero= (Button) findViewById(R.id.num0);
        cero.setOnClickListener(this);
        Button uno= (Button) findViewById(R.id.num1);
        uno.setOnClickListener(this);
        Button dos= (Button) findViewById(R.id.num2);
        dos.setOnClickListener(this);
        Button tres= (Button) findViewById(R.id.num3);
        tres.setOnClickListener(this);
        Button cuatro= (Button) findViewById(R.id.num4);
        cuatro.setOnClickListener(this);
        Button cinco= (Button) findViewById(R.id.num5);
        cinco.setOnClickListener(this);
        Button seis= (Button) findViewById(R.id.num6);
        seis.setOnClickListener(this);
        Button siete= (Button) findViewById(R.id.num7);
        siete.setOnClickListener(this);
        Button ocho= (Button) findViewById(R.id.num8);
        ocho.setOnClickListener(this);
        Button nueve= (Button) findViewById(R.id.num9);
        nueve.setOnClickListener(this);

        Button punt= (Button) findViewById(R.id.punto);
        punt.setOnClickListener(this);
        Button p= (Button) findViewById(R.id.pi);
        p.setOnClickListener(this);
        Button igua= (Button) findViewById(R.id.igual);
        igua.setOnClickListener(this);

        Button men= (Button) findViewById(R.id.menos);
        men.setOnClickListener(this);
        Button sum= (Button) findViewById(R.id.mas);
        sum.setOnClickListener(this);
        Button div= (Button) findViewById(R.id.division);
        div.setOnClickListener(this);
        Button mult= (Button) findViewById(R.id.multiplicacion);
        mult.setOnClickListener(this);

        Button der= (Button) findViewById(R.id.parender);
        der.setOnClickListener(this);
        Button izq= (Button) findViewById(R.id.pareniz);
        izq.setOnClickListener(this);
        Button rai= (Button) findViewById(R.id.raiz);
        rai.setOnClickListener(this);

        Button tan= (Button) findViewById(R.id.tangente);
        tan.setOnClickListener(this);
        Button cos= (Button) findViewById(R.id.coseno);
        cos.setOnClickListener(this);
        Button sin= (Button) findViewById(R.id.seno);
        sin.setOnClickListener(this);
        Button log= (Button) findViewById(R.id.logaritmo);
        log.setOnClickListener(this);
        Button exp= (Button) findViewById(R.id.exponente);
        exp.setOnClickListener(this);
        Button po= (Button) findViewById(R.id.porcentaje);
        po.setOnClickListener(this);

        Button del= (Button) findViewById(R.id.delete);
        del.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        TextView pantalla= (TextView)findViewById(R.id.resultado);
        int seleccion= v.getId();
        String a=pantalla.getText().toString();
        try{
            switch(seleccion){
                case R.id.num0:
                    pantalla.setText(a+"0");
                    break;
                case R.id.num1:
                    pantalla.setText(a+"1");
                    break;
                case R.id.num2:
                    pantalla.setText(a+"2");
                    break;
                case R.id.num3:
                    pantalla.setText(a+"3");
                    break;
                case R.id.num4:
                    pantalla.setText(a+"4");
                    break;
                case R.id.num5:
                    pantalla.setText(a+"5");
                    break;
                case R.id.num6:
                    pantalla.setText(a+"6");
                    break;
                case R.id.num7:
                    pantalla.setText(a+"7");
                    break;
                case R.id.num8:
                    pantalla.setText(a+"8");
                    break;
                case R.id.num9:
                    pantalla.setText(a+"9");
                    break;

                case R.id.punto:
                    if(decimal==false){
                        pantalla.setText(a+".");
                        decimal=true;
                    }else {return;}
                    break;
                case R.id.parender:
                    if(decimal==false){
                        pantalla.setText(a+")");
                        parender=true;
                    }else {return;}
                    break;
                case R.id.pareniz:
                    if(decimal==false){
                        pantalla.setText(a+"(");
                        pareniz=true;
                    }else {return;}
                    break;
                case R.id.menos:
                    restar=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.mas:
                    suma=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.division:
                    divide=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.multiplicacion:
                    multiplica=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.exponente:
                    expo=true;
                    numeros[0]=Double.parseDouble(a);
                    numeros[1]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.pow(numeros[0],numeros[1]); //Sacar exponenciación de un numero
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.raiz:
                    ra=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sqrt(numeros[0]); //Sacar raiz cuadrada de un numero
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.tangente:
                    ta=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.tan(numeros[0]*Math.PI/180); //Sacar tangente de un numero
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.coseno:
                    co=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.cos(numeros[0]*Math.PI/180); //Sacar coseno de un numero
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.seno:
                    si=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sin(numeros[0]*Math.PI/180); //Sacar seno de un numero
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.logaritmo:
                    lo=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.log(numeros[0]); //Sacar logaritmo de un numero
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.pi:
                    p=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.PI*numeros[0]; //Multiplicar Pi a un numero
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.porcentaje:
                    porce=true;
                    numeros[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=numeros[0]*100/numeros[1]; //Sacar tangente de un numero
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;
                case R.id.igual:
                    numeros[1]=Double.parseDouble(a);
                    if(restar==true){
                        resultado= (numeros[0])-(numeros[1]);
                        pantalla.setText(String.valueOf(resultado));
                    }else if(suma==true){
                        resultado= numeros[0]+numeros[1];
                        pantalla.setText(String.valueOf(resultado));

                    }else if(divide==true){
                        resultado= numeros[0]/numeros[1];
                        pantalla.setText(String.valueOf(resultado));

                    }else if(multiplica==true){
                        resultado= numeros[0]*numeros[1];
                        pantalla.setText(String.valueOf(resultado));

                    }
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    restar=false;
                    suma=false;
                    divide=false;
                    multiplica=false;
                    lo=false;
                    p=false;
                    si=false;
                    co=false;
                    ta=false;
                    ra=false;
                    expo=false;
                    break;
                case R.id.delete:
                    pantalla.setText("");
                    decimal=false;
                    parender=false;
                    pareniz=false;
                    break;

            }
        }catch (Exception e){
            pantalla.setText("ERROR");
        }

    }
}
