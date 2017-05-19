package com.example.ioi.smarthlogin;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class SmartH extends Activity {

    /** Called when the user clicks the Send button */
    public void sett(View view) {
        // Do something in response to button
        Intent sett = new Intent(this, sett.class);
        startActivity(sett);
    }

    /** Called when the user clicks the Send button */
    public void devices(View view) {
        // Do something in response to button
        Intent devices = new Intent(this, devices.class);
        startActivity(devices);
    }

    /** Called when the user clicks the Send button */
    public void scene(View view) {
        // Do something in response to button
        Intent scene = new Intent(this, scene.class);
        startActivity(scene);
    }

    /** Called when the user clicks the Send button */
    public void monitor(View view) {
        // Do something in response to button
        Uri uri = Uri.parse("http://www.chart.state.md.us/video/video.php?feed=bd000b0500ea00af004502366d235daa");
        Intent monitor = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(monitor);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_smart_h);
        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(Login.EXTRA_MESSAGE);
        // Create the text view
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTextSize(25);
        textView.setText("Hello, " + message + "!");
        // Set the text view as the activity layout

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_smart_h, menu);
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
