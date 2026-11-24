package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rp10 {
    public static final qp10 Companion = new qp10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30865a;
    public final long b;
    public final long c;
    public final int d;
    public final boolean e;
    public final double f;

    public /* synthetic */ rp10(int i, long j, long j2, long j3, int i2, boolean z, double d) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, pp10.f27354a.getDescriptor());
            throw null;
        }
        this.f30865a = j;
        this.b = j2;
        this.c = j3;
        this.d = i2;
        this.e = z;
        this.f = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp10)) {
            return false;
        }
        rp10 rp10Var = (rp10) obj;
        return this.f30865a == rp10Var.f30865a && this.b == rp10Var.b && this.c == rp10Var.c && this.d == rp10Var.d && this.e == rp10Var.e && Double.compare(this.f, rp10Var.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + brm0.e(twn.a(this.d, rw2.b(rw2.b(Long.hashCode(this.f30865a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f30865a, "MailHistoryRequest(dateFrom=", ", dateTo=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", accountId=", this.c, ", cfView=");
        brm0.w(this.d, ", sortByDates=", ", timeZone=", sbQ, this.e);
        return axq.l(sbQ, this.f, Separators.RPAREN);
    }

    public rp10(long j, long j2, long j3, int i, double d) {
        this.f30865a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = false;
        this.f = d;
    }
}
