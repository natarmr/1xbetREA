package a;

/* JADX INFO: loaded from: classes.dex */
public final class slq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f32412a;
    public final float b;
    public final float c;
    public final float d;

    public slq(float f, float f2, float f3, float f4) {
        this.f32412a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof slq)) {
            return false;
        }
        slq slqVar = (slq) obj;
        if (ycl.b(this.f32412a, slqVar.f32412a) && ycl.b(this.b, slqVar.b) && ycl.b(this.c, slqVar.c)) {
            return ycl.b(this.d, slqVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f32412a) * 31, this.b, 31), this.c, 31);
    }
}
