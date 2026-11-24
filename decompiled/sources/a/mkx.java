package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class mkx {
    public static final mkx e = new mkx(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21964a;
    public final int b;
    public final int c;
    public final int d;

    public mkx(int i, int i2, int i3, int i4) {
        this.f21964a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final long b() {
        return (((long) this.f21964a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkx)) {
            return false;
        }
        mkx mkxVar = (mkx) obj;
        return this.f21964a == mkxVar.f21964a && this.b == mkxVar.b && this.c == mkxVar.c && this.d == mkxVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f21964a) * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", ", Separators.RPAREN, dw9.t("IntRect.fromLTRB(", this.f21964a, ", ", ", ", this.b));
    }
}
