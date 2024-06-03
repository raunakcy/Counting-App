package com.example.countingapp;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText edtName;
    TextView txtTitle,txtCount;
    Button btnCount;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitle = findViewById(R.id.txtTitle);
        txtCount = findViewById(R.id.txtCount);
        btnCount = findViewById(R.id.btnCount);


        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txtCount.setText(""+countIndex());

            }
        });


    }
    public int countIndex(){

        return ++count;
    }
}