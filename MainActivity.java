package com.dictator.soft.safelytea;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dictator.soft.safelytea.customer.AddCustomerActivity;
import com.dictator.soft.safelytea.customer.DetailsCustomerActivity;
import com.dictator.soft.safelytea.customer.RetailCustomerAddActivity;
import com.dictator.soft.safelytea.customer.RetailsCustomerActivity;
import com.dictator.soft.safelytea.sales.RetailSalesActivity;
import com.dictator.soft.safelytea.sales.WholeSalesActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_income) {
            AlertDialog.Builder alertBuilder=new AlertDialog.Builder(MainActivity.this);
            View mView=getLayoutInflater().inflate(R.layout.activity_income,null);

        Button addIncome= (Button) mView.findViewById(R.id.incomeAdd);
        Button cancelCustomer= (Button) mView.findViewById(R.id.incomeCancel);

           addIncome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                }
           });

            cancelCustomer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                }
            });


            alertBuilder.setView(mView);
            AlertDialog alertDialog=alertBuilder.create();

            alertDialog.show();
        }
        else if (id==R.id.action_expense){
            AlertDialog.Builder alBuilder=new AlertDialog.Builder(MainActivity.this);
            View mView=getLayoutInflater().inflate(R.layout.activity_expense,null);
            Button addExpense= (Button) mView.findViewById(R.id.expenseAdd);
            Button cancelExpense= (Button) mView.findViewById(R.id.expenseCancel);

            addExpense.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Expense",Toast.LENGTH_SHORT).show();
                }
            });
            cancelExpense.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Cancel",Toast.LENGTH_SHORT).show();
                }
            });
            alBuilder.setView(mView);
            AlertDialog dialog=alBuilder.create();
            dialog.show();
        }
        else if (id==R.id.action_department){
            AlertDialog.Builder alDep=new AlertDialog.Builder(MainActivity.this);
            View mView=getLayoutInflater().inflate(R.layout.activity_department,null);

            Button addDep= (Button) mView.findViewById(R.id.departmentAdd);
            Button cancelDep= (Button) mView.findViewById(R.id.departmentCancel);

            addDep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Department",Toast.LENGTH_SHORT).show();
                }
            });

            alDep.setView(mView);
            AlertDialog dialog=alDep.create();
            dialog.show();
        }
        else if (id==R.id.action_designation){
            AlertDialog.Builder alDes=new AlertDialog.Builder(MainActivity.this);
            View mView=getLayoutInflater().inflate(R.layout.activity_designation,null);

            Button addDes= (Button) mView.findViewById(R.id.designationAdd);
            Button cancelDes= (Button) mView.findViewById(R.id.designationCancel);

            addDes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Department",Toast.LENGTH_SHORT).show();
                }
            });

            alDes.setView(mView);
            AlertDialog dialog=alDes.create();
            dialog.show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        }
        else if (id == R.id.nav_login) {

        }
        else if (id == R.id.nav_developer) {

        }
        else if (id == R.id.nav_logout) {

        }
        else if (id == R.id.nav_whole_customerAdd) {
            startActivity(new Intent(MainActivity.this, AddCustomerActivity.class));
        }
        else if (id == R.id.nav_whole_customerDetails) {
            startActivity(new Intent(MainActivity.this, DetailsCustomerActivity.class));
        }
        else if (id == R.id.nav_retail_customerAdd) {
            startActivity(new Intent(MainActivity.this, RetailCustomerAddActivity.class));
        }

        else if (id == R.id.nav_retail_customerDetails) {
            startActivity(new Intent(MainActivity.this, RetailsCustomerActivity.class));
        }

        else if (id == R.id.nav_whole_sales) {
            startActivity(new Intent(MainActivity.this, WholeSalesActivity.class));
        }
        else if (id == R.id.nav_retail_sales) {
            startActivity(new Intent(MainActivity.this, RetailSalesActivity.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
