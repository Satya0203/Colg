package com.example.anew.colg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Facusear extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facusear);
    }

    public void serfser(View view)
    {
        Toast.makeText(this,"results",Toast.LENGTH_LONG).show();
    }

    public void bk(View view)
    {
        Intent op=new Intent(this,Facuhome.class);
        startActivity(op);
    }
}
