package com.example.paulac.moneytracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button add = (Button)findViewById(R.id.button2);
    }
    public void onKlik(View v){
        Intent i = new Intent(this, Add_Transaction.class);
        startActivity(i);
    }
}
