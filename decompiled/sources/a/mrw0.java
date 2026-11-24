package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class mrw0 extends sqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22292a;
    public final int b;
    public final int c;
    public final p50 d;

    public mrw0(int i, int i2, int i3, p50 p50Var) {
        this.f22292a = i;
        this.b = i2;
        this.c = i3;
        this.d = p50Var;
    }

    public static h0q0 b() {
        h0q0 h0q0Var = new h0q0();
        h0q0Var.f12247a = null;
        h0q0Var.b = null;
        h0q0Var.c = null;
        h0q0Var.d = p50.k;
        return h0q0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.d != p50.k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mrw0)) {
            return false;
        }
        mrw0 mrw0Var = (mrw0) obj;
        return mrw0Var.f22292a == this.f22292a && mrw0Var.b == this.b && mrw0Var.c == this.c && mrw0Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(mrw0.class, Integer.valueOf(this.f22292a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        return w6x.o(this.c, this.f22292a, "-byte tag, and ", "-byte key)", kng0.p(this.b, "AesGcm Parameters (variant: ", String.valueOf(this.d), ", ", "-byte IV, "));
    }
}
