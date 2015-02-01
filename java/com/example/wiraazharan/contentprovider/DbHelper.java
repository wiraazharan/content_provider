package com.example.wiraazharan.contentprovider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by wiraazharan on 1/29/15.
 */
public class DbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "data";
    public static final String TABLE_NAME = "comments_table";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String COMMENTS = "comments";
    public static final String EMAIL = "email";
    public static final String TIME = "time";
    public static final int VERSION = 1;

    public static String create_db = "create table if not exists "
                                     + TABLE_NAME
                                     +" ( "+ID+" integer primary key autoincrement,"
                                     +NAME+" text,"
                                     +COMMENTS+" text,"
                                     +EMAIL+" text,"
                                     +TIME+" text)";


    public DbHelper(Context context) {
        super(context,DATABASE_NAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(create_db);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table "+ TABLE_NAME);
    }
}
