package com.example.shuvo.safely_tea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Shuvo on 3/23/2017.
 */

public class wh_income extends AppCompatActivity {
    EditText type,title,ref_no,details,amount;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wh_income);
        type=(EditText) findViewById(R.id.type);
        title=(EditText)findViewById(R.id.title);
        ref_no=(EditText)findViewById(R.id.ref_no);
        details=(EditText)findViewById(R.id.details);
        amount=(EditText)findViewById(R.id.amount);
        submit=(Button)findViewById(R.id.submit);
    }
}