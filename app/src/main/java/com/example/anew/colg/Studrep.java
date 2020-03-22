package com.example.anew.colg;

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

public class Studrep extends AppCompatActivity
{
    SQLiteDatabase sq;
    ListView lv1;
    Cursor c;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studrep);
        lv1=findViewById(R.id.lv1);
        ArrayList<String> abc=new ArrayList<String>();
        sq=openOrCreateDatabase("satya", Context.MODE_PRIVATE,null);
         c=sq.query("stud",null,null,null,null,null,null);
        while(c.moveToNext())
        {
            String sa1=c.getString(0);
            String sa2=c.getString(1);
            String sa3=c.getString(2);
            String sa4=c.getString(3);
            Integer sa5=c.getInt(4);
            String sa6=c.getString(5);
            String sa7=c.getString(6);
            String sa8=c.getString(7);

            abc.add(sa1+"/"+sa2+"/"+sa3+"/("+sa4+")/"+sa5+"/"+sa6+"/"+sa7+"/"+sa8);
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,abc);
        lv1.setAdapter(arrayAdapter);
    }

    public void back(View view)
    {
        Intent il2=new Intent(this,Studhome.class);
        startActivity(il2);
    }
}
