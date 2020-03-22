package com.example.anew.colg;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Facurep extends AppCompatActivity
{
    SQLiteDatabase sqsrep;
    Cursor cf;
    ContentValues cv;
    ListView las1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facurep);
        las1=findViewById(R.id.las1);
        ArrayList<String> strf=new ArrayList<String>();
        sqsrep=openOrCreateDatabase("satya", Context.MODE_PRIVATE,null);
       cf=sqsrep.query("fac",null,null,null,null,null,null);
        while(cf.moveToNext())
        {
            String fa1=cf.getString(0);
            String fa2=cf.getString(1);
            String fa3=cf.getString(2);
            String fa4=cf.getString(3);
            String fa5=cf.getString(4);
            strf.add(fa1+"/"+fa2+"/"+fa3+"/"+fa4+"/"+fa5);
        }
        ArrayAdapter<String> fard=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,strf);
        las1.setAdapter(fard);
    }

    public void bckok(View view)
    {
        Intent ciu=new Intent(this,Facuhome.class);
        startActivity(ciu);
    }
}
