package com.gibbyware.Screens;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.gibbyware.GameWorld.GameRenderer;
import com.gibbyware.GameWorld.GameWorld;
import com.gibbyware.ZBHelpers.InputHandler;

public class GameScreen implements Screen {

    private GameWorld world;
    private GameRenderer renderer;
    private float runTime;

    // This is the constructor, not the class declaration
    public GameScreen() {



        float screenWidth = 300;//Gdx.graphics.getWidth();
        float screenHeight = 250;//Gdx.graphics.getHeight();

        float gameHeight = 136;
        float gameWidth = screenHeight / (screenWidth / gameHeight);

        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world, (int) gameHeight, midPointY);

        Gdx.input.setInputProcessor(new InputHandler(world));

    }

    public void InputClick(){
        renderer.InputClick();
    }


    @Override
    public void render(float delta) {
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("GameScreen - resizing");
    }

    @Override
    public void show() {
        System.out.println("GameScreen - show called");
    }

    @Override
    public void hide() {
        System.out.println("GameScreen - hide called");
    }

    @Override
    public void pause() {
        System.out.println("GameScreen - pause called");
    }

    @Override
    public void resume() {
        System.out.println("GameScreen - resume called");
    }

    @Override
    public void dispose() {
        // Leave blank
    }

}
