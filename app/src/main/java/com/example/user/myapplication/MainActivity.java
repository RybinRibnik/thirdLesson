package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Created", Toast.LENGTH_SHORT). show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Application started", Toast.LENGTH_SHORT). show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(Toast.makeText(this, "Application paused", Toast.LENGTH_SHORT). show();)
    }

    @Override
    protected void onStop() {
        super.onStop(Toast.makeText(this, "Application stopped", Toast.LENGTH_SHORT). show(););
    }
    onPause
}
