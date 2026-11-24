package a;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class jbn extends p8l {
    public int n = -1;
    public int o = -1;
    public final c5k p;
    public final c5k q;

    public jbn(c5k c5kVar, c5k c5kVar2) {
        this.p = c5kVar;
        this.q = c5kVar2;
    }

    public final void C(long j, Surface surface, imn0 imn0Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        vfr.d((AtomicBoolean) this.c, true);
        vfr.c((Thread) this.b);
        HashMap map = (HashMap) this.d;
        z1x.y("The surface is not registered.", map.containsKey(surface));
        m45 m45VarB = (m45) map.get(surface);
        Objects.requireNonNull(m45VarB);
        if (m45VarB == vfr.j) {
            m45VarB = b(surface);
            if (m45VarB == null) {
                return;
            } else {
                map.put(surface, m45VarB);
            }
        }
        m45 m45Var = m45VarB;
        EGLSurface eGLSurface = m45Var.f21151a;
        if (surface != ((Surface) this.j)) {
            q(eGLSurface);
            this.j = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        D(m45Var, imn0Var, surfaceTexture, this.p, this.n, true);
        D(m45Var, imn0Var, surfaceTexture2, this.q, this.o, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.e, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.e, eGLSurface)) {
            return;
        }
        l8x.E0("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        u(surface, false);
    }

    public final void D(m45 m45Var, imn0 imn0Var, SurfaceTexture surfaceTexture, c5k c5kVar, int i, boolean z) {
        B(i);
        int i2 = m45Var.b;
        int i3 = m45Var.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, z ? imn0Var.e : imn0Var.f, 0);
        tfr tfrVar = (tfr) this.l;
        tfrVar.getClass();
        if (tfrVar instanceof ufr) {
            GLES20.glUniformMatrix4fv(((ufr) tfrVar).f, 1, false, fArr2, 0);
            vfr.b("glUniformMatrix4fv");
        }
        tm80 tm80Var = (tm80) c5kVar.b;
        Size size = new Size((int) (((Float) tm80Var.f34182a).floatValue() * i2), (int) (((Float) tm80Var.b).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        tm80 tm80Var2 = (tm80) c5kVar.f3775a;
        if (((Float) tm80Var.f34182a).floatValue() != 0.0f || ((Float) tm80Var.b).floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, ((Float) tm80Var2.f34182a).floatValue() / ((Float) tm80Var.f34182a).floatValue(), ((Float) tm80Var2.b).floatValue() / ((Float) tm80Var.b).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(tfrVar.b, 1, false, fArr5, 0);
        vfr.b("glUniformMatrix4fv");
        GLES20.glUniform1f(tfrVar.c, 1.0f);
        vfr.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        vfr.b("glDrawArrays");
        GLES20.glDisable(3042);
    }

    @Override // a.p8l
    public final w35 o(agn agnVar) {
        Map map = Collections.EMPTY_MAP;
        w35 w35VarO = super.o(agnVar);
        this.n = vfr.h();
        this.o = vfr.h();
        return w35VarO;
    }
}
