package com.gibbyware.GlassyBird;

import android.view.KeyEvent;

import com.badlogic.gdx.InputProcessor;
import com.gibbyware.GameObjects.Bird;

/**
 * Created by mitesh on 2/20/14.
 */
public class InputHandler implements InputProcessor {
    private Bird myBird;

    // Ask for a reference to the Bird when InputHandler is created.
    public InputHandler(Bird bird) {
        // myBird now represents the gameWorld's bird.
        myBird = bird;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        //myBird.onClick();
        return true; // Return true to say we handled the touch.
    }



    @Override
    public boolean keyDown(int keycode) {
        myBird.onClick();
        System.out.println("Touch");
        return true; // Return true to say we handled the touch.
    }

    @Override
    public boolean keyUp(int keycode) {
        System.out.println("Touch");
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

}