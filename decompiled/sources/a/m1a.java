package a;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class m1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hbi f20997a;
    public final int b;
    public final Object c;
    public boolean d;

    public m1a(hbi hbiVar) {
        this.f20997a = hbiVar;
        z04 z04Var = o1a.f24470a;
        z04Var.getClass();
        this.b = z04.b.incrementAndGet(z04Var);
        this.c = new Object();
    }

    public final j3a a() {
        j3a j3aVar;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("Check failed.");
            }
            j3aVar = (j3a) ((n5d0) this.f20997a.y).get();
        }
        return j3aVar;
    }

    public final zy9 b() {
        zy9 zy9Var;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("Check failed.");
            }
            zy9Var = (zy9) ((n5d0) this.f20997a.w).get();
        }
        return zy9Var;
    }

    public final b0a c(tz9 tz9Var, zz9 zz9Var) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) g0a.b(tz9Var.f34794a)));
            return (b0a) ((n5d0) new gbi((hbi) this.f20997a.d, new xex(tz9Var, zz9Var)).p).get();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "CameraPipe-" + this.b;
    }
}
