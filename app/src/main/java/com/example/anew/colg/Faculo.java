package com.example.anew.colg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Faculo extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculo);
    }
    public void loginfc(View v)
    {
        Intent f1=new Intent(this,Facuhome.class);
        startActivity(f1);
    }
    public void registerfc(View v)
    {
        Intent f2=new Intent(this,Facureg.class);
        startActivity(f2);
    }
    public void backfc(View v)
    {
        Intent f3=new Intent(this,MainActivity.class);
        startActivity(f3);}
}
