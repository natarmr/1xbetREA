package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p8x0 extends j1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26582a;
    public final int b;
    public final arw0 c;
    public final o8x0 d;

    public p8x0(int i, int i2, arw0 arw0Var, o8x0 o8x0Var) {
        this.f26582a = i;
        this.b = i2;
        this.c = arw0Var;
        this.d = o8x0Var;
    }

    public static h0q0 b() {
        h0q0 h0q0Var = new h0q0();
        h0q0Var.f12247a = null;
        h0q0Var.b = null;
        h0q0Var.c = null;
        h0q0Var.d = arw0.k;
        return h0q0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.c != arw0.k;
    }

    public final int c() {
        arw0 arw0Var = arw0.k;
        int i = this.b;
        arw0 arw0Var2 = this.c;
        if (arw0Var2 == arw0Var) {
            return i;
        }
        if (arw0Var2 == arw0.h) {
            return i + 5;
        }
        if (arw0Var2 == arw0.i) {
            return i + 5;
        }
        if (arw0Var2 == arw0.j) {
            return i + 5;
        }
        jf4.n("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p8x0)) {
            return false;
        }
        p8x0 p8x0Var = (p8x0) obj;
        return p8x0Var.f26582a == this.f26582a && p8x0Var.c() == c() && p8x0Var.c == this.c && p8x0Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(p8x0.class, Integer.valueOf(this.f26582a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        return w6x.o(this.b, this.f26582a, "-byte tags, and ", "-byte key)", b1j.n("HMAC Parameters (variant: ", String.valueOf(this.c), ", hashType: ", String.valueOf(this.d), ", "));
    }
}
