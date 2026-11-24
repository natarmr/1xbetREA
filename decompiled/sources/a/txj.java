package a;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class txj implements jmn0, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8l f34703a;
    public final HandlerThread b;
    public final lmv c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final LinkedHashMap h;
    public int i;
    public boolean j;
    public final ArrayList k;

    public txj(agn agnVar) {
        Map map = Collections.EMPTY_MAP;
        this.e = new AtomicBoolean(false);
        this.f = new float[16];
        this.g = new float[16];
        this.h = new LinkedHashMap();
        this.i = 0;
        this.j = false;
        this.k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new lmv(handler);
        this.f34703a = new p8l();
        try {
            Map map2 = Collections.EMPTY_MAP;
            tu9 tu9Var = new tu9();
            tu9Var.c = new msf0();
            wu9 wu9Var = new wu9(tu9Var);
            tu9Var.b = wu9Var;
            tu9Var.f34540a = hne.class;
            try {
                Map map3 = Collections.EMPTY_MAP;
                d(new qx9(this, agnVar, tu9Var), new d12((byte) 3));
                tu9Var.f34540a = "Init GlRenderer";
            } catch (Exception e) {
                wu9Var.b(e);
            }
            try {
                wu9Var.get();
            } catch (InterruptedException | ExecutionException e2) {
                e = e2;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e3) {
            release();
            throw e3;
        }
    }

    @Override // a.jmn0
    public final void a(imn0 imn0Var) {
        if (this.e.get()) {
            imn0Var.close();
        } else {
            d(new a4e(this, imn0Var, (byte) 18), new ccf((Object) imn0Var, (byte) 7));
        }
    }

    @Override // a.jmn0
    public final void b(pmn0 pmn0Var) {
        if (this.e.get()) {
            pmn0Var.c();
        } else {
            d(new a4e(this, pmn0Var, (byte) 20), new rxj(pmn0Var, (byte) 0));
        }
    }

    public final void c() {
        if (this.j && this.i == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((imn0) it.next()).close();
            }
            Iterator it2 = this.k.iterator();
            while (it2.hasNext()) {
                ((j35) it2.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            p8l p8lVar = this.f34703a;
            if (((AtomicBoolean) p8lVar.c).getAndSet(false)) {
                vfr.c((Thread) p8lVar.b);
                p8lVar.t();
            }
            this.b.quit();
        }
    }

    public final void d(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new b1(this, runnable2, runnable, (byte) 13));
        } catch (RejectedExecutionException e) {
            l8x.F0("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void e(Exception exc) {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((j35) it.next()).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap f(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        u7x.E(i, fArr2);
        u7x.F(fArr2);
        Size sizeG = jls0.g(i, size);
        p8l p8lVar = this.f34703a;
        p8lVar.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeG.getHeight() * sizeG.getWidth() * 4);
        z1x.t("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeG.getHeight() * sizeG.getWidth()) * 4);
        z1x.t("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = vfr.f37348a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        vfr.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        vfr.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        vfr.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeG.getWidth(), sizeG.getHeight(), 0, 6407, 5121, null);
        vfr.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        vfr.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        vfr.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        vfr.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        vfr.b("glActiveTexture");
        GLES20.glBindTexture(36197, p8lVar.f26560a);
        vfr.b("glBindTexture");
        p8lVar.j = null;
        GLES20.glViewport(0, 0, sizeG.getWidth(), sizeG.getHeight());
        GLES20.glScissor(0, 0, sizeG.getWidth(), sizeG.getHeight());
        tfr tfrVar = (tfr) p8lVar.l;
        tfrVar.getClass();
        if (tfrVar instanceof ufr) {
            GLES20.glUniformMatrix4fv(((ufr) tfrVar).f, 1, false, fArr2, 0);
            vfr.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        vfr.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeG.getWidth(), sizeG.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        vfr.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        vfr.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        vfr.b("glDeleteFramebuffers");
        int i4 = p8lVar.f26560a;
        GLES20.glActiveTexture(33984);
        vfr.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        vfr.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeG.getWidth(), sizeG.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.d(bitmapCreateBitmap, byteBufferAllocateDirect, sizeG.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void g(prs0 prs0Var) {
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (prs0Var == null) {
            e(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmapF = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    j35 j35Var = (j35) it.next();
                    int i3 = j35Var.b;
                    int i4 = j35Var.f15814a;
                    if (i != i3 || bitmapF == null) {
                        if (bitmapF != null) {
                            bitmapF.recycle();
                        }
                        bitmapF = f((Size) prs0Var.b, (float[]) prs0Var.c, i3);
                        i2 = -1;
                        i = i3;
                    }
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmapF.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Surface surface = (Surface) prs0Var.f27482a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.e(byteArray, surface);
                    j35Var.c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f;
        surfaceTexture.getTransformMatrix(fArr);
        prs0 prs0Var = null;
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            imn0 imn0Var = (imn0) entry.getKey();
            float[] fArr2 = imn0Var.e;
            float[] fArr3 = this.g;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i = imn0Var.c;
            if (i == 34) {
                try {
                    this.f34703a.v(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException e) {
                    l8x.Y("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                z1x.y("Unsupported format: " + i, i == 256);
                z1x.y("Only one JPEG output is supported.", prs0Var == null);
                prs0Var = new prs0(surface, imn0Var.d, (float[]) fArr3.clone());
            }
        }
        try {
            g(prs0Var);
        } catch (RuntimeException e2) {
            e(e2);
        }
    }

    @Override // a.jmn0
    public final void release() {
        if (this.e.getAndSet(true)) {
            return;
        }
        d(new ccf((Object) this, (byte) 8), new d12((byte) 3));
    }
}
