package com.nitish.smartlock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void authorizedPersons(View v){
        Intent i=new Intent(this,AuthorizedActivity.class);
        startActivity(i);
    }

    public void lockAccessData(View v){
        Intent i=new Intent(this,AccessDataActivity.class);
        startActivity(i);
    }
}
