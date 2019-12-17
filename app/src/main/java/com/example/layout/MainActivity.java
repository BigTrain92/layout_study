package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtn1Clicked(View view){
        Toast.makeText(this, "btn1 clicked", Toast.LENGTH_LONG).show();
    }

    public void onBtn2Clicked(View view){
        Toast.makeText(this, "btn2 clicked", Toast.LENGTH_LONG).show();
    }

    public void onBtn3Clicked(View view){
        Toast.makeText(this, "btn3 clicked", Toast.LENGTH_LONG).show();
    }
}
