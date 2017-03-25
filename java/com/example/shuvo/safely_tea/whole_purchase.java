package com.example.shuvo.safely_tea;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class whole_purchase extends AppCompatActivity {
    private static String[] Unit = { "Select Unit", "Kg", "Metric Ton" };
    EditText name,lot_number,garder_name,purchase_price,selling_price,quantity,total_amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whole_purchase);

        AutoCompleteTextView supplier_id=(AutoCompleteTextView)findViewById(R.id.supplier_id);
        name=(EditText)findViewById(R.id.name);
        lot_number=(EditText)findViewById(R.id.lot_number);
        garder_name=(EditText)findViewById(R.id.garden_name);
        purchase_price=(EditText)findViewById(R.id.purchase_price);
        selling_price=(EditText)findViewById(R.id.selling_price);
        quantity=(EditText)findViewById(R.id.quantity);
        total_amount=(EditText)findViewById(R.id.t_amount );
        RatingBar ratingBar=(RatingBar) findViewById(R.id.ratingBar2);
        Spinner spinner=(Spinner)findViewById(R.id.unit);
        Button submit =(Button)findViewById(R.id.submit);
        ArrayAdapter<String> adapter;
        adapter=new ArrayAdapter<String>(whole_purchase.this,android.R.layout.simple_spinner_item,Unit);
        spinner.setAdapter(adapter);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                float rate=ratingBar.getRating();
                Toast.makeText(getApplicationContext(), ""+rate, Toast.LENGTH_SHORT).show();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert=new AlertDialog.Builder(whole_purchase.this);
                alert.setItems(new String[]{"Purchase Paymeent?"},new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(
                            DialogInterface arg0,
                            int position){
                        switch (position){
                            case 0:
                                final Dialog dialog = new Dialog(
                                        whole_purchase.this);
                                dialog.setContentView(R.layout.wh_purchase_payment);
                                dialog.setTitle("Purchase Paymeent");
                                dialog.show();
                                Toast.makeText(getApplicationContext(),""+name.getText(),Toast.LENGTH_SHORT).show();
                                break;
                        }

                    }
                });
                alert.show();
            }
        });
    }
}