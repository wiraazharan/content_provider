package com.example.wiraazharan.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/**
 * Created by wiraazharan on 1/29/15.
 */
public class CommentsProvider extends ContentProvider {

    public static final String AUTH = "com.example.wiraazharan.contentprovider.CommentsProvider";
    //public static final Uri comments = Uri.parse("content://"+AUTH+"/"+DbHelper.TABLE_NAME);

    @Override
    public boolean onCreate() {
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
