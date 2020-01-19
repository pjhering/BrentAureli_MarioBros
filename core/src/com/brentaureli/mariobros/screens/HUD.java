package com.brentaureli.mariobros.screens;

import static com.badlogic.gdx.graphics.Color.RED;
import static com.badlogic.gdx.graphics.Color.WHITE;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import static com.brentaureli.mariobros.MarioBros.*;
import static java.lang.String.format;

public class HUD
{
    public final Stage stage;
    private final Viewport viewport;
    
    private int worldTimer;
    private float timeCount;
    private int score;
    
    private final BitmapFont font;
    
    private final Label countdownLabel;
    private final Label scoreLabel;
    private final Label timeLabel;
    private final Label levelLabel;
    private final Label worldLabel;
    private final Label marioLabel;
    
    public HUD (SpriteBatch batch)
    {
        worldTimer = 300;
        timeCount = 0;
        score = 0;
        
        viewport = new FitViewport (V_WIDTH, V_HEIGHT, new OrthographicCamera ());
        stage = new Stage (viewport, batch);
        
        Table table = new Table ();
        table.top ().setFillParent (true);
        
        font = new BitmapFont ();
        LabelStyle red = new LabelStyle (font, RED);
        LabelStyle white = new LabelStyle (font, WHITE);
        
        marioLabel = new Label ("MARIO", red);
        worldLabel = new Label ("WORLD", red);
        timeLabel = new Label ("TIME", red);
        scoreLabel = new Label (format ("%06d", score), white);
        levelLabel = new Label ("1-1", white);
        countdownLabel = new Label (format ("%03d", worldTimer), white);
        
        table.add (marioLabel).expandX ().padTop (5);
        table.add (worldLabel).expandX ().padTop (5);
        table.add (timeLabel).expandX ().padTop (5);
        table.row ();
        table.add (scoreLabel).expandX ();
        table.add (levelLabel).expandX ();
        table.add (countdownLabel).expandX ();
        table.row ();
        
        stage.addActor (table);
    }
    
    public void dispose ()
    {
        stage.dispose ();
        font.dispose ();
    }
}
