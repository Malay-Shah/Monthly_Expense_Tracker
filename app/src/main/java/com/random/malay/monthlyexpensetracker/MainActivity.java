package com.random.malay.monthlyexpensetracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bAddExpense = (Button) findViewById(R.id.bAddExpenseActivity);
        bAddExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), AddExpense.class);
                startActivityForResult(myIntent,0);
            }
        });
    }

}
