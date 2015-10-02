package rajawali.sample.com.simplerajawalicube;

import android.app.Activity;
import android.os.Bundle;

import com.rajawali.sample.R;

import org.rajawali3d.surface.IRajawaliSurface;
import org.rajawali3d.surface.RajawaliSurfaceView;

/**
 * Created by kommineni on 10/2/15.
 */
public class MainActivity extends Activity{
    Renderer renderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final RajawaliSurfaceView surface = new RajawaliSurfaceView(this);
        surface.setFrameRate(60.0);
        surface.setRenderMode(IRajawaliSurface.RENDERMODE_WHEN_DIRTY);

        renderer = new Renderer(this);
        surface.setSurfaceRenderer(renderer);
        setContentView(surface);
    }
}
