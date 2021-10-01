package com.example.app3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String NAME="Activity1";
    private TextView LABEL;
    private TextView email;
    private TextView password;
    private TextView phone;
    private TextView address;
   //private Button male;
    //private Button female;
    private Button register;

    @Override    //on create method of first activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        password=findViewById(R.id.editTextTextPassword);
        phone=findViewById(R.id.Phone);
        address=findViewById(R.id.ADDRESS);
        //female=findViewById(R.id.female);
        //female.setOnClickListener(this);
        register=findViewById(R.id.button);
        register.setOnClickListener(this);
        Log.d(NAME,"Activity1 is created");
    }
    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.button)
        {
            LABEL.setText("Registered!");
        }
    }
    @Override
    public void Activity2()
    {
        Intent intent= new Intent(packageContext:this,Activity2.class);
        intent.putExtra("Key","Proceed");
        startActivity(intent);
    }
    @Override   //on start method of first activity
    protected void onStart()
    {
        super.onStart();
        Log.d(NAME,"Activity1 starts");
    }
    @Override   //on resume method of first activity
    protected void onResume()
    {
        super.onResume();
        Log.d(NAME,"Running Activity1");
    }

    @Override   //on pause method of first activity
    protected void onPause()
    {
        super.onPause();
        Log.d(NAME,"Switch to Activity2 if applicable");
    }
    @Override   //on stop method of first activity
    protected void onStop()
    {
        super.onStop();
        Log.d(NAME,"Stop running Activity1");
    }
    @Override   //on destroy method of first activity
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(NAME,"Activity1 is finished");
    }


}
