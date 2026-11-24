package a;

/* JADX INFO: loaded from: classes6.dex */
public final class je9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16362a;

    public je9(float f) {
        this.f16362a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof je9)) {
            return false;
        }
        return ycl.b(0.0f, 0.0f) && ycl.b(0.0f, 0.0f) && ycl.b(0.0f, 0.0f) && ycl.b(this.f16362a, ((je9) obj).f16362a) && ycl.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31), this.f16362a, 31);
    }
}
