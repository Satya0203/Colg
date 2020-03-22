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

public class Studreg extends AppCompatActivity
{
    SQLiteDatabase sqlb;
    ContentValues cv;
    EditText et1,et2,et3,et4,et5,et6,et7,et8;
    Intent i;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studreg);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        et6 = findViewById(R.id.et6);
        et7 = findViewById(R.id.et7);
        et8 = findViewById(R.id.et8);
        sqlb=openOrCreateDatabase("satya",Context.MODE_PRIVATE,null);
        sqlb.execSQL("create table if not exists stud(name varchar(20),rollno varchar(10),colgname varchar(40),dob varchar(12),year number(6),branch varchar(10),uname varchar(20),pword varchar(15))");
        }
    public void regS(View v)
    {
        cv=new ContentValues();
        cv.put("name",et1.getText().toString());
        cv.put("rollno",et2.getText().toString());
        cv.put("colgname",et3.getText().toString());
        cv.put("dob",et4.getText().toString());
        cv.put("year",Integer.parseInt(et5.getText().toString()));
        cv.put("branch",et6.getText().toString());
        cv.put("uname",et7.getText().toString());
        cv.put("pword",et8.getText().toString());
        long status=sqlb.insert("stud",null,cv);
        int status1=(int)(long)status;
        if(status1==-1)
        {
            Toast.makeText(this,"failed to insert ",Toast.LENGTH_LONG).show();
        }
        else
            {
                Intent po = new Intent(this, Studhome.class);
                Toast.makeText(this, "registered succesfully", Toast.LENGTH_SHORT).show();
                startActivity(po);
            }
    }
    public void resetS(View v)
    {
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
        et5.setText("");
        et6.setText("");
        et7.setText("");
        et8.setText("");
    }
}
