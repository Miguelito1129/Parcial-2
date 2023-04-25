package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity
{

    private EditText editTextA;
    private EditText editTextB;

    String Login,password;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = this.findViewById(R.id.Login);
        editTextB = this.findViewById(R.id.Contraseña);
        Login= (editTextA.getText().toString());
        password= (editTextB.getText().toString());
    }

    public void Mapa(View view)
    {
        if(Login== "Miguel")
        {
            if(password=="David")
            {
                Intent Mapa = new Intent(this, MainActivity2.class);
                startActivity(Mapa);
            }
        }

    }
}