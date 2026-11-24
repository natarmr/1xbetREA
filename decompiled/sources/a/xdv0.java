package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xdv0 implements pev0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40715a;
    public final long b;
    public final long c;
    public final Long d;
    public final boolean e;
    public final long f;
    public final String g;
    public final long h;
    public final unp0 i;
    public final unp0 j;
    public final String k;
    public final boolean l;
    public final Long m;

    public xdv0(long j, long j2, long j3, Long l, boolean z, long j4, String str, long j5, unp0 unp0Var, unp0 unp0Var2, String str2, boolean z2, Long l2) {
        str.getClass();
        str2.getClass();
        this.f40715a = j;
        this.b = j2;
        this.c = j3;
        this.d = l;
        this.e = z;
        this.f = j4;
        this.g = str;
        this.h = j5;
        this.i = unp0Var;
        this.j = unp0Var2;
        this.k = str2;
        this.l = z2;
        this.m = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdv0)) {
            return false;
        }
        xdv0 xdv0Var = (xdv0) obj;
        return this.f40715a == xdv0Var.f40715a && this.b == xdv0Var.b && this.c == xdv0Var.c && Intrinsics.d(this.d, xdv0Var.d) && this.e == xdv0Var.e && this.f == xdv0Var.f && Intrinsics.d(this.g, xdv0Var.g) && this.h == xdv0Var.h && this.i.equals(xdv0Var.i) && this.j.equals(xdv0Var.j) && Intrinsics.d(this.k, xdv0Var.k) && this.l == xdv0Var.l && Intrinsics.d(this.m, xdv0Var.m);
    }

    public final int hashCode() {
        int iB = rw2.b(rw2.b(Long.hashCode(this.f40715a) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int iE = brm0.e(ua80.b((this.j.hashCode() + ((this.i.hashCode() + rw2.b(ua80.b(rw2.b(brm0.e((iB + (l == null ? 0 : l.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31, 31, this.k), 31, this.l);
        Long l2 = this.m;
        return iE + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f40715a, "WidgetGameUIModel(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", subGameId=");
        sbQ.append(this.d);
        sbQ.append(", live=");
        sbQ.append(this.e);
        sbQ.append(", iconTitle=");
        kng0.z(sbQ, this.f, ", categoryGame=", this.g);
        kng0.A(sbQ, ", championShipId=", this.h, ", teamOne=");
        sbQ.append(this.i);
        sbQ.append(", teamTwo=");
        sbQ.append(this.j);
        sbQ.append(", score=");
        brm0.C(this.k, ", favorite=", ", startDate=", sbQ, this.l);
        return ohs0.r(sbQ, this.m, Separators.RPAREN);
    }
}
