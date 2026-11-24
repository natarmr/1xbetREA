package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jrw0 extends sqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17024a;
    public final int b;
    public final int c;
    public final drq d;

    public jrw0(int i, int i2, int i3, drq drqVar) {
        this.f17024a = i;
        this.b = i2;
        this.c = i3;
        this.d = drqVar;
    }

    public static fht0 b() {
        fht0 fht0Var = new fht0();
        fht0Var.f9559a = null;
        fht0Var.b = null;
        fht0Var.c = null;
        fht0Var.d = drq.g;
        return fht0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.d != drq.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jrw0)) {
            return false;
        }
        jrw0 jrw0Var = (jrw0) obj;
        return jrw0Var.f17024a == this.f17024a && jrw0Var.b == this.b && jrw0Var.c == this.c && jrw0Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(jrw0.class, Integer.valueOf(this.f17024a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        return w6x.o(this.c, this.f17024a, "-byte tag, and ", "-byte key)", kng0.p(this.b, "AesEax Parameters (variant: ", String.valueOf(this.d), ", ", "-byte IV, "));
    }
}
