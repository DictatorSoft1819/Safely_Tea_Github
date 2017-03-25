package com.example.shuvo.safely_tea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Shuvo on 3/23/2017.
 */

public class advanced extends AppCompatActivity {
    EditText name,amount,dedicnation_month,dedictation_year;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advanced);
        name=(EditText) findViewById(R.id.name);
        amount=(EditText)findViewById(R.id.t_amount);
        dedicnation_month=(EditText)findViewById(R.id.deduction_month);
        dedictation_year=(EditText)findViewById(R.id.deduction_year);
        submit=(Button)findViewById(R.id.submit);
    }
        }
