package com.random.malay.monthlyexpensetracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Malay on 7/8/2015.
 */
public class UserDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "EXPENSE.DB";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_QUERY=
            "CREATE TABLE " + ExpenseDatabase.NewExpenseItem.TABLE_NAME + "("+ ExpenseDatabase.NewExpenseItem.DATE+" TEXT,"+ ExpenseDatabase.NewExpenseItem.DESCRIPTION+ " TEXT,"+
            ExpenseDatabase.NewExpenseItem.CATEGORY+" TEXT," + ExpenseDatabase.NewExpenseItem.AMOUNT+ " REAL);";

    public UserDbHelper(Context context){


        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.e("DATABASE OPERATIONS", "Database created / opened");
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_QUERY);
        Log.e("DATABASE OPERATIONS", "Table created");

    }

    public void addInformations(String date, String description, String category, Integer amount,SQLiteDatabase db ){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ExpenseDatabase.NewExpenseItem.DATE,date);
        contentValues.put(ExpenseDatabase.NewExpenseItem.DESCRIPTION, description);
        contentValues.put(ExpenseDatabase.NewExpenseItem.CATEGORY, category);
        contentValues.put(ExpenseDatabase.NewExpenseItem.AMOUNT, amount);
        db.insert(ExpenseDatabase.NewExpenseItem.TABLE_NAME, null, contentValues);
        Log.e("DATABASE OPERATIONS", "One row inserted in DB");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
