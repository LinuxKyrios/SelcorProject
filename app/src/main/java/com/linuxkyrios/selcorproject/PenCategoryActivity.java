package com.linuxkyrios.selcorproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;

public class PenCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pen_category);

        //This part of code fulfills list view with data from pens array
        ArrayAdapter<Pen> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Pen.pens);
        ListView listPens = (ListView) findViewById(R.id.list_pens);
        listPens.setAdapter(listAdapter);

    }
}