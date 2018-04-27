package com.example.lemon.menutest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private EditText etHelloWorld;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etHelloWorld = (EditText) findViewById(R.id.et_hello_world);
        registerForContextMenu(etHelloWorld);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenuInfo menuInfo) {


        getMenuInflater().inflate(R.menu.context, menu);
        menu.setHeaderTitle("Choose BackgroundColor");
        super.onCreateContextMenu(menu, v, menuInfo);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.isCheckable())
        {
            item.setCheckable(true);//②
        }
        switch (item.getItemId()) {

            case R.id.menu_plain_menu:
                Toast.makeText(this, "you click it!", Toast.LENGTH_LONG).show();
                break;

            case R.id.font_20:
                etHelloWorld.setTextSize(20);
                break;
            case R.id.font_30:
                etHelloWorld.setTextSize(30);
                break;
            case R.id.font_40:
                etHelloWorld.setTextSize(40);
                break;
            case R.id.font_red:

                etHelloWorld.setBackgroundColor(Color.RED);item.setChecked(true);
                break;
            case R.id.font_green:

                etHelloWorld.setBackgroundColor(Color.GREEN);item.setChecked(true);
                break;
            case R.id.font_blue:

                etHelloWorld.setBackgroundColor(Color.BLUE);item.setChecked(true);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        item.setChecked(true);
        switch (item.getItemId()) {
            case R.id.font_red:
                item.setChecked(true);
                etHelloWorld.setBackgroundColor(Color.RED);
                break;
            case R.id.font_green:
                item.setChecked(true);
                etHelloWorld.setBackgroundColor(Color.GREEN);
                break;
            case R.id.font_blue:
                item.setChecked(true);
                etHelloWorld.setBackgroundColor(Color.BLUE);
                break;
        }
        return super.onContextItemSelected(item);
    }


}