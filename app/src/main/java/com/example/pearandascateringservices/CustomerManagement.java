package com.example.pearandascateringservices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CustomerManagement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_management);

        Button button = (Button) findViewById(R.id.currentClients);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("BUTTONS", "User tapped the Supabutton");
            }
        });
    }
}