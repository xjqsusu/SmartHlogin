package com.example.ioi.smarthlogin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class scene extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scene, menu);
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

    public void showAlert(View view) {
        final AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        final EditText txtInput = new EditText(this);
        final TextView tv = (TextView) findViewById(R.id.textView13);
        final TextView tv2 = (TextView) findViewById(R.id.textView15);



        myAlert.setMessage("Add a new scene!(Demo)")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (tv.getText().toString().equals("")) {
                            tv.setText(txtInput.getText().toString());
                            dialogInterface.dismiss();
                        }else{
                            tv2.setText(txtInput.getText().toString());
                            dialogInterface.dismiss();
                        }
                    }
                })
                .setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Your setting is unsaved", Toast.LENGTH_LONG).show();
                    }
                })
                .setTitle("add a scene here.")
                .setView(txtInput)
                        .create();
        myAlert.show();
    }
}
