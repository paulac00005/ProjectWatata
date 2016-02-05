package com.example.paulac.moneytracker;

import android.app.DatePickerDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Add_Transaction extends ActionBarActivity implements View.OnClickListener {

    Context con = this;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;
    private static final int CAMERA_IMAGE_REQUEST=1;


    EditText amount, note, date, event, locationText;
    Button save;
    private Uri fileUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__transaction);

        final EditText category = (EditText) findViewById(R.id.categorytext);
        Intent i = getIntent();
        Bundle bd = i.getExtras();
        if(bd != null)
        {
            String getName = (String) bd.get("text");
            category.setText(getName);
        }


        amount = (EditText) findViewById(R.id.amounttext);
        amount.addTextChangedListener(new TextWatcher() {
            private String current = "";

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (!s.toString().equals(current)) {
                    amount.removeTextChangedListener(this);
                    String replaceable = String.format("[%s,.]", NumberFormat.getCurrencyInstance().getCurrency().getSymbol());
                    String cleanString = s.toString().replaceAll(replaceable, "");

                    double parsed;
                    try {
                        parsed = Double.parseDouble(cleanString);
                    } catch (NumberFormatException e) {
                        parsed = 0.00;
                    }
                    String formatted = NumberFormat.getCurrencyInstance().format((parsed / 100));

                    current = formatted;
                    amount.setText(formatted);
                    amount.setSelection(formatted.length());
                    amount.addTextChangedListener(this);
                }
            }
        });

        note = (EditText) findViewById(R.id.notetext);
        date = (EditText) findViewById(R.id.datetext);
        event = (EditText) findViewById(R.id.eventtext);
        locationText = (EditText) findViewById(R.id.locationtext);
        //final ImageView location = (ImageView) findViewById(R.id.imageView5);

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
            }
        });


    }

    private void openImageIntent(){

        String root = null;
        String imageFolderPath = null;
        String imageName = null;
        Uri fileUri = null;
        final int CAMERA_IMAGE_REQUEST=1;

        ImageView imageView = (ImageView) findViewById(R.id.imagehere);

        // fetching the root directory
        root = Environment.getExternalStorageDirectory().toString()
                + "/Your_Folder";

        // Creating folders for Image
        imageFolderPath = root + "/saved_images";
        File imagesFolder = new File(imageFolderPath);
        imagesFolder.mkdirs();

        // Generating file name
        imageName = "test.png";

        // Creating image here

        File image = new File(imageFolderPath, imageName);

        fileUri = Uri.fromFile(image);

        imageView.setTag(imageFolderPath + File.separator + imageName);

        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);

        startActivityForResult(takePictureIntent,
                CAMERA_IMAGE_REQUEST);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {

            switch (requestCode) {
                case CAMERA_IMAGE_REQUEST:

                    Bitmap bitmap = null;
                    try {
                        GetImageThumbnail getImageThumbnail = new GetImageThumbnail();
                        bitmap = getImageThumbnail.getThumbnail(fileUri, this);
                    } catch (FileNotFoundException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                    // Setting image image icon on the imageview

                    ImageView imageView = (ImageView) this
                            .findViewById(R.id.imagehere);

                    imageView.setImageBitmap(bitmap);

                    break;

                default:
                    Toast.makeText(this, "Something went wrong...",
                            Toast.LENGTH_SHORT).show();
                    break;
            }

        }
    }

    public void showFullImage(View view) {
        String path = (String) view.getTag();

        if (path != null) {

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri imgUri = Uri.parse("file://" + path);
            intent.setDataAndType(imgUri, "image/*");
            startActivity(intent);

        }

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
