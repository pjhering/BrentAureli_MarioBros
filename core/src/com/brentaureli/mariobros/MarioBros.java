package com.brentaureli.mariobros;

import com.brentaureli.mariobros.screens.PlayScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MarioBros extends Game
{
    public static final int V_WIDTH = 400;
    public static final int V_HEIGHT = 204;
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 408;
    public static final String WINDOW_TITLE = "Super Mario Brothers";
    
    public SpriteBatch batch;

    @Override
    public void create ()
    {
        batch = new SpriteBatch ();
        this.setScreen (new PlayScreen (this));
    }

    @Override
    public void render ()
    {
        super.render ();
    }

    @Override
    public void dispose ()
    {
        batch.dispose ();
    }
}
