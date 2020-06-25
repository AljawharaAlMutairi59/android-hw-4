package com.example.aljawharascalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText q = findViewById(R.id.quizes);
        final EditText h = findViewById(R.id.Homework);
        final EditText m = findViewById(R.id.MidTerms);
        final EditText f = findViewById(R.id.Final);
        final Button cal = findViewById(R.id.Calculate);
        final Button res = findViewById(R.id.restart);
        final TextView text = findViewById(R.id.textViewx);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


             double quiz1 = Double.parseDouble(q.getText().toString());
             double homework1 = Double.parseDouble(h.getText().toString());
             double midterms1 = Double.parseDouble(m.getText().toString());
             double final1 = Double.parseDouble(f.getText().toString());

             double grades = (quiz1+homework1+midterms1+final1);
                if (grades>90){
                    text.setText ("A");
                }
                else if (grades<=90 && grades >=80) {
                    text.setText ("B");
                }
                else if (grades<80 && grades >=70){
                    text.setText ("C")
                     ;
                }
                else if (grades<70 && grades >=60){
                    text.setText ("D");
                }
                else {
                    text.setText ("F");
            }
            };

        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h.setText("");
                h.dispatchDisplayHint(View.VISIBLE);

                f.setText("");
                f.dispatchDisplayHint(View.VISIBLE);

                q.setText("");
                q.dispatchDisplayHint(View.VISIBLE);

                m.setText("");
                m.dispatchDisplayHint(View.VISIBLE);

                text.setText("");
            }
        });










    }
}