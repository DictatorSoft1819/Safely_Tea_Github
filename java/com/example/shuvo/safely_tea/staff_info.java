package com.example.shuvo.safely_tea;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class staff_info extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_info);
        EditText staff_name=(EditText) findViewById(R.id.t_amount);
        EditText staff_dept=(EditText) findViewById(R.id.department);
        EditText staff_designation=(EditText) findViewById(R.id.designation);
        EditText contact_no1=(EditText) findViewById(R.id.contact_no1);
        EditText contact_no2=(EditText) findViewById(R.id.contact_no2);
        EditText staff_address=(EditText) findViewById(R.id.address);
        EditText staff_join_date=(EditText) findViewById(R.id.join_date);
        Button submit=(Button) findViewById(R.id.submit);


    }
}
