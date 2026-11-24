package a;

/* JADX INFO: loaded from: classes.dex */
public final class bv40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3264a;
    public final int b;
    public final float c;

    public bv40(int i, float f, int i2) {
        this.f3264a = i;
        this.b = i2;
        this.c = f;
    }

    public static bv40 a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new bv40(i2, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bv40)) {
            return false;
        }
        bv40 bv40Var = (bv40) obj;
        return this.f3264a == bv40Var.f3264a && this.b == bv40Var.b && Float.compare(this.c, bv40Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.f3264a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f3264a + ", originator=" + this.b + ", gain=" + this.c + '}';
    }
}
