package com.example.trysqllite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.SQLException;
import android.util.Log;
public class DBHelper extends SQLiteOpenHelper{
    public static final String DB_name = "dbStudents.db";
    public static final String table_name = "students_table";
    public static final String col2_first_name = "first_name";
    public static final String col3_last_name = "last_name";
    public static final String col4_age = "age";
    public static final String col5_tel = "tel";
    public static final String col6_email = "email";
    public static final String col7_faculty = "faculty";
    public DBHelper(Context context){
        super(context,DB_name,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_STUDENT_TABLE = "CREATE TABLE students_table(id INTEGER PRIMARY KEY AUTOINCREMENT," + "first_name TEXT,last_name TEXT,age INTEGER,tel TEXT,email TEXT,faculty TEXT)";
        db.execSQL(CREATE_STUDENT_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String DROP_STUDENT_TABLE = "DROP TABLE IF EXISTS "+table_name;
        db.execSQL(DROP_STUDENT_TABLE);
        onCreate(db);
    }
}
