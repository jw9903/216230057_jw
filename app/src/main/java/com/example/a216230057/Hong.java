package com.example.a216230057;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hong);
    }

    public void imagebutton(View v){
        Intent i = new Intent(this,oso.class);
        this.startActivity(i);
    }

    public void imagebutton2(View v){
        Intent i = new Intent(this,kara.class);
        this.startActivity(i);
    }

    public void imagebutton3(View v){
        Intent i = new Intent(this,choro.class);
        this.startActivity(i);
    }

    public void imagebutton4(View v){
        Intent i = new Intent(this,ichi.class);
        this.startActivity(i);
    }

    public void imagebutton5(View v){
        Intent i = new Intent(this,jushi.class);
        this.startActivity(i);
    }

    public void imagebutton6(View v){
        Intent i = new Intent(this,todo.class);
        this.startActivity(i);
    }

    public void button(View v){
        Intent i = new Intent(this,Developer.class);
        this.startActivity(i);
    }


}
