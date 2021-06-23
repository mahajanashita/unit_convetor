package com.example.unitconvertor;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView3;
    private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        textView3=findViewById(R.id.textView3);
        editText=findViewById(R.id.editText);
    }
    public void calculate(View view){
        String s=editText.getText().toString();
        int kg =Integer.parseInt(s);
        double pound = 2.205* kg;
        textView3.setText("The corresponding value in pound is " +pound);

    }
}