package com.example.baith;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

public class DBHelper extends SQLiteOpenHelper {
    private EditText editTextName;
    private EditText editTextAge;
    private EditText editTextStudentNumber;
    private EditText editAVGScore;

    private static final String DATABASE_NAME = "students.db";
    private static final int DATABASE_VERSION = 3;

    private static final String SQL_CREATE_TABLE_STUDENTS =
            "CREATE TABLE students (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "age INTEGER," +
                    "detdang INTEGER," +
                    "score FLOAT);";
    private static final String SQL_DROP_TABLE_STUDENTS =
            "DROP TABLE IF EXISTS students";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //db.execSQL(SQL_DROP_TABLE_STUDENTS);
        db.execSQL(SQL_CREATE_TABLE_STUDENTS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_TABLE_STUDENTS);
        onCreate(db);
    }

}
