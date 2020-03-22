package com.example.anew.colg;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Facureg extends AppCompatActivity
{
    SQLiteDatabase sqfl;
    ContentValues cvf;
    EditText fre1,fre2,fre3,fre4,fre5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facureg);
        fre1=findViewById(R.id.fre1);
        fre2=findViewById(R.id.fre2);
        fre3=findViewById(R.id.fre3);
        fre4=findViewById(R.id.fre4);
        fre5=findViewById(R.id.fre5);
        sqfl=openOrCreateDatabase("satya", Context.MODE_PRIVATE,null);
        sqfl.execSQL("create table if not exists fac(name varchar(20),dept varchar(12),subject varchar(15),fid varchar(10),exper varchar(10))");
    }

    public void fregs1(View view)
    {
        cvf=new ContentValues();
        cvf.put("name",fre1.getText().toString());
        cvf.put("dept",fre2.getText().toString());
        cvf.put("subject",fre3.getText().toString());
        cvf.put("fid",fre4.getText().toString());
        cvf.put("exper",fre5.getText().toString());
        long statusfc=sqfl.insert("fac",null,cvf);
        int statusfc1=(int)(long)statusfc;
        if(statusfc==-1)
        {
            Toast.makeText(this,"registreation failed",Toast.LENGTH_LONG).show();
        }
        else {
            Intent ty = new Intent(this, Facuhome.class);
            Toast.makeText(this, "registered succesfully", Toast.LENGTH_LONG).show();
            startActivity(ty);
        }
    }

    public void restfre1(View view)
    {
        fre1.setText("");
        fre2.setText("");
        fre3.setText("");
        fre4.setText("");
        fre5.setText("");
    }

    public void backfah4(View view)
    {
        Intent oi=new Intent(this,Facuhome.class);
        startActivity(oi);
    }
}

