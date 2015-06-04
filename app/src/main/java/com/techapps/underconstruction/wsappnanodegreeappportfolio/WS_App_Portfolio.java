package com.techapps.underconstruction.wsappnanodegreeappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class WS_App_Portfolio extends ActionBarActivity {

    String toastText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ws__app__portfolio);

    }

    public void myClickListener (View v){

        switch (v.getId()){
            case R.id.spotifyButton:
                toastText = getResources().getString(R.string.spotify_toast);
                break;
            case R.id.scoresButton:
                toastText = getResources().getString(R.string.scores_toast);
                break;
            case R.id.libraryButton:
                toastText = getResources().getString(R.string.library_toast);
                break;
            case R.id.buildBiggerButton:
                toastText = getResources().getString(R.string.build_bigger_toast);
                break;
            case R.id.readerButton:
                toastText = getResources().getString(R.string.reader_toast);
                break;
            case R.id.capstoneButton:
                toastText = getResources().getString(R.string.capstone_toast);
                break;
        }
        Toast.makeText(this, toastText, Toast.LENGTH_LONG).show();
    }


}
