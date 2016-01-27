package com.example.paulac.moneytracker;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paulac.moneytracker.Database.UserDbHelper;

import java.util.Calendar;

public class Add_Transaction extends ActionBarActivity implements View.OnClickListener {

    private LocationManager lManager;

    Context con = this;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;

    EditText category, amount, note, date, event, locationText;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__transaction);

        category = (EditText) findViewById(R.id.categorytext);
        amount = (EditText) findViewById(R.id.amounttext);
        note = (EditText) findViewById(R.id.notetext);
        date = (EditText) findViewById(R.id.datetext);
        event = (EditText) findViewById(R.id.eventtext);
        locationText = (EditText) findViewById(R.id.locationtext);
        final ImageView location = (ImageView) findViewById(R.id.imageView5);
        save = (Button) findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (category.getText().toString() == "") {
                    Toast.makeText(getBaseContext(), "Please provide category for this transaction", Toast.LENGTH_LONG).show();
                }else if(amount.getText().toString()==""){
                    Toast.makeText(getBaseContext(), "Please provide the amount for this transaction", Toast.LENGTH_LONG).show();
                }else if(category.getText().toString()=="" && amount.getText().toString()==""){
                    Toast.makeText(getBaseContext(), "Please provide category and amount for this transaction", Toast.LENGTH_SHORT).show();
                }else{
                String Category = category.getText().toString();
                String Amount = amount.getText().toString();
                String Note = note.getText().toString();
                String Date = date.getText().toString();
                String Event = event.getText().toString();
                String Location = locationText.getText().toString();
                userDbHelper = new UserDbHelper(con);
                sqLiteDatabase = userDbHelper.getWritableDatabase();
                userDbHelper.addTransaction(Category, Amount, Note, Date, Event, Location, sqLiteDatabase);
                Toast.makeText(getBaseContext(), "Data Saved", Toast.LENGTH_LONG).show();
                userDbHelper.close();
            }}
        });
    }


    public void onClick(View v) {
        Intent i = new Intent(this, Categories.class);
        startActivity(i);
    }

    public void DatePick() {
        final Calendar c = Calendar.getInstance();

        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dpd = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        TextView txtDate;
                        txtDate = (EditText) findViewById(R.id.datetext);
                        txtDate.setText(dayOfMonth + "-"
                                + (monthOfYear + 1) + "-" + year);
                    }
                }, mYear, mMonth, mDay);

        dpd.show();

    }

    public void Date(View view) {
        this.DatePick();
    }

}
