package a;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* JADX INFO: loaded from: classes.dex */
public final class peu0 extends GLSurfaceView implements reu0 {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oeu0 f26870a;

    public peu0(Context context) {
        super(context, null);
        oeu0 oeu0Var = new oeu0(this);
        this.f26870a = oeu0Var;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(oeu0Var);
        setRenderMode(0);
    }

    public void setOutputBuffer(qeu0 qeu0Var) {
        oeu0 oeu0Var = this.f26870a;
        if (oeu0Var.f.getAndSet(qeu0Var) == null) {
            oeu0Var.f25141a.requestRender();
        } else {
            hny.b();
        }
    }

    @Deprecated
    public reu0 getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
