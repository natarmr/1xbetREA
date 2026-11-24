package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nb9 {
    public static final mb9 Companion = new mb9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23229a;
    public final int b;
    public final int c;

    public /* synthetic */ nb9(int i, int i2, int i3, int i4) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, lb9.f19743a.getDescriptor());
            throw null;
        }
        this.f23229a = i2;
        this.b = i3;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb9)) {
            return false;
        }
        nb9 nb9Var = (nb9) obj;
        return this.f23229a == nb9Var.f23229a && this.b == nb9Var.b && this.c == nb9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f23229a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("BuilderCouponGameKeyRequest(gameType=", this.f23229a, ", period=", ", gameVid=", this.b));
    }

    public nb9(int i, int i2, int i3) {
        this.f23229a = i;
        this.b = i2;
        this.c = i3;
    }
}
