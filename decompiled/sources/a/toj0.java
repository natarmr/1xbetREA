package a;

/* JADX INFO: loaded from: classes.dex */
public final class toj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f34287a;
    public final pz40 b;
    public final sd60 c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public long h;
    public long i;
    public i6u0 j;

    public toj0() {
        Boolean bool = Boolean.FALSE;
        this.f34287a = androidx.compose.runtime.e.e(bool);
        this.b = androidx.compose.runtime.e.e(bool);
        this.c = new sd60((byte) 9);
        qlq0.f28947a.getClass();
        rq40.f30914a.getClass();
        this.d = rq40.b();
        this.e = y3d.f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = ils0.b;
        this.i = 0L;
    }

    public final boolean a() {
        return ((Boolean) ((hgk0) this.b).getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) ((hgk0) this.f34287a).getValue()).booleanValue();
    }

    public final void c(boolean z) {
        hgk0 hgk0Var = (hgk0) this.f34287a;
        boolean zBooleanValue = ((Boolean) hgk0Var.getValue()).booleanValue();
        pz40 pz40Var = this.b;
        if (zBooleanValue && !z) {
            ((hgk0) pz40Var).setValue(Boolean.TRUE);
        } else if (z) {
            ((hgk0) pz40Var).setValue(Boolean.FALSE);
        }
        hgk0Var.setValue(Boolean.valueOf(z));
    }
}
