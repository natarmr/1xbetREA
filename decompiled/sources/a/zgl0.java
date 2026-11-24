package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zgl0 implements ahl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44350a;
    public final long b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zgl0() {
        this(s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getTextPrimary());
        pz40 pz40Var = s6t0.f31722a;
    }

    @Override // a.ahl0
    public final long a() {
        return this.b;
    }

    @Override // a.ahl0
    public final long b() {
        return this.f44350a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgl0)) {
            return false;
        }
        zgl0 zgl0Var = (zgl0) obj;
        long j = zgl0Var.f44350a;
        int i = y3d.h;
        return h2t0.a(this.f44350a, j) && h2t0.a(this.b, zgl0Var.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f44350a) * 31);
    }

    public final String toString() {
        return b1j.k("Theme(marketLabelColor=", y3d.i(this.f44350a), ", coefficientLabelColor=", y3d.i(this.b), Separators.RPAREN);
    }

    public zgl0(long j, long j2) {
        this.f44350a = j;
        this.b = j2;
    }
}
