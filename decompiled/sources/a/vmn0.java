package a;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vmn0 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f37680a;
    public pmn0 b;
    public pmn0 c;
    public hi d;
    public Size e;
    public boolean f = false;
    public boolean g = false;
    public final /* synthetic */ wmn0 h;

    public vmn0(wmn0 wmn0Var) {
        this.h = wmn0Var;
    }

    public final void a() {
        hi hiVar;
        if (this.b != null) {
            l8x.U("SurfaceViewImpl", "Request canceled: " + this.b);
            if (!this.b.c() || (hiVar = this.d) == null) {
                return;
            }
            hiVar.b();
        }
    }

    public final boolean b() {
        wmn0 wmn0Var = this.h;
        Surface surface = wmn0Var.e.getHolder().getSurface();
        if (this.f || this.b == null || !Objects.equals(this.f37680a, this.e)) {
            return false;
        }
        l8x.U("SurfaceViewImpl", "Surface set on Preview.");
        hi hiVar = this.d;
        pmn0 pmn0Var = this.b;
        Objects.requireNonNull(pmn0Var);
        pmn0Var.a(surface, jiq0.o0(wmn0Var.e.getContext()), new ad3(hiVar, (byte) 4));
        this.f = true;
        wmn0Var.d = true;
        wmn0Var.f();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        l8x.U("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
        this.e = new Size(i2, i3);
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        pmn0 pmn0Var;
        l8x.U("SurfaceViewImpl", "Surface created.");
        if (!this.g || (pmn0Var = this.c) == null) {
            return;
        }
        pmn0Var.c();
        pmn0Var.i.b(null);
        this.c = null;
        this.g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l8x.U("SurfaceViewImpl", "Surface destroyed.");
        if (!this.f) {
            a();
        } else if (this.b != null) {
            l8x.U("SurfaceViewImpl", "Surface closed " + this.b);
            this.b.k.a();
        }
        this.g = true;
        pmn0 pmn0Var = this.b;
        if (pmn0Var != null) {
            this.c = pmn0Var;
        }
        this.f = false;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f37680a = null;
    }
}
