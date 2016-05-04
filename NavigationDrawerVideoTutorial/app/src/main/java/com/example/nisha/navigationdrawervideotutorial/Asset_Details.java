package com.example.nisha.navigationdrawervideotutorial;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Asset_Details extends AppCompatActivity {

    ImageButton add_asset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset__details);
        init();         //creates table
        add_asset = (ImageButton) findViewById(R.id.add);
        add_asset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent(Asset_Details.this, Add_Asset.class);

                startActivity(in);

            }
        });
    }

    public void init()
    {
        TableLayout table = (TableLayout) findViewById(R.id.asset_table);

        TableRow tbrow0 = new TableRow(this);       //first row contains name of the columns
        TextView tv0 = new TextView(this);          //column-1
        tv0.setText("Asset");
        tv0.setTextColor(Color.BLACK);
        tv0.setGravity(Gravity.CENTER);
        tbrow0.addView(tv0);
        TextView tv1 = new TextView(this);          //column-2
        tv1.setText("Asset Category");
        tv1.setTextColor(Color.BLACK);
        tv1.setGravity(Gravity.CENTER);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(this);          //column-3
        tv2.setText("Asset");
        tv2.setTextColor(Color.BLACK);
        tv2.setGravity(Gravity.CENTER);
        tbrow0.addView(tv2);
        table.addView(tbrow0);
        TableRow tbrow1 = new TableRow(this);
        tbrow1.setBackgroundColor(Color.BLACK);
        tbrow1.setMinimumHeight(2);
        table.addView(tbrow1);

        for (int i=0; i<10;i++)                 //this loop is for dynamically creating table rows
        {
            TableRow tbrow = new TableRow(this);
            TextView asset = new TextView(this);
            asset.setText("Place_Asset");
            asset.setTextColor(Color.BLACK);
            asset.setGravity(Gravity.CENTER);
            tbrow.addView(asset);
            TextView ass_cat = new TextView(this);
            ass_cat.setText("category");
            ass_cat.setTextColor(Color.BLACK);
            ass_cat.setGravity(Gravity.CENTER);
            tbrow.addView(ass_cat);
            TextView value = new TextView(this);
            value.setText("100000");
            value.setTextColor(Color.BLACK);
            value.setGravity(Gravity.CENTER);
            tbrow.addView(value);
            table.addView(tbrow);
            TableRow line = new TableRow(this);
            line.setBackgroundColor(Color.BLACK);
            line.setMinimumHeight(2);

            table.addView(line);


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_asset__details, menu);
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
