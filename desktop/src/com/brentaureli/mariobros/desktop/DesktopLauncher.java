package com.brentaureli.mariobros.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.brentaureli.mariobros.MarioBros;
import static com.brentaureli.mariobros.MarioBros.*;

public class DesktopLauncher
{
    public static void main (String[] arg)
    {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration ();
        config.width = WINDOW_WIDTH;
        config.height = WINDOW_HEIGHT;
        config.title = WINDOW_TITLE;
        
        MarioBros game = new MarioBros ();
        
        new LwjglApplication (game, config);
    }
}
