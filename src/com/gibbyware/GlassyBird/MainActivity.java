package com.gibbyware.GlassyBird;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.KeyEvent;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import java.util.List;

public class MainActivity extends AndroidApplication {


    GlassyBirdGame gameBirdGame;

    private static final int SPEECH_REQUEST = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = false;

        gameBirdGame = new GlassyBirdGame();
        initialize( gameBirdGame, cfg);
    }

    @Override
    public boolean onKeyDown(int keycode, KeyEvent event) {
        if (keycode == KeyEvent.KEYCODE_DPAD_CENTER) {
            // user tapped touchpad, do something
            System.out.println("Screen Touched");
            gameBirdGame.InputClick();
            return true;
        }

        if (keycode == KeyEvent.KEYCODE_BACK) {
            // Tap back to end app
            this.finish();
            return true;
        }


        return false;
    }


}