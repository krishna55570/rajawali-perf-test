package com.example.kommineni.sampleopenglcube;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;


public class OpenglActivity extends Activity {
    private GLSurfaceView mGLView;
    private Renderer mRenderer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opengl);
        mGLView = (GLSurfaceView) findViewById(R.id.gl_surface_view);
        mRenderer = new Renderer();
        mGLView.setEGLContextClientVersion(2);
        mGLView.setRenderer(mRenderer);
    }
}
