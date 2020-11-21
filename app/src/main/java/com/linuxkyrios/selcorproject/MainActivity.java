package com.linuxkyrios.selcorproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.content.Intent;
import android.widget.ListView;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating listener object
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, //implementing onItemClick method
                                    View itemView,
                                    int position,
                                    long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, PenCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };
        //Adding listener object to list view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}