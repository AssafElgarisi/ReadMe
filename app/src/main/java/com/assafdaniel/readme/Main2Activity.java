package com.assafdaniel.readme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void goTolevel1(View view){

        Intent intent = new Intent(this, Level1Activity.class);
        startActivity(intent);
    }
}
