package com.example.anew.colg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Studhome extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studhome);
    }
    public void registerh(View v)
    {
       Intent is1=new Intent(this,Studreg.class);
        startActivity(is1);
    }
    public void Searchh(View v)
    {
        Intent is2=new Intent(this,Studsearch.class);
        startActivity(is2);
    }
    public void reportsh(View v)
    {
        Intent is3=new Intent(this,Studrep.class);
        startActivity(is3);
    }
    public void eligh(View v)
    {
        Intent is4=new Intent(this,Studelig.class);
        startActivity(is4);
    }
    public void backh(View v)
    {
     Intent is5=new Intent(this,MainActivity.class);
     startActivity(is5);
    }
}
