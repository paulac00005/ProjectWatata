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

public class Add_Transaction extends AppCompatActivity implements View.OnClickListener, LocationListener {

    private LocationManager lManager;
    private Location location;

    Context con = this;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;

    EditText category, amount, note, date, event, locationText;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.activity_add__transaction);

        lManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

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


                location.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
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


    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Log.i("Tuto géolocalisation", "Le statut de la source a changé.");
    }

    @Override
    public void onProviderEnabled(String provider) {
        Log.i("Tuto géolocalisation", "La source a été activé.");
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public void onProviderDisabled(String provider) {
        Log.i("Tuto géolocalisation", "La source a été désactivé");

        Toast.makeText(this,
                String.format("La source \"%s\" a été désactivé", provider),
                Toast.LENGTH_SHORT).show();


        if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                Add_Transaction.this.requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 100);
            }

            return;
        }
        lManager.removeUpdates(this);

        setProgressBarIndeterminateVisibility(false);
    }

}
