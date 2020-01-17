package com.brentaureli.mariobros.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.brentaureli.mariobros.MarioBros;

public class PlayScreen extends ScreenAdapter
{
    private final MarioBros game;
    Texture texture;

    public PlayScreen (MarioBros game)
    {
        this.game = game;
        this.texture = new Texture ("badlogic.jpg");
    }

    @Override
    public void render (float f)
    {
        Gdx.gl.glClearColor (0, 0, 0, 1);
        Gdx.gl.glClear (GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin ();
        game.batch.draw (texture, 0, 0);
        game.batch.end ();
    }

    @Override
    public void resize (int i, int i1)
    {
    }

    @Override
    public void dispose ()
    {
        texture.dispose ();
    }
}
