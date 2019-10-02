package com.hazem.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText et;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.ButtonEnvoyer);
        et =findViewById(R.id.EditTextNom);
        tv = findViewById(R.id.TextViewBonjour);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("bonjour "+et.getText()+"!");
            }
        });
    }
}
