package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fact extends AppCompatActivity {
    EditText ed1;
    Button b1;
    TextView t1;
    int r=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);
        ed1 = (EditText) findViewById(R.id.ed1);
        b1 = (Button) findViewById(R.id.b1);
        t1 = (TextView) findViewById(R.id.t1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                try {
                    int in= Integer.parseInt(s);
                    for (int i=1;i<=in;i++) {
                        r=r*i;
                    }
                    t1.setText("The factorial of "+s+" is "+r);
                }catch (NumberFormatException e){}
            }
        });
    }
}
