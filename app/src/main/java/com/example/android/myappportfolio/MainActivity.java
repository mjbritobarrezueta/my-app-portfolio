package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void displayMessage1(View view){
        TextView app1 = (TextView) findViewById(R.id.first_message);
        TextView app2 = (TextView) findViewById(R.id.second_message);
        TextView app3 = (TextView) findViewById(R.id.third_message);
        TextView app4 = (TextView) findViewById(R.id.fourth_message);
        TextView app5 = (TextView) findViewById(R.id.fifth_message);
        TextView app6 = (TextView) findViewById(R.id.sixth_message);

        app1.setVisibility(View.VISIBLE);
        app2.setVisibility(View.INVISIBLE);
        app3.setVisibility(View.INVISIBLE);
        app4.setVisibility(View.INVISIBLE);
        app5.setVisibility(View.INVISIBLE);
        app6.setVisibility(View.INVISIBLE);
    }

    public void displayMessage2(View view){
        TextView app1 = (TextView) findViewById(R.id.first_message);
        TextView app2 = (TextView) findViewById(R.id.second_message);
        TextView app3 = (TextView) findViewById(R.id.third_message);
        TextView app4 = (TextView) findViewById(R.id.fourth_message);
        TextView app5 = (TextView) findViewById(R.id.fifth_message);
        TextView app6 = (TextView) findViewById(R.id.sixth_message);

        app1.setVisibility(View.INVISIBLE);
        app2.setVisibility(View.VISIBLE);
        app3.setVisibility(View.INVISIBLE);
        app4.setVisibility(View.INVISIBLE);
        app5.setVisibility(View.INVISIBLE);
        app6.setVisibility(View.INVISIBLE);
    }

    public void displayMessage3(View view){
        TextView app1 = (TextView) findViewById(R.id.first_message);
        TextView app2 = (TextView) findViewById(R.id.second_message);
        TextView app3 = (TextView) findViewById(R.id.third_message);
        TextView app4 = (TextView) findViewById(R.id.fourth_message);
        TextView app5 = (TextView) findViewById(R.id.fifth_message);
        TextView app6 = (TextView) findViewById(R.id.sixth_message);

        app1.setVisibility(View.INVISIBLE);
        app2.setVisibility(View.INVISIBLE);
        app3.setVisibility(View.VISIBLE);
        app4.setVisibility(View.INVISIBLE);
        app5.setVisibility(View.INVISIBLE);
        app6.setVisibility(View.INVISIBLE);
    }

    public void displayMessage4(View view){
        TextView app1 = (TextView) findViewById(R.id.first_message);
        TextView app2 = (TextView) findViewById(R.id.second_message);
        TextView app3 = (TextView) findViewById(R.id.third_message);
        TextView app4 = (TextView) findViewById(R.id.fourth_message);
        TextView app5 = (TextView) findViewById(R.id.fifth_message);
        TextView app6 = (TextView) findViewById(R.id.sixth_message);

        app1.setVisibility(View.INVISIBLE);
        app2.setVisibility(View.INVISIBLE);
        app3.setVisibility(View.INVISIBLE);
        app4.setVisibility(View.VISIBLE);
        app5.setVisibility(View.INVISIBLE);
        app6.setVisibility(View.INVISIBLE);
    }

    public void displayMessage5(View view){
        TextView app1 = (TextView) findViewById(R.id.first_message);
        TextView app2 = (TextView) findViewById(R.id.second_message);
        TextView app3 = (TextView) findViewById(R.id.third_message);
        TextView app4 = (TextView) findViewById(R.id.fourth_message);
        TextView app5 = (TextView) findViewById(R.id.fifth_message);
        TextView app6 = (TextView) findViewById(R.id.sixth_message);

        app1.setVisibility(View.INVISIBLE);
        app2.setVisibility(View.INVISIBLE);
        app3.setVisibility(View.INVISIBLE);
        app4.setVisibility(View.INVISIBLE);
        app5.setVisibility(View.VISIBLE);
        app6.setVisibility(View.INVISIBLE);
    }

    public void displayMessage6(View view){
        TextView app1 = (TextView) findViewById(R.id.first_message);
        TextView app2 = (TextView) findViewById(R.id.second_message);
        TextView app3 = (TextView) findViewById(R.id.third_message);
        TextView app4 = (TextView) findViewById(R.id.fourth_message);
        TextView app5 = (TextView) findViewById(R.id.fifth_message);
        TextView app6 = (TextView) findViewById(R.id.sixth_message);

        app1.setVisibility(View.INVISIBLE);
        app2.setVisibility(View.INVISIBLE);
        app3.setVisibility(View.INVISIBLE);
        app4.setVisibility(View.INVISIBLE);
        app5.setVisibility(View.INVISIBLE);
        app6.setVisibility(View.VISIBLE);
    }
}
