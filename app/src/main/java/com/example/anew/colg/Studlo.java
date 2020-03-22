package com.example.anew.colg;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Studlo extends AppCompatActivity
{
    SQLiteDatabase sqlp;
    Cursor cst,cc;
    EditText es1,es2;
    String us,pw,et1,et2,quer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studlo);
        es1=findViewById(R.id.es1);
        es2=findViewById(R.id.es2);
        sqlp=openOrCreateDatabase("satya", Context.MODE_PRIVATE,null);

        //Toast.makeText(this,es1.getText().toString(),Toast.LENGTH_LONG).show();

        et1=es1.getText().toString();
        et2=es2.getText().toString();
        cst=sqlp.rawQuery("SELECT uname,pword FROM stud WHERE uname=? AND pword=?",new String[]{es1.getText().toString(),es2.getText().toString()});
        while(cst.moveToNext())
        {
             us = cst.getString(cst.getColumnIndex("uname"));
            pw = cst.getString(cst.getColumnIndex("pword"));

        }


    }


    public void abc(View v)
    {
        Toast.makeText(this,es1.getText().toString(),Toast.LENGTH_LONG).show();
        Toast.makeText(this,us,Toast.LENGTH_LONG).show();


        if(us.equals("gopal")&&pw.equals("gopal"))
        {
            Toast.makeText(this,"succesfully logged "+es1.getText().toString()+"user",Toast.LENGTH_LONG).show();
            Intent ia2=new Intent(this,Studhome.class);
            startActivity(ia2);
        }
        else
            {
                Toast.makeText(this,"Invalid user",Toast.LENGTH_LONG).show();
                Toast.makeText(this,"if not registered ,get REGISTERED",Toast.LENGTH_LONG).show();
            }

    }
    public void registers(View v)
    {
        Intent i=new Intent(this,Studhome.class);
        startActivity(i);

    }
    public void backs(View v)
    {
        Intent ia1=new Intent(this,MainActivity.class);
        startActivity(ia1);
        }
}
