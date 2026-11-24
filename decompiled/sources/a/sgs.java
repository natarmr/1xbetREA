package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32177a;
    public final sip b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final int g;
    public final long h;

    public sgs(long j, sip sipVar, int i, boolean z, boolean z2, long j2, int i2, long j3) {
        sipVar.getClass();
        this.f32177a = j;
        this.b = sipVar;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = j2;
        this.g = i2;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgs)) {
            return false;
        }
        sgs sgsVar = (sgs) obj;
        return bds.a(this.f32177a, sgsVar.f32177a) && this.b == sgsVar.b && this.c == sgsVar.c && this.d == sgsVar.d && this.e == sgsVar.e && this.f == sgsVar.f && this.g == sgsVar.g && this.h == sgsVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + twn.a(this.g, rw2.b(brm0.e(brm0.e(twn.a(this.c, (this.b.hashCode() + (Long.hashCode(this.f32177a) * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        String strB = bds.b(this.f32177a);
        StringBuilder sb = new StringBuilder("GameInitParams(gameId=");
        sb.append(strB);
        sb.append(", feedKind=");
        sb.append(this.b);
        sb.append(", coefTypeId=");
        brm0.w(this.c, ", betTypeIsDecimal=", ", cutCoef=", sb, this.d);
        rw2.v(this.f, ", userId=", sb, this.e);
        rw2.x(sb, ", country=", this.g, ", sportId=");
        return brm0.k(this.h, Separators.RPAREN, sb);
    }
}
