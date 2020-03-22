package com.example.anew.colg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button b1,b2;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
    }
    public void student(View v)
    {
        Intent m1=new Intent(this,Studlo.class);
        startActivity(m1);
    }
    public void faculty(View v)
    {
        Intent m2=new Intent(this,Faculo.class);
        startActivity(m2);

    }

}
