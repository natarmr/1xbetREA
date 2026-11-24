package a;

/* JADX INFO: loaded from: classes.dex */
public final class gdk0 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11108a;
    public final int b;

    public gdk0(float f, int i) {
        this.f11108a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gdk0.class == obj.getClass()) {
            gdk0 gdk0Var = (gdk0) obj;
            if (this.f11108a == gdk0Var.f11108a && this.b == gdk0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return defpackage.c.a(527, this.f11108a, 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f11108a + ", svcTemporalLayerCount=" + this.b;
    }
}
