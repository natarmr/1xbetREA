package a;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kul0 {
    public static final mfn p = new mfn(1);
    public static final mfn q = new mfn(2);
    public static final mfn r = new mfn(3);
    public static final mfn s = new mfn(4);
    public static final mfn t = new mfn(5);
    public static final mfn u = new mfn(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18916a;
    public float b;
    public boolean c;
    public final Object d;
    public final zjb e;
    public boolean f;
    public final float g;
    public final float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public lul0 m;
    public float n;
    public boolean o;

    public kul0(Object obj, zjb zjbVar) {
        this.f18916a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = zjbVar;
        if (zjbVar == r || zjbVar == s || zjbVar == t) {
            this.j = 0.1f;
        } else if (zjbVar == u) {
            this.j = 0.00390625f;
        } else if (zjbVar == p || zjbVar == q) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [a.c73, java.lang.Object] */
    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        lul0 lul0Var = this.m;
        if (lul0Var == null) {
            lul0Var = new lul0(f);
            this.m = lul0Var;
        }
        double d = f;
        lul0Var.i = d;
        double d2 = (float) d;
        float f2 = this.g;
        if (d2 > f2) {
            v4i0.p("Final position of the spring cannot be greater than the max value.");
            return;
        }
        float f3 = this.h;
        if (d2 < f3) {
            v4i0.p("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.j * 0.75f);
        lul0Var.d = dAbs;
        lul0Var.e = dAbs * 62.5d;
        if (Thread.currentThread() != ((Looper) e73.a().e.b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.I(this.d);
        }
        float f4 = this.b;
        if (f4 > f2 || f4 < f3) {
            jf4.o("Starting value need to be in between min value and max value");
            return;
        }
        e73 e73VarA = e73.a();
        ArrayList arrayList = e73VarA.b;
        if (arrayList.size() == 0) {
            ((Choreographer) e73VarA.e.f40764a).postFrameCallback(new d73(e73VarA.d, (byte) 0));
            if (Build.VERSION.SDK_INT >= 33) {
                e73VarA.g = ValueAnimator.getDurationScale();
                final c5k c5kVar = e73VarA.h;
                if (c5kVar == null) {
                    c5kVar = new c5k();
                    c5kVar.b = e73VarA;
                    e73VarA.h = c5kVar;
                }
                if (((c73) c5kVar.f3775a) == null) {
                    ?? r7 = new ValueAnimator.DurationScaleChangeListener() { // from class: a.c73
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f5) {
                            ((e73) c5kVar.b).g = f5;
                        }
                    };
                    c5kVar.f3775a = r7;
                    ValueAnimator.registerDurationScaleChangeListener(r7);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void b(float f) {
        if (f > 0.0f) {
            this.j = f;
        } else {
            jf4.o("Minimum visible change must be positive.");
        }
    }

    public final void c(float f) {
        ArrayList arrayList;
        this.e.M(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((ofn) arrayList.get(i)).h(this.b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d() {
        if (this.m.b <= 0.0d) {
            v4i0.p("Spring animations can only come to an end when there is damping");
            return;
        }
        if (Thread.currentThread() != ((Looper) e73.a().e.b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.o = true;
        }
    }

    public kul0(hgn hgnVar) {
        this.f18916a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new nfn(hgnVar);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }
}
