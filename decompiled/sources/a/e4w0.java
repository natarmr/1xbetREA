package a;

/* JADX INFO: loaded from: classes.dex */
public final class e4w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7204a;
    public final float b;
    public final float c;

    public e4w0(float f, float f2, float f3) {
        this.f7204a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4w0)) {
            return false;
        }
        e4w0 e4w0Var = (e4w0) obj;
        return Float.compare(this.f7204a, e4w0Var.f7204a) == 0 && Float.compare(this.b, e4w0Var.b) == 0 && Float.compare(this.c, e4w0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(Float.hashCode(this.f7204a) * 31, this.b, 31);
    }

    public final String toString() {
        return "ZoomValue(zoomRatio=" + this.f7204a + ", minZoomRatio=" + this.b + ", maxZoomRatio=" + this.c + ')';
    }
}
