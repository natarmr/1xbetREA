package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xfs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40807a;
    public final byte b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final double h;
    public final String i;
    public final double j;
    public final double k;

    /* JADX WARN: Multi-variable type inference failed */
    public xfs0(double d, double d2, double d3, int i, long j, long j2, String str, String str2, String str3, String str4, String str5) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f40807a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = j2;
        this.f = str3;
        this.g = str4;
        this.h = d;
        this.i = str5;
        this.j = d2;
        this.k = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfs0)) {
            return false;
        }
        xfs0 xfs0Var = (xfs0) obj;
        return this.f40807a == xfs0Var.f40807a && this.b == xfs0Var.b && Intrinsics.d(this.c, xfs0Var.c) && Intrinsics.d(this.d, xfs0Var.d) && this.e == xfs0Var.e && Intrinsics.d(this.f, xfs0Var.f) && Intrinsics.d(this.g, xfs0Var.g) && Double.compare(this.h, xfs0Var.h) == 0 && Intrinsics.d(this.i, xfs0Var.i) && Double.compare(this.j, xfs0Var.j) == 0 && Double.compare(this.k, xfs0Var.k) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.k) + brm0.d(this.j, ua80.b(brm0.d(this.h, ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(twn.a(this.b, Long.hashCode(this.f40807a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f40807a, "TransactionItem(balanceId=", ", betHistoryTypeId=");
        f140.v(sbQ, ", betId=", this.c, ", autoBetId=", this.d);
        kng0.A(sbQ, ", date=", this.e, ", couponTypeName=");
        f140.v(sbQ, this.f, ", coefficientString=", this.g, ", betSum=");
        hne.w(sbQ, this.h, ", currencySymbol=", this.i);
        ohs0.A(sbQ, this.j, ", saleSum=", ", outSum=");
        return axq.l(sbQ, this.k, Separators.RPAREN);
    }
}
