package com.example.anew.colg;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Studsearch extends AppCompatActivity
{
    EditText et;
    Cursor cde;
    String qu;
    String str;
    SQLiteDatabase sqldb;
    ListView lvse1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studsearch);
        lvse1=findViewById(R.id.lvse1);
        et=findViewById(R.id.eser1);
        str=et.getText().toString();
    }

    public void searchst(View view)
    {
        ArrayList<String> abcde=new ArrayList<String>();
        sqldb=openOrCreateDatabase("stud", Context.MODE_PRIVATE,null);
        cde=sqldb.rawQuery("select * from stud where rollno=?",new String[]{str});
        if(cde.getCount()>0)
        {
            String sa1=cde.getString(0);
            String sa2=cde.getString(1);
            String sa3=cde.getString(2);
            String sa4=cde.getString(3);
            Integer sa5=cde.getInt(4);
            String sa6=cde.getString(5);
            String sa7=cde.getString(6);
            String sa8=cde.getString(7);

            abcde.add(sa1+"/"+sa2+"/"+sa3+"/("+sa4+")/"+sa5+"/"+sa6+"/"+sa7+"/"+sa8);
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,abcde);
        lvse1.setAdapter(arrayAdapter);

        Toast.makeText(this,"student found",Toast.LENGTH_LONG).show();
    }
}
