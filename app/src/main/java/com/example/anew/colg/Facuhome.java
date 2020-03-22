package com.example.anew.colg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Facuhome extends AppCompatActivity
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facuhome);
    }
    public void reportsfhm(View v)
    {
        Intent ifh2=new Intent(this,Facurep.class);
        startActivity(ifh2);
    }
    public void searchfhm(View v)
    {
        Intent ifh3=new Intent(this,Facusear.class);
        startActivity(ifh3);
    }
    public void backfhm(View v)
    {
        Intent ifh4=new Intent(this,MainActivity.class);
        startActivity(ifh4);

    }
}
