package com.example.shuvo.safely_tea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class salary_template extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salary_template);
        EditText staff_name=(EditText) findViewById(R.id.t_amount);
        EditText total_salary=(EditText) findViewById(R.id.total_salary);
        Button submit=(Button) findViewById(R.id.submit);
    }
}