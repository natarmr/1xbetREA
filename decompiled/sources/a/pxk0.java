package a;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class pxk0 implements GLSurfaceView.Renderer, qa80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2h0 f27757a;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final /* synthetic */ qxk0 k;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] i = new float[16];
    public final float[] j = new float[16];

    public pxk0(qxk0 qxk0Var, e2h0 e2h0Var) {
        this.k = qxk0Var;
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.f27757a = e2h0Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    @Override // a.qa80
    public final synchronized void a(float f, float[] fArr) {
        float[] fArr2 = this.d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.h = f2;
        Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objW;
        synchronized (this) {
            Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
            Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
        e2h0 e2h0Var = this.f27757a;
        float[] fArr2 = this.c;
        GLES20.glClear(16384);
        try {
            n4c.H();
        } catch (p7v e) {
            f1t0.R("SceneRenderer", "Failed to draw a frame", e);
        }
        if (e2h0Var.f7086a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = e2h0Var.j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                n4c.H();
            } catch (p7v e2) {
                f1t0.R("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (e2h0Var.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(e2h0Var.g, 0);
            }
            long timestamp = e2h0Var.j.getTimestamp();
            tyc tycVar = e2h0Var.e;
            synchronized (tycVar) {
                objW = tycVar.W(false, timestamp);
            }
            Long l = (Long) objW;
            if (l != null) {
                o24 o24Var = e2h0Var.d;
                float[] fArr3 = e2h0Var.g;
                float[] fArr4 = (float[]) ((tyc) o24Var.d).Y(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) o24Var.c;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!o24Var.f24513a) {
                        o24.b((float[]) o24Var.b, (float[]) o24Var.c);
                        o24Var.f24513a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) o24Var.b, 0, (float[]) o24Var.c, 0);
                }
            }
            d4c0 d4c0Var = (d4c0) e2h0Var.f.Y(timestamp);
            if (d4c0Var != null) {
                g4c0 g4c0Var = e2h0Var.c;
                if (g4c0.e(d4c0Var)) {
                    g4c0Var.f10659a = d4c0Var.c;
                    g4c0Var.g = new f4c0(d4c0Var.f5448a.f3718a[0]);
                    if (!d4c0Var.d) {
                        tyc tycVar2 = d4c0Var.b.f3718a[0];
                        n4c.K((float[]) tycVar2.d);
                        n4c.K((float[]) tycVar2.e);
                    }
                }
            }
        }
        Matrix.multiplyMM(e2h0Var.h, 0, fArr2, 0, e2h0Var.g, 0);
        g4c0 g4c0Var2 = e2h0Var.c;
        int i = e2h0Var.i;
        float[] fArr6 = e2h0Var.h;
        f4c0 f4c0Var = (f4c0) g4c0Var2.g;
        if (f4c0Var == null) {
            return;
        }
        int i2 = g4c0Var2.f10659a;
        if (i2 == 1) {
            fArr = g4c0.j;
        } else {
            fArr = i2 == 2 ? g4c0.k : g4c0.i;
        }
        GLES20.glUniformMatrix3fv(g4c0Var2.c, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(g4c0Var2.b, 1, false, fArr6, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(g4c0Var2.f, 0);
        try {
            n4c.H();
        } catch (p7v e3) {
            f1t0.R("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(g4c0Var2.d, 3, 5126, false, 12, (Buffer) f4c0Var.b);
        try {
            n4c.H();
        } catch (p7v e4) {
            f1t0.R("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(g4c0Var2.e, 2, 5126, false, 8, (Buffer) f4c0Var.c);
        try {
            n4c.H();
        } catch (p7v e5) {
            f1t0.R("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(f4c0Var.d, 0, f4c0Var.f8908a);
        try {
            n4c.H();
        } catch (p7v e6) {
            f1t0.R("ProjectionRenderer", "Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        qxk0 qxk0Var = this.k;
        SurfaceTexture surfaceTextureC = this.f27757a.c();
        int i = qxk0.l;
        qxk0Var.e.post(new oh60(qxk0Var, surfaceTextureC, (byte) 21));
    }
}
