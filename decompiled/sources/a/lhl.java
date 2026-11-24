package a;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class lhl extends pm80 implements jff0 {
    public final Drawable f;
    public final pz40 g = androidx.compose.runtime.e.e(0);
    public final pz40 h;
    public final n0o0 i;

    public lhl(Drawable drawable) {
        this.f = drawable;
        a8z a8zVar = mhl.f21799a;
        this.h = androidx.compose.runtime.e.e(new h7k0((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : p7x.n(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.i = maz.b(new ucj(this, (byte) 28));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // a.pm80
    public final boolean a(float f) {
        this.f.setAlpha(l1e0.d(si30.b(f * 255.0f), 0, 255));
        return true;
    }

    @Override // a.pm80
    public final boolean b(a4d a4dVar) {
        this.f.setColorFilter(a4dVar != null ? a4dVar.f217a : null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.jff0
    public final void c() {
        Drawable.Callback callback = (Drawable.Callback) this.i.getValue();
        Drawable drawable = this.f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // a.pm80
    public final void d(k6z k6zVar) {
        int i;
        k6zVar.getClass();
        int iOrdinal = k6zVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
        } else {
            i = 0;
        }
        this.f.setLayoutDirection(i);
    }

    @Override // a.jff0
    public final void f() {
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.jff0
    public final void g() {
        Drawable drawable = this.f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // a.pm80
    public final long i() {
        return ((h7k0) ((hgk0) this.h).getValue()).f12579a;
    }

    @Override // a.pm80
    public final void j(fhl fhlVar) {
        fhlVar.getClass();
        x5a x5aVarI = fhlVar.A0().i();
        ((Number) ((hgk0) this.g).getValue()).intValue();
        try {
            x5aVarI.l();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f;
            if (i < 28 || i >= 31 || !uvk.r(drawable)) {
                drawable.setBounds(0, 0, si30.b(h7k0.e(fhlVar.d())), si30.b(h7k0.c(fhlVar.d())));
            } else {
                x5aVarI.a(h7k0.e(fhlVar.d()) / h7k0.e(i()), h7k0.c(fhlVar.d()) / h7k0.c(i()));
            }
            Canvas canvas = vw2.f38128a;
            drawable.draw(((uw2) x5aVarI).f36374a);
        } finally {
            x5aVarI.i();
        }
    }
}
