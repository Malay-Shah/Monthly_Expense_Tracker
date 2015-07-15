package com.random.malay.monthlyexpensetracker;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class AddExpense extends Activity {

    EditText inputDate , inputDescription, inputCategory, inputAmount;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);
        inputDate = (EditText) findViewById(R.id.inputDate);
        inputDescription = (EditText) findViewById(R.id.inputDescription);
        inputCategory = (EditText) findViewById(R.id.inputCategory);
        inputAmount = (EditText) findViewById(R.id.inputAmount);

    }

    public void AddExpense(View view){
        String date = inputDate.getText().toString();
        String description = inputDescription.getText().toString();
        String category = inputCategory.getText().toString();
        String amount = inputAmount.getText().toString();
        userDbHelper = new UserDbHelper(view.getContext());
        sqLiteDatabase = userDbHelper.getWritableDatabase();
        userDbHelper.addInformations(date, description, category, amount, sqLiteDatabase);
        Toast.makeText(getBaseContext(),"Data Saved", Toast.LENGTH_LONG).show();
        userDbHelper.close();
        inputDate.setText("");
        inputDescription.setText("");
        inputCategory.setText("");
        inputAmount.setText("");
    }

}
