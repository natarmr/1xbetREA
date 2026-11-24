package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class brw0 extends sqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3100a;
    public final int b;
    public final int c;
    public final int d;
    public final arw0 e;
    public final fhn f;

    public brw0(int i, int i2, int i3, int i4, arw0 arw0Var, fhn fhnVar) {
        this.f3100a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = arw0Var;
        this.f = fhnVar;
    }

    public static zcw0 b() {
        zcw0 zcw0Var = new zcw0();
        zcw0Var.f44186a = null;
        zcw0Var.b = null;
        zcw0Var.c = null;
        zcw0Var.d = null;
        zcw0Var.e = null;
        zcw0Var.f = arw0.e;
        return zcw0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.e != arw0.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof brw0)) {
            return false;
        }
        brw0 brw0Var = (brw0) obj;
        return brw0Var.f3100a == this.f3100a && brw0Var.b == this.b && brw0Var.c == this.c && brw0Var.d == this.d && brw0Var.e == this.e && brw0Var.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(brw0.class, Integer.valueOf(this.f3100a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.e), ", hashType: ", String.valueOf(this.f), ", ");
        axq.r(this.c, this.d, "-byte IV, and ", "-byte tags, and ", sbN);
        return w6x.o(this.f3100a, this.b, "-byte AES key, and ", "-byte HMAC key)", sbN);
    }
}
