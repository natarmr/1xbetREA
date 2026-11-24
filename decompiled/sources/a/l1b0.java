package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l1b0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19243a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final pgb i;
    public final String j;
    public final boolean k;
    public final int l;
    public final long m;

    public l1b0(long j, long j2, long j3, long j4, String str, String str2, boolean z, boolean z2, pgb pgbVar, String str3, boolean z3, int i, long j5) {
        str.getClass();
        str2.getClass();
        pgbVar.getClass();
        this.f19243a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = pgbVar;
        this.j = str3;
        this.k = z3;
        this.l = i;
        this.m = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1b0)) {
            return false;
        }
        l1b0 l1b0Var = (l1b0) obj;
        return this.f19243a == l1b0Var.f19243a && this.b == l1b0Var.b && this.c == l1b0Var.c && this.d == l1b0Var.d && Intrinsics.d(this.e, l1b0Var.e) && Intrinsics.d(this.f, l1b0Var.f) && this.g == l1b0Var.g && this.h == l1b0Var.h && this.i == l1b0Var.i && this.j.equals(l1b0Var.j) && this.k == l1b0Var.k && this.l == l1b0Var.l && this.m == l1b0Var.m;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof l1b0) && (p6t0Var2 instanceof l1b0) && ((l1b0) p6t0Var).f19243a == ((l1b0) p6t0Var2).f19243a;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + twn.a(this.l, brm0.e(ua80.b((this.i.hashCode() + brm0.e(brm0.e(ua80.b(ua80.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f19243a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof l1b0) || !(p6t0Var2 instanceof l1b0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        l1b0 l1b0Var = (l1b0) p6t0Var;
        l1b0 l1b0Var2 = (l1b0) p6t0Var2;
        if (l1b0Var.g != l1b0Var2.g) {
            arrayList.add(j1b0.f15726a);
        }
        if (l1b0Var.i != l1b0Var2.i) {
            arrayList.add(k1b0.f17514a);
        }
        if (l1b0Var.l != l1b0Var2.l) {
            arrayList.add(i1b0.f13990a);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f19243a, "PopularChampUiModel(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", globalChampId=");
        kng0.z(sbQ, this.d, ", champName=", this.e);
        w6x.z(", champLogo=", this.f, ", favorite=", sbQ, this.g);
        sbQ.append(", isBettingDisabled=");
        sbQ.append(this.h);
        sbQ.append(", champType=");
        sbQ.append(this.i);
        w6x.z(", sportLogo=", this.j, ", live=", sbQ, this.k);
        rw2.x(sbQ, ", countGames=", this.l, ", firstGameId=");
        return brm0.k(this.m, Separators.RPAREN, sbQ);
    }
}
