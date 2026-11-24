package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qcq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bnz f28495a;
    public final xrz b;
    public final String c;
    public final double d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final lrz h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final double m;
    public final boolean n;
    public final double o;
    public final long p;
    public final List q;
    public final tl r;
    public final boolean s;

    public qcq(bnz bnzVar, xrz xrzVar, String str, double d, boolean z, boolean z2, boolean z3, lrz lrzVar, long j, long j2, long j3, long j4, double d2, boolean z4, double d3, long j5, List list, tl tlVar, boolean z5) {
        bnzVar.getClass();
        str.getClass();
        list.getClass();
        this.f28495a = bnzVar;
        this.b = xrzVar;
        this.c = str;
        this.d = d;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = lrzVar;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = d2;
        this.n = z4;
        this.o = d3;
        this.p = j5;
        this.q = list;
        this.r = tlVar;
        this.s = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcq)) {
            return false;
        }
        qcq qcqVar = (qcq) obj;
        return this.f28495a == qcqVar.f28495a && this.b.equals(qcqVar.b) && Intrinsics.d(this.c, qcqVar.c) && Double.compare(this.d, qcqVar.d) == 0 && this.e == qcqVar.e && this.f == qcqVar.f && this.g == qcqVar.g && this.h == qcqVar.h && this.i == qcqVar.i && this.j == qcqVar.j && this.k == qcqVar.k && this.l == qcqVar.l && Double.compare(this.m, qcqVar.m) == 0 && this.n == qcqVar.n && Double.compare(this.o, qcqVar.o) == 0 && this.p == qcqVar.p && Intrinsics.d(this.q, qcqVar.q) && Intrinsics.d(this.r, qcqVar.r) && this.s == qcqVar.s;
    }

    public final int hashCode() {
        int iA = dw9.a(rw2.b(brm0.d(this.o, brm0.e(brm0.d(this.m, rw2.b(rw2.b(rw2.b(rw2.b((this.h.hashCode() + brm0.e(brm0.e(brm0.e(brm0.d(this.d, ua80.b((this.b.hashCode() + (this.f28495a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n), 31), 31, this.p), 31, this.q);
        tl tlVar = this.r;
        return Boolean.hashCode(this.s) + ((iA + (tlVar == null ? 0 : tlVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinancialLimitModel(group=");
        sb.append(this.f28495a);
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
        ohs0.A(sb, this.m, ", limitValue=", ", needApprove=");
        sb.append(this.n);
        sb.append(", pendingValue=");
        sb.append(this.o);
        kng0.A(sb, ", pendingEndsAt=", this.p, ", availableValueModels=");
        sb.append(this.q);
        sb.append(", activeLimitValue=");
        sb.append(this.r);
        sb.append(", setWithoutValue=");
        return rw2.p(sb, this.s, Separators.RPAREN);
    }
}
