package com.johnduran.p4calculadoraderesistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bBanda1, bBanda2, bBanda3, bBanda4, bNegro,bCafe,bRojo,bNaranja,bAmarillo,bVerde,bAzul,bPurpura,
            bGris,bBlanco,bDorado,bPlateado;
    private TextView tBanda,tResistencia, tTolerancia;
    private LinearLayout lBotones1,lBotones2;
    private String colorBanda,banda="0";
    private double valorB1=1, valorB2=5, valorB3=2, valorB4=5, resistencia=1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tBanda= (TextView) findViewById(R.id.tBanda);
        bBanda1= (Button) findViewById(R.id.bBanda1);
        bBanda2= (Button) findViewById(R.id.bBanda2);
        bBanda3= (Button) findViewById(R.id.bBanda3);
        bBanda4= (Button) findViewById(R.id.bBanda4);
        bNegro= (Button) findViewById(R.id.bNegro);
        bCafe= (Button) findViewById(R.id.bCafe);
        bRojo= (Button) findViewById(R.id.bRojo);
        bNaranja= (Button) findViewById(R.id.bNaranja);
        bAmarillo= (Button) findViewById(R.id.bAmarillo);
        bVerde= (Button) findViewById(R.id.bVerde);
        bAzul= (Button) findViewById(R.id.bAzul);
        bPurpura= (Button) findViewById(R.id.bPurpura);
        bGris= (Button) findViewById(R.id.bGris);
        bBlanco= (Button) findViewById(R.id.bBlanco);
        bDorado= (Button) findViewById(R.id.bDorado);
        bPlateado= (Button) findViewById(R.id.bPlateado);
        tResistencia= (TextView) findViewById(R.id.tResistencia);
        tTolerancia= (TextView) findViewById(R.id.tTolerancia);
        lBotones1= (LinearLayout) findViewById(R.id.lBotones1);
        lBotones2= (LinearLayout) findViewById(R.id.lBotones2);
        fColorsOFFdefault();
    }
    public void fColorsOFFdefault(){
        lBotones1.setVisibility(View.GONE);
        lBotones2.setVisibility(View.GONE);
        bPlateado.setVisibility(View.GONE);
        bDorado.setVisibility(View.GONE);
        bNegro.setVisibility(View.GONE);
        bCafe.setVisibility(View.GONE);
        bRojo.setVisibility(View.GONE);
        bNaranja.setVisibility(View.GONE);
        bAmarillo.setVisibility(View.GONE);
        bVerde.setVisibility(View.GONE);
        bAzul.setVisibility(View.GONE);
        bPurpura.setVisibility(View.GONE);
        bGris.setVisibility(View.GONE);
        bBlanco.setVisibility(View.GONE);
    }
    public void fBanda1(View view){
        lBotones1.setVisibility(View.VISIBLE);
        lBotones2.setVisibility(View.VISIBLE);
        bNegro.setVisibility(View.GONE);
        bPlateado.setVisibility(View.GONE);
        bDorado.setVisibility(View.GONE);
        bCafe.setVisibility(View.VISIBLE);
        bRojo.setVisibility(View.VISIBLE);
        bNaranja.setVisibility(View.VISIBLE);
        bAmarillo.setVisibility(View.VISIBLE);
        bVerde.setVisibility(View.VISIBLE);
        bAzul.setVisibility(View.VISIBLE);
        bPurpura.setVisibility(View.VISIBLE);
        bGris.setVisibility(View.VISIBLE);
        bBlanco.setVisibility(View.VISIBLE);
        banda="1";
        tBanda.setText("Seleccione color de Banda 1");
    }
    public void fBanda2(View view){
        lBotones1.setVisibility(View.VISIBLE);
        lBotones2.setVisibility(View.VISIBLE);
        bPlateado.setVisibility(View.GONE);
        bDorado.setVisibility(View.GONE);
        bNegro.setVisibility(View.VISIBLE);
        bCafe.setVisibility(View.VISIBLE);
        bRojo.setVisibility(View.VISIBLE);
        bNaranja.setVisibility(View.VISIBLE);
        bAmarillo.setVisibility(View.VISIBLE);
        bVerde.setVisibility(View.VISIBLE);
        bAzul.setVisibility(View.VISIBLE);
        bPurpura.setVisibility(View.VISIBLE);
        bGris.setVisibility(View.VISIBLE);
        bBlanco.setVisibility(View.VISIBLE);
        banda="2";
        tBanda.setText("Seleccione color de Banda 2");

    }
    public void fBanda3(View view){
        lBotones1.setVisibility(View.VISIBLE);
        lBotones2.setVisibility(View.VISIBLE);
        bPlateado.setVisibility(View.GONE);
        bDorado.setVisibility(View.GONE);
        bNegro.setVisibility(View.VISIBLE);
        bCafe.setVisibility(View.VISIBLE);
        bRojo.setVisibility(View.VISIBLE);
        bNaranja.setVisibility(View.VISIBLE);
        bAmarillo.setVisibility(View.VISIBLE);
        bVerde.setVisibility(View.VISIBLE);
        bAzul.setVisibility(View.VISIBLE);
        bPurpura.setVisibility(View.VISIBLE);
        bGris.setVisibility(View.VISIBLE);
        bBlanco.setVisibility(View.GONE);
        banda="3";
        tBanda.setText("Seleccione color de Banda 3");

    }
    public void fBanda4(View view){
        lBotones1.setVisibility(View.VISIBLE);
        lBotones2.setVisibility(View.VISIBLE);
        bPlateado.setVisibility(View.VISIBLE);
        bDorado.setVisibility(View.VISIBLE);
        bNegro.setVisibility(View.GONE);
        bCafe.setVisibility(View.VISIBLE);
        bRojo.setVisibility(View.VISIBLE);
        bNaranja.setVisibility(View.GONE);
        bAmarillo.setVisibility(View.GONE);
        bVerde.setVisibility(View.GONE);
        bAzul.setVisibility(View.GONE);
        bPurpura.setVisibility(View.GONE);
        bGris.setVisibility(View.GONE);
        bBlanco.setVisibility(View.GONE);
        banda="4";
        tBanda.setText("Seleccione color de Banda 4");

    }

    public void fNegro(View view){ colorBanda="negro"; setColorBanda();}
    public void fCafe(View view){ colorBanda="cafe"; setColorBanda();}
    public void fRojo(View view){ colorBanda="rojo";setColorBanda();}
    public void fNaranja(View view){ colorBanda="naranja";setColorBanda();}
    public void fAmarillo(View view){ colorBanda="amarillo";setColorBanda();}
    public void fVerde(View view){ colorBanda="verde";setColorBanda();}
    public void fAzul(View view){ colorBanda="azul";setColorBanda();}
    public void fPurpura(View view){ colorBanda="purpura";setColorBanda();}
    public void fGris(View view){ colorBanda="gris";setColorBanda();}
    public void fBlanco(View view){ colorBanda="blanco";setColorBanda();}
    public void fPlateado(View view){ colorBanda="plateado";setColorBanda();}
    public void fDorado(View view){ colorBanda="dorado";setColorBanda();}

    public void setColorBanda(){
        if (banda=="1"){
            switch (colorBanda){
                case "cafe":
                    bBanda1.setBackgroundColor(getResources().getColor(R.color.brown));
                    valorB1=1;
                    break;
                case "rojo":
                    bBanda1.setBackgroundColor(getResources().getColor(R.color.red));
                    valorB1=2;
                    break;
                case "naranja":
                    bBanda1.setBackgroundColor(getResources().getColor(R.color.orange));
                    valorB1=3;
                    break;
                case "amarillo":
                    bBanda1.setBackgroundColor(getResources().getColor(R.color.yellow));
                    valorB1=4;
                    break;
                case "verde":
                    bBanda1.setBackgroundColor(getResources().getColor(R.color.lime));
                    valorB1=5;
                    break;
                case "azul":
                    bBanda1.setBackgroundColor(getResources().getColor(R.color.blue));
                    valorB1=6;
                    break;
                case "purpura":
                    bBanda1.setBackgroundColor(getResources().getColor(R.color.mediumorchid));
                    valorB1=7;
                    break;
                case "gris":
                    bBanda1.setBackgroundColor(getResources().getColor(R.color.gray));
                    valorB1=8;
                    break;
                case "blanco":
                    bBanda1.setBackgroundColor(getResources().getColor(R.color.white));
                    valorB1=9;
                     break;
            }
            fcalculo();

        }
        if (banda=="2"){
            switch (colorBanda){
                case "negro":
                    bBanda2.setBackgroundColor(getResources().getColor(R.color.black));
                    valorB2=0;
                    break;
                case "cafe":
                    bBanda2.setBackgroundColor(getResources().getColor(R.color.brown));
                    valorB2=1;
                    break;
                case "rojo":
                    bBanda2.setBackgroundColor(getResources().getColor(R.color.red));
                    valorB2=2;
                    break;
                case "naranja":
                    bBanda2.setBackgroundColor(getResources().getColor(R.color.orange));
                    valorB2=3;
                    break;
                case "amarillo":
                    bBanda2.setBackgroundColor(getResources().getColor(R.color.yellow));
                    valorB2=4;
                    break;
                case "verde":
                    bBanda2.setBackgroundColor(getResources().getColor(R.color.lime));
                    valorB2=5;
                    break;
                case "azul":
                    bBanda2.setBackgroundColor(getResources().getColor(R.color.blue));
                    valorB2=6;
                    break;
                case "purpura":
                    bBanda2.setBackgroundColor(getResources().getColor(R.color.mediumorchid));
                    valorB2=7;
                    break;
                case "gris":
                    bBanda2.setBackgroundColor(getResources().getColor(R.color.gray));
                    valorB2=8;
                    break;
                case "blanco":
                    bBanda2.setBackgroundColor(getResources().getColor(R.color.white));
                    valorB2=9;
                    break;
            }
            fcalculo();
        }

        if (banda=="3"){
            switch (colorBanda){
                case "negro":
                    bBanda3.setBackgroundColor(getResources().getColor(R.color.black));
                    valorB3=0;
                    break;
                case "cafe":
                    bBanda3.setBackgroundColor(getResources().getColor(R.color.brown));
                    valorB3=1;
                    break;
                case "rojo":
                    bBanda3.setBackgroundColor(getResources().getColor(R.color.red));
                    valorB3=2;
                    break;
                case "naranja":
                    bBanda3.setBackgroundColor(getResources().getColor(R.color.orange));
                    valorB3=3;
                    break;
                case "amarillo":
                    bBanda3.setBackgroundColor(getResources().getColor(R.color.yellow));
                    valorB3=4;
                    break;
                case "verde":
                    bBanda3.setBackgroundColor(getResources().getColor(R.color.lime));
                    valorB3=5;
                    break;
                case "azul":
                    bBanda3.setBackgroundColor(getResources().getColor(R.color.blue));
                    valorB3=6;
                    break;
                case "purpura":
                    bBanda3.setBackgroundColor(getResources().getColor(R.color.mediumorchid));
                    valorB3=7;
                    break;
                case "gris":
                    bBanda3.setBackgroundColor(getResources().getColor(R.color.gray));
                    valorB3=8;
                    break;
            }
            fcalculo();
        }
        if (banda=="4"){
            switch (colorBanda){
                case "cafe":
                    bBanda4.setBackgroundColor(getResources().getColor(R.color.brown));
                    valorB4=1;
                    break;
                case "rojo":
                    bBanda4.setBackgroundColor(getResources().getColor(R.color.red));
                    valorB4=2;
                    break;
                case "dorado":
                    bBanda4.setBackgroundColor(getResources().getColor(R.color.goldenrod));
                    valorB4=5;
                    break;
                case "plateado":
                    bBanda4.setBackgroundColor(getResources().getColor(R.color.silver));
                    valorB4=10;
                    break;
            }
        }
        fcalculo();
    }
    public void fcalculo(){
        resistencia=(valorB1*10+valorB2)*(int)Math.pow(10,valorB3);
        tTolerancia.setText(""+resistencia);

        if (resistencia<1000){
            String res= String.valueOf(resistencia);
            tResistencia.setText(res+"  Ω");
            tTolerancia.setText("±"+valorB4+" %");
        }else{
            if (resistencia<1000000){
                resistencia=resistencia/1000;
                String res= String.valueOf(resistencia);
                tResistencia.setText(res+"  K Ω");
                tTolerancia.setText("±"+valorB4+" %");
            }else{
                if (resistencia>=1000000){
                    resistencia=resistencia/1000000;
                    String res= String.valueOf(resistencia);
                    tResistencia.setText(res+"  M Ω");
                    Character.toString((char)241);
                    tTolerancia.setText("±"+valorB4+" %");
                }

            }
        }

    }
}
