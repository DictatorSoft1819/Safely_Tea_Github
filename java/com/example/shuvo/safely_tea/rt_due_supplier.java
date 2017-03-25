package com.example.shuvo.safely_tea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Shuvo on 3/23/2017.
 */

public class rt_due_supplier extends AppCompatActivity {
    EditText supp_id,supp_name,t_amount,due;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rt_due_supplier);
        supp_id=(EditText) findViewById(R.id.supplier_id);
        supp_name=(EditText)findViewById(R.id.supp_name);
        t_amount=(EditText)findViewById(R.id.t_amount);
        due=(EditText)findViewById(R.id.due);
        submit=(Button)findViewById(R.id.submit);
    }
}