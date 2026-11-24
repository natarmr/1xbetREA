package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class pcq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bnz f26772a;
    public final xrz b;
    public final String c;
    public final double d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final krz h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final boolean n;
    public final long o;
    public final long p;
    public final List q;
    public final sl r;
    public final boolean s;

    public pcq(bnz bnzVar, xrz xrzVar, String str, double d, boolean z, boolean z2, boolean z3, krz krzVar, long j, long j2, long j3, long j4, long j5, boolean z4, long j6, long j7, List list, sl slVar, boolean z5) {
        bnzVar.getClass();
        str.getClass();
        list.getClass();
        this.f26772a = bnzVar;
        this.b = xrzVar;
        this.c = str;
        this.d = d;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = krzVar;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = j5;
        this.n = z4;
        this.o = j6;
        this.p = j7;
        this.q = list;
        this.r = slVar;
        this.s = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcq)) {
            return false;
        }
        pcq pcqVar = (pcq) obj;
        return this.f26772a == pcqVar.f26772a && this.b.equals(pcqVar.b) && Intrinsics.d(this.c, pcqVar.c) && Double.compare(this.d, pcqVar.d) == 0 && this.e == pcqVar.e && this.f == pcqVar.f && this.g == pcqVar.g && this.h == pcqVar.h && this.i == pcqVar.i && this.j == pcqVar.j && this.k == pcqVar.k && this.l == pcqVar.l && this.m == pcqVar.m && this.n == pcqVar.n && this.o == pcqVar.o && this.p == pcqVar.p && Intrinsics.d(this.q, pcqVar.q) && Intrinsics.d(this.r, pcqVar.r) && this.s == pcqVar.s;
    }

    public final int hashCode() {
        int iA = dw9.a(rw2.b(rw2.b(brm0.e(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b((this.h.hashCode() + brm0.e(brm0.e(brm0.e(brm0.d(this.d, ua80.b((this.b.hashCode() + (this.f26772a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
        sl slVar = this.r;
        return Boolean.hashCode(this.s) + ((iA + (slVar == null ? 0 : slVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinancialLimitModel(group=");
        sb.append(this.f26772a);
        sb.append(", limitType=");
        sb.append(this.b);
        sb.append(", currency=");
        hne.A(sb, this.c, ", limitBalance=", this.d);
        w6x.A(", freeValue=", ", changeAvailable=", sb, this.e, this.f);
        sb.append(", deleteAvailable=");
        sb.append(this.g);
        sb.append(", limitState=");
        sb.append(this.h);
        kng0.A(sb, ", startedAt=", this.i, ", endsAt=");
        sb.append(this.j);
        kng0.A(sb, ", expiresAt=", this.k, ", createdAt=");
        sb.append(this.l);
        kng0.A(sb, ", limitValue=", this.m, ", needApprove=");
        rw2.v(this.o, ", pendingValue=", sb, this.n);
        kng0.A(sb, ", pendingEndsAt=", this.p, ", availableValueModels=");
        sb.append(this.q);
        sb.append(", activeLimitValue=");
        sb.append(this.r);
        sb.append(", setWithoutValue=");
        return rw2.p(sb, this.s, Separators.RPAREN);
    }
}
