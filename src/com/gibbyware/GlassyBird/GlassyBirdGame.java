package com.gibbyware.GlassyBird;


import com.badlogic.gdx.Game;
import com.gibbyware.Screens.GameScreen;
import com.gibbyware.ZBHelpers.AssetLoader;

/**
 * Created by mitesh on 2/20/14.
 */
public class GlassyBirdGame extends Game {


    GameScreen gamesScreen;
     @Override
    public void create() {
        System.out.println("ZBGame Created!");
        AssetLoader.load();
        gamesScreen= new GameScreen();
        setScreen(gamesScreen);
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }


    public void InputClick(){
        gamesScreen.InputClick();
    }

}
