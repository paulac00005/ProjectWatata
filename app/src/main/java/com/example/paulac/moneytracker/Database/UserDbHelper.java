package com.example.paulac.moneytracker.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class UserDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Database";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_QUERY = "CREATE TABLE " + MyDatabase.Database.TABLE_NAME +
            "(" +
            MyDatabase.Database.CATEGORY + " TEXT," +
            MyDatabase.Database.AMOUNT + " TEXT," +
            MyDatabase.Database.NOTE + " TEXT," +
            MyDatabase.Database.DATE + " TEXT," +
            MyDatabase.Database.EVENT + " TEXT," +
            MyDatabase.Database.LOCATION + " TEXT)";

    public UserDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("DATABASE OPERATIONS", "Database Created/Opened . . .");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
        Log.e("DATABASE OPERATIONS", "Table Created . . .");
    }


    public void addTransaction(String category, String amount, String note,
                               String date, String event, String location, SQLiteDatabase udh){
        ContentValues cv = new ContentValues();
        cv.put(MyDatabase.Database.CATEGORY, category);
        cv.put(MyDatabase.Database.AMOUNT, amount);
        cv.put(MyDatabase.Database.NOTE, note);
        cv.put(MyDatabase.Database.DATE, date);
        cv.put(MyDatabase.Database.EVENT, event);
        cv.put(MyDatabase.Database.LOCATION, location);
        udh.insert(MyDatabase.Database.TABLE_NAME, null, cv);
        Log.e("DATABASE OPERATIONS", "One row inserted . . .");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
