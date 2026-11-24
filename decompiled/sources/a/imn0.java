package a;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class imn0 implements Closeable {
    public final Surface b;
    public final int c;
    public final Size d;
    public final float[] e;
    public final float[] f;
    public sbe g;
    public Executor h;
    public final wu9 k;
    public final tu9 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15035a = new Object();
    public boolean i = false;
    public boolean j = false;

    public imn0(Surface surface, int i, Size size, i55 i55Var, i55 i55Var2) {
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        this.b = surface;
        this.c = i;
        this.d = size;
        a(fArr, new float[16], i55Var);
        a(fArr2, new float[16], i55Var2);
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        try {
            this.l = tu9Var;
            tu9Var.f34540a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            wu9Var.b(e);
        }
        this.k = wu9Var;
    }

    public static void a(float[] fArr, float[] fArr2, i55 i55Var) {
        Matrix.setIdentityM(fArr, 0);
        if (i55Var == null) {
            return;
        }
        Size size = i55Var.f14178a;
        boolean z = i55Var.e;
        int i = i55Var.d;
        u7x.F(fArr);
        u7x.E(i, fArr);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeG = jls0.g(i, size);
        android.graphics.Matrix matrixA = jls0.a(jls0.h(size), jls0.h(sizeG), i, z);
        RectF rectF = new RectF(i55Var.b);
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeG.getWidth();
        float height = ((sizeG.getHeight() - rectF.height()) - rectF.top) / sizeG.getHeight();
        float fWidth = rectF.width() / sizeG.getWidth();
        float fHeight = rectF.height() / sizeG.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        s0a s0aVar = i55Var.c;
        Matrix.setIdentityM(fArr2, 0);
        u7x.F(fArr2);
        if (s0aVar != null) {
            z1x.y("Camera has no transform.", s0aVar.q());
            u7x.E(s0aVar.a().d(), fArr2);
            if (s0aVar.k()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public final Surface c(lmv lmvVar, sbe sbeVar) {
        boolean z;
        synchronized (this.f15035a) {
            this.h = lmvVar;
            this.g = sbeVar;
            z = this.i;
        }
        if (z) {
            d();
        }
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f15035a) {
            try {
                if (!this.j) {
                    this.j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.l.b(null);
    }

    public final void d() {
        Executor executor;
        sbe sbeVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f15035a) {
            try {
                if (this.h == null || (sbeVar = this.g) == null) {
                    this.i = true;
                } else if (!this.j) {
                    atomicReference.set(sbeVar);
                    executor = this.h;
                    this.i = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new oh60(this, atomicReference, (byte) 25));
            } catch (RejectedExecutionException e) {
                String strC0 = l8x.C0("SurfaceOutputImpl");
                if (l8x.i0(3, strC0)) {
                    Log.d(strC0, "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }
}
