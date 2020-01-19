package com.brentaureli.mariobros.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.brentaureli.mariobros.MarioBros;
import static com.brentaureli.mariobros.MarioBros.*;

public class PlayScreen extends ScreenAdapter
{
    private final MarioBros game;
    private final OrthographicCamera gameCam;
    private final Viewport gamePort;
    private final HUD hud;

    public PlayScreen (MarioBros game)
    {
        this.game = game;
        this.gameCam = new OrthographicCamera ();
        this.gamePort = new FitViewport (V_WIDTH, V_HEIGHT, gameCam);
        this.hud = new HUD (game.batch);
    }

    @Override
    public void render (float f)
    {
        Gdx.gl.glClearColor (0, 0, 0, 1);
        Gdx.gl.glClear (GL20.GL_COLOR_BUFFER_BIT);
        
        game.batch.setProjectionMatrix (gameCam.combined);
        hud.stage.draw ();
    }

    @Override
    public void resize (int width, int height)
    {
        gamePort.update (width, height);
    }

    @Override
    public void dispose ()
    {
        hud.dispose ();
    }
}
