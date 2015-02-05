package com.example.it00046.bodina;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

import com.example.it00046.bodina.Classes.Globals;


public class Celebracions extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.celebracions);
        // Si estem executant i no hem trobat dades (no existia la BBD) obrim la finestra de
        // configuració perque l'usuari determini Pais, idioma (abans hem aplicat el del
        // telefon) i resta de informació personal
        if (Globals.g_NoHiHanDades == false){
            intent = new Intent(this, Configuracio.class);
            startActivity(intent);
        }
        else{
            //Haurem de carregar la llista de entitats i celebracions del client;
        }
        // Definim contexte a nivel global
        Globals.g_Native = this.getApplicationContext();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_celebracions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.celebracions_Afegir:
                intent = new Intent(this, EntitatAlta.class);
                startActivity(intent);
                return true;
            case R.id.celebracions_Configuracio:
                intent = new Intent(this, Configuracio.class);
                startActivity(intent);
                return true;
            case R.id.celebracions_Actualitzar:
                //
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
