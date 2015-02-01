package com.example.wiraazharan.contentprovider;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    SQLiteDatabase db;
    DbHelper helper ;

    EditText name,comments,email;
    Button submit;
    String nm,cm,em;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DbHelper(this);
        db = helper.getWritableDatabase();

        name = (EditText)findViewById(R.id.nameet);
        comments = (EditText)findViewById(R.id.commentset);
        email = (EditText)findViewById(R.id.emailet);
        submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nm = name.getText().toString();
                cm = comments.getText().toString();
                em = email.getText().toString();

                ContentValues cv = new ContentValues();
                cv.put(DbHelper.NAME,nm);
                cv.put(DbHelper.COMMENTS,cm);
                cv.put(DbHelper.EMAIL,em);

                db.insert(DbHelper.TABLE_NAME,null,cv);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
