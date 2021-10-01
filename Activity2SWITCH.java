package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String incoming_msg=getIntent().getStringExtra("Key");
        getIntent().getIntExtra("A",0);

        TextView second_screen_label=findViewById(R.id.toolbar);

        second_screen_label.setText(incoming_msg);
    }
}
