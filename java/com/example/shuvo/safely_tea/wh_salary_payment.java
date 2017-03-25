package com.example.shuvo.safely_tea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class wh_salary_payment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wh_salary_payment);
        EditText name=(EditText) findViewById(R.id.t_amount);
        EditText date=(EditText) findViewById(R.id.date);
        EditText month=(EditText) findViewById(R.id.salary_month);
        EditText year=(EditText) findViewById(R.id.salary_year);
        EditText total=(EditText) findViewById(R.id.total);
        EditText bonus=(EditText) findViewById(R.id.bonus);
        EditText deduction=(EditText) findViewById(R.id.deduction);
        EditText sub_total=(EditText) findViewById(R.id.sub_total);
        EditText payment=(EditText) findViewById(R.id.payment);
        EditText pre_due=(EditText) findViewById(R.id.pre_due);
        EditText status=(EditText) findViewById(R.id.status);
        Button submit=(Button) findViewById(R.id.submit);
    }
}