package com.example.appholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goD20 (View view) {
        Intent intent = new Intent(this, D20.class);
        startActivity(intent);
    }

    public void goYvL(View view) {
        Intent intent = new Intent(this, YvL.class);
        startActivity(intent);
    }
}
