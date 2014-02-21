package com.gibbyware.GlassyBird;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.badlogic.gdx.backends.android.AndroidApplication;


public class GlassMainActivity extends Activity {

    private boolean mResumed;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mResumed = true;
        openOptionsMenu();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mResumed = false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.level_live_card, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.start:
                Intent flappybird = new Intent(this, MainActivity.class);

                startActivity(flappybird);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        // We must call finish() from this method to ensure that the activity ends either when an
        // item is selected from the menu or when the menu is dismissed by swiping down.
        finish();
    }
}