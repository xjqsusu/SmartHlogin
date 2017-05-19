package com.example.ioi.smarthlogin;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.VideoView;


public class monitor extends Activity {

    private static final String VIDEO_FEEDURL = "https://www.youtube.com/watch?v=SiD77g9KfhA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);

        String url = "https://www.youtube.com/embed/rIbKXnlgOME";
        final VideoView mainVideo = (VideoView) findViewById(R.id.videoView);
        mainVideo.setVideoURI(Uri.parse(VIDEO_FEEDURL));
        mainVideo.requestFocus();
        mainVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mainVideo.start();
            }
        });
        /*WebView view = (WebView) this.findViewById(R.id.webView);

        view.getSettings().setJavaScriptEnabled(true);

        view.setWebChromeClient( new WebChromeClient(){});
        view.loadUrl(url);*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_monitor, menu);
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
