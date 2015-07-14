package com.random.malay.monthlyexpensetracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAddExpense(View view){
        Intent intent = new Intent(this,AddExpense.class);
        startActivity(intent);
    }

    public void goToViewExpense(View view){
        Intent intent= new Intent(this,DataListActivity.class);
        startActivity(intent);
    }

}
