package com.example.sendval;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalleeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Inflation
        setContentView(R.layout.activitiy_callee);

        Intent intent = getIntent();
        int dataNumber = intent.getIntExtra("data-number", -1);
        String dataString = intent.getStringExtra("data-string");

        String data = "data number:" + dataNumber + "data string:" + dataString;

        View view = findViewById(R.id.tv_data);
        ((TextView) view).setText(data);
    }
}
