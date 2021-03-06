package edu.montclair.mobilecomputing.m_alrajab.assignment_1.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static edu.montclair.mobilecomputing.m_alrajab.assignment_1.model.RegistrationContracts.SQL_CREATE_ENTRIES;
import static edu.montclair.mobilecomputing.m_alrajab.assignment_1.model.RegistrationContracts.SQL_DELETE_ENTRIES;

/**
 * Created by denis on 3/4/2017.
 */

public class RegistrationDbHelper extends SQLiteOpenHelper {
        public static final int DATABASE_VERSION = 2;
        public static final String DATABASE_NAME = "Registration.db";

        public RegistrationDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
