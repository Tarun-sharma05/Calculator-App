package com.example.mycalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
   EditText etFirstValue, etSecondValue;
   Button add, subtract, multiply, division;
   TextView tvAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        division = findViewById(R.id.btnDivision);

        //ADDITION OPERATION
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int fistValue, secondValue, ans;

                    fistValue = Integer.parseInt(etFirstValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());

                    ans = fistValue + secondValue;

                    tvAns.setText("Ans:" + ans);
                } catch (NumberFormatException e) {
                    Log.e("MainActivity", "NumberFormatException: " + e.getMessage());
                }
            }

        });

//        //SUBTRACTION OPERARION
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    try {
                int fistValue, secondValue, ans;

                fistValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = fistValue - secondValue;

                tvAns.setText("Ans:" + ans);
            } catch (NumberFormatException e) {
                        Log.e("MainActivity", "NumberFormatException: " + e.getMessage());
                    }

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  try {


                      int fistValue, secondValue, ans;

                      fistValue = Integer.parseInt(etFirstValue.getText().toString());
                      secondValue = Integer.parseInt(etSecondValue.getText().toString());

                      ans = fistValue * secondValue;

                      tvAns.setText("Ans:" + ans);
                  } catch (NumberFormatException e) {
                      Log.e("MainActivity", "NumberFormatException: " + e.getMessage());
                  }
            }
        });

        //DIVISION OPERATION
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             try {

                 int fistValue, secondValue, ans;

                 fistValue = Integer.parseInt(etFirstValue.getText().toString());
                 secondValue = Integer.parseInt(etSecondValue.getText().toString());

                 if(secondValue != 0) {
                     ans = fistValue / secondValue;
                     tvAns.setText("Ans:" + ans);
                 }else {
                     tvAns.setText("Error: Division by zero");
                 }
             }
             catch (NumberFormatException e) {
                 Log.e("MainActivity", "NumberFormatException: " + e.getMessage());
             }

            }
        });

    }
}