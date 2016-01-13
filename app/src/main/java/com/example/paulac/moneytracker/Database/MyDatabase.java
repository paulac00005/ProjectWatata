package com.example.paulac.moneytracker.Database;

import android.provider.BaseColumns;

/**
 * Created by paulac on 1/13/16.
 */
public class MyDatabase {

    public static abstract class Database implements BaseColumns{

        public static final String CATEGORY = "db_category";
        public static final String AMOUNT = "db_amount";
        public static final String NOTE = "db_note";
        public static final String DATE = "db_date";
        public static final String EVENT = "db_event";
        public static final String LOCATION = "db_location";
        public static final String TABLE_NAME = "db_table";
    }
}
