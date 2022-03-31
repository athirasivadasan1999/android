package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bd,bm,bdiv,beq,bac,bdot;
    EditText ed;
    String s="";
    double a,b,c;
    String opn;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.t1);
        ed=(EditText)findViewById(R.id.ed1);
        b0=(Button) findViewById(R.id.b0);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        bp=(Button) findViewById(R.id.bp);
        bd=(Button) findViewById(R.id.bd);
        bm=(Button) findViewById(R.id.bm);
        bdiv=(Button) findViewById(R.id.bdiv);
        bdot=(Button) findViewById(R.id.bdot);
        beq=(Button) findViewById(R.id.beq);
        bac=(Button) findViewById(R.id.bac);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+".");
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+" + ");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+" - ");
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+" * ");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                ed.setText(s+" / ");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText("");
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=ed.getText().toString();
                String[] arr=s.split(" ");
                opn=arr[1];
                int r=0;
                    switch (opn) {

                        case "+":
                            try {
                                r = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                                String r1=String.valueOf(r);
                                Intent intent = new Intent(MainActivity.this,Second.class);
                                intent.putExtra("key",r1);
                                startActivity(intent);
                            }catch (NumberFormatException e){}
                            break;
                        case "-":
                            try{
                            r = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                                }catch (NumberFormatException e){}
                            break;
                        case "*":
                            try {
                                r = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                            }catch (NumberFormatException e){}
                            break;
                        case "/":
                            try {
                                r = Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]);
                            }catch (NumberFormatException e){}
                            break;
                        default:
                            break;
                    }

                //
                // t1.setText(String.valueOf(r));
            }
        });
    }
}
