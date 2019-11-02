package com.example.utspmopro.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.utspmopro.LanguageActivity;
import com.example.utspmopro.ProfilActivity;
import com.example.utspmopro.R;

public class MainActivity extends AppCompatActivity {
    Button tdata,ldata,edata,hdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tdata = (Button) findViewById(R.id.tdata);
        ldata = (Button) findViewById(R.id.ldata);
        hdata = (Button) findViewById(R.id.hdata);
        edata = (Button) findViewById(R.id.edata);
        tdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(MainActivity.this,TambahDataActivity.class);
                startActivity(i);
            }
        });
        edata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new
                        Intent(MainActivity.this,EditDataActivity.class);
                startActivity(i);
            }
        });
        ldata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new
                        Intent(MainActivity.this,LihatDataActivity.class);
                startActivity(i);
            }
        });
        hdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new
                        Intent(MainActivity.this,HapusDataActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.profil){
            startActivity(new Intent(this, ProfilActivity.class));
        } else if (item.getItemId() == R.id.language) {
            startActivity(new Intent(this, LanguageActivity.class));
        }

        return true;
    }
}

