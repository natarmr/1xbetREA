package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16414a;
    public final float b;

    public jfa(float f, float f2, float f3) {
        this.f16414a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jfa)) {
            return false;
        }
        jfa jfaVar = (jfa) obj;
        return ycl.b(this.f16414a, jfaVar.f16414a) && ycl.b(0.0f, 0.0f) && ycl.b(0.0f, 0.0f) && ycl.b(this.b, jfaVar.b) && ycl.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(this.f16414a) * 31, 0.0f, 31), 0.0f, 31), this.b, 31);
    }
}
