package com.example.learn_welcomescreem;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences=getSharedPreferences("test", MODE_PRIVATE);
        Boolean isFirst=preferences.getBoolean("isFirst", true);

        if (isFirst)
            startActivity(new Intent(MainActivity.this, Welcome.class));

    }
}
