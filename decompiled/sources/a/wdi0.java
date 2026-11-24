package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wdi0 {
    public static final vdi0 Companion = new vdi0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38976a;
    public final long b;
    public final long c;
    public final int d;
    public final boolean e;
    public final double f;

    public /* synthetic */ wdi0(int i, long j, long j2, long j3, int i2, boolean z, double d) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, udi0.f35480a.getDescriptor());
            throw null;
        }
        this.f38976a = j;
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
        if (!(obj instanceof wdi0)) {
            return false;
        }
        wdi0 wdi0Var = (wdi0) obj;
        return this.f38976a == wdi0Var.f38976a && this.b == wdi0Var.b && this.c == wdi0Var.c && this.d == wdi0Var.d && this.e == wdi0Var.e && Double.compare(this.f, wdi0Var.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + brm0.e(twn.a(this.d, rw2.b(rw2.b(Long.hashCode(this.f38976a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f38976a, "SendHistoryRequest(dateFrom=", ", dateTo=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", accountId=", this.c, ", cfView=");
        brm0.w(this.d, ", sortByDates=", ", timeZone=", sbQ, this.e);
        return axq.l(sbQ, this.f, Separators.RPAREN);
    }

    public wdi0(long j, long j2, long j3, int i, double d) {
        this.f38976a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = false;
        this.f = d;
    }
}
