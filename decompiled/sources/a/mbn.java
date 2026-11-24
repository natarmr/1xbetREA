package a;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class mbn implements jmn0, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbn f21518a;
    public final HandlerThread b;
    public final lmv c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean g;
    public final LinkedHashMap h;
    public SurfaceTexture i;
    public SurfaceTexture j;

    public mbn(agn agnVar, c5k c5kVar, c5k c5kVar2) {
        Map map = Collections.EMPTY_MAP;
        this.e = 0;
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new lmv(handler);
        this.f21518a = new jbn(c5kVar, c5kVar2);
        try {
            e(agnVar);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    @Override // a.jmn0
    public final void a(imn0 imn0Var) {
        if (this.g.get()) {
            imn0Var.close();
        } else {
            d(new a4e(this, imn0Var, (byte) 28), new ccf(imn0Var, (byte) 7));
        }
    }

    @Override // a.jmn0
    public final void b(pmn0 pmn0Var) {
        if (this.g.get()) {
            pmn0Var.c();
        } else {
            d(new a4e(this, pmn0Var, (byte) 27), new rxj(pmn0Var, (byte) 0));
        }
    }

    public final void c() {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((imn0) it.next()).close();
            }
            linkedHashMap.clear();
            jbn jbnVar = this.f21518a;
            if (((AtomicBoolean) jbnVar.c).getAndSet(false)) {
                vfr.c((Thread) jbnVar.b);
                jbnVar.t();
            }
            jbnVar.n = -1;
            jbnVar.o = -1;
            this.b.quit();
        }
    }

    public final void d(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new b1(this, runnable2, runnable, (byte) 15));
        } catch (RejectedExecutionException e) {
            l8x.F0("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void e(agn agnVar) {
        Map map = Collections.EMPTY_MAP;
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = hne.class;
        try {
            d(new qx9(this, agnVar, tu9Var), new d12((byte) 3));
            tu9Var.f34540a = "Init GlRenderer";
        } catch (Exception e) {
            wu9Var.b(e);
        }
        try {
            wu9Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            hny.q("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.g.get() || (surfaceTexture2 = this.i) == null || this.j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.j.updateTexImage();
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            imn0 imn0Var = (imn0) entry.getKey();
            if (imn0Var.c == 34) {
                try {
                    this.f21518a.C(surfaceTexture.getTimestamp(), surface, imn0Var, this.i, this.j);
                } catch (RuntimeException e) {
                    l8x.Y("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    @Override // a.jmn0
    public final void release() {
        if (this.g.getAndSet(true)) {
            return;
        }
        d(new ccf(this, (byte) 17), new d12((byte) 3));
    }
}
