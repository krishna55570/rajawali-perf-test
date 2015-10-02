package rajawali.sample.com.simplerajawalicube;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;

import com.rajawali.sample.R;

import org.rajawali3d.lights.DirectionalLight;
import org.rajawali3d.materials.Material;
import org.rajawali3d.materials.methods.DiffuseMethod;
import org.rajawali3d.materials.textures.ATexture;
import org.rajawali3d.materials.textures.Texture;
import org.rajawali3d.math.vector.Vector3;
import org.rajawali3d.primitives.Cube;
import org.rajawali3d.primitives.Sphere;
import org.rajawali3d.renderer.RajawaliRenderer;


/**
 * Created by kommineni on 10/2/15.
 */
public class Renderer extends RajawaliRenderer {

    public Context context;
    private Cube mCube;
    public Renderer(Context context) {
        super(context);
        this.context = context;
        setFrameRate(60);
    }

    public void initScene(){
        mCube = new Cube(1);
        Material material = new Material();
        material.setColor(new float[]{0.2f, 0.709803922f, 0.898039216f, 1.0f});
        mCube.setMaterial(material);
        getCurrentScene().addChild(mCube);
    }


    @Override
    public void onRender(final long elapsedTime, final double deltaTime) {
        super.onRender(elapsedTime, deltaTime);

    }


    public void onTouchEvent(MotionEvent event){


    }

    public void onOffsetsChanged(float x, float y, float z, float w, int i, int j){

    }
}
