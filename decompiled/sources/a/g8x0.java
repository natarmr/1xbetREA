package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g8x0 extends j1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10885a;
    public final int b;
    public final hbb c;

    public g8x0(int i, int i2, hbb hbbVar) {
        this.f10885a = i;
        this.b = i2;
        this.c = hbbVar;
    }

    public static x4w0 b() {
        x4w0 x4w0Var = new x4w0();
        x4w0Var.f40287a = null;
        x4w0Var.b = null;
        x4w0Var.c = hbb.s;
        return x4w0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.c != hbb.s;
    }

    public final int c() {
        hbb hbbVar = hbb.s;
        int i = this.b;
        hbb hbbVar2 = this.c;
        if (hbbVar2 == hbbVar) {
            return i;
        }
        if (hbbVar2 == hbb.p) {
            return i + 5;
        }
        if (hbbVar2 == hbb.q) {
            return i + 5;
        }
        if (hbbVar2 == hbb.r) {
            return i + 5;
        }
        jf4.n("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g8x0)) {
            return false;
        }
        g8x0 g8x0Var = (g8x0) obj;
        return g8x0Var.f10885a == this.f10885a && g8x0Var.c() == c() && g8x0Var.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(g8x0.class, Integer.valueOf(this.f10885a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        return rz4.j(this.f10885a, "-byte key)", kng0.p(this.b, "AES-CMAC Parameters (variant: ", String.valueOf(this.c), ", ", "-byte tags, and "));
    }
}
