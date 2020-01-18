package com.brentaureli.mariobros.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.brentaureli.mariobros.MarioBros;

public class PlayScreen extends ScreenAdapter
{
    private final MarioBros game;
    Texture texture;
    private OrthographicCamera gameCam;
    private Viewport gamePort;

    public PlayScreen (MarioBros game)
    {
        this.game = game;
        this.texture = new Texture ("badlogic.jpg");
        this.gameCam = new OrthographicCamera ();
        this.gamePort = new FitViewport (800, 480, gameCam);
    }

    @Override
    public void render (float f)
    {
        Gdx.gl.glClearColor (0, 0, 0, 1);
        Gdx.gl.glClear (GL20.GL_COLOR_BUFFER_BIT);
        game.batch.setProjectionMatrix (gameCam.combined);

        game.batch.begin ();
        game.batch.draw (texture, 0, 0);
        game.batch.end ();
    }

    @Override
    public void resize (int width, int height)
    {
        gamePort.update (width, height);
    }

    @Override
    public void dispose ()
    {
        texture.dispose ();
    }
}
