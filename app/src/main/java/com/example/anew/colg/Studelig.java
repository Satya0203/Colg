package com.example.anew.colg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Studelig extends AppCompatActivity
{
    ListView lv1;
    EditText et1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studelig);
        et1=findViewById(R.id.et1);
        lv1=findViewById(R.id.lv1);
    }
    public void elig(View v)
    {
        Toast.makeText(this,"eligible are given below",Toast.LENGTH_LONG).show();

    }
    public void backto(View v)
    {
        Intent ik=new Intent(this,Studhome.class);
        startActivity(ik);
    }
}
