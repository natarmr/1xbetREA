package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class kbq {
    public static final jbq Companion = new jbq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18026a;
    public final long b;
    public final double c;
    public final long d;
    public final double e;
    public final long f;
    public final int g;
    public final long h;
    public final double i;
    public final int j;

    public /* synthetic */ kbq(int i, long j, long j2, double d, long j3, double d2, long j4, int i2, long j5, double d3, int i3) {
        if (1023 != (i & 1023)) {
            m2x.I(i, 1023, ibq.f14502a.getDescriptor());
            throw null;
        }
        this.f18026a = j;
        this.b = j2;
        this.c = d;
        this.d = j3;
        this.e = d2;
        this.f = j4;
        this.g = i2;
        this.h = j5;
        this.i = d3;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbq)) {
            return false;
        }
        kbq kbqVar = (kbq) obj;
        return this.f18026a == kbqVar.f18026a && this.b == kbqVar.b && Double.compare(this.c, kbqVar.c) == 0 && this.d == kbqVar.d && Double.compare(this.e, kbqVar.e) == 0 && this.f == kbqVar.f && this.g == kbqVar.g && this.h == kbqVar.h && Double.compare(this.i, kbqVar.i) == 0 && this.j == kbqVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + brm0.d(this.i, rw2.b(twn.a(this.g, rw2.b(brm0.d(this.e, rw2.b(brm0.d(this.c, rw2.b(Long.hashCode(this.f18026a) * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f18026a, "FinanceBetDataRequest(seconds=", ", expired=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", coef=", ", instrumentId=");
        sbQ.append(this.d);
        ohs0.A(sbQ, this.e, ", price=", ", gameId=");
        ua80.v(sbQ, this.f, ", type=", this.g);
        kng0.A(sbQ, ", kind=", this.h, ", param=");
        rz4.w(sbQ, this.i, ", playerId=", this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public kbq(long j, long j2, double d, long j3, double d2, long j4, int i) {
        this.f18026a = j;
        this.b = j2;
        this.c = d;
        this.d = j3;
        this.e = d2;
        this.f = j4;
        this.g = i;
        this.h = 6L;
        this.i = 0.0d;
        this.j = 0;
    }
}
