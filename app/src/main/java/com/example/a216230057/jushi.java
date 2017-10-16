package com.example.a216230057;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class jushi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jushi);
    }
    public void button4(View v){
        Intent i = new Intent(this,Developer.class);
        this.startActivity(i);
    }

    public void button3(View v){
        Intent i = new Intent(this,Hong.class);
        this.startActivity(i);
    }
}
