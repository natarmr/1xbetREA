package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n410 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22877a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final List q;
    public final List r;

    public n410(long j, long j2, String str, String str2, boolean z, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f22877a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = i8;
        this.o = i9;
        this.p = i10;
        this.q = list;
        this.r = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n410)) {
            return false;
        }
        n410 n410Var = (n410) obj;
        return this.f22877a == n410Var.f22877a && this.b == n410Var.b && this.c.equals(n410Var.c) && this.d.equals(n410Var.d) && this.e == n410Var.e && this.f.equals(n410Var.f) && this.g == n410Var.g && this.h == n410Var.h && this.i == n410Var.i && this.j == n410Var.j && this.k == n410Var.k && this.l == n410Var.l && this.m == n410Var.m && this.n == n410Var.n && this.o == n410Var.o && this.p == n410Var.p && Intrinsics.d(this.q, n410Var.q) && Intrinsics.d(this.r, n410Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + dw9.a(twn.a(this.p, twn.a(this.o, twn.a(this.n, twn.a(this.m, twn.a(this.l, twn.a(this.k, twn.a(this.j, twn.a(this.i, twn.a(this.h, twn.a(this.g, ua80.b(brm0.e(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f22877a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f22877a, "LolStatisticMatchesMatchTeamModel(id=", ", feedId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        w6x.z(", imageS3=", this.d, ", isWinner=", sbQ, this.e);
        axq.s(this.g, ", side=", this.f, ", kills=", sbQ);
        rw2.s(this.h, this.i, ", deaths=", ", assists=", sbQ);
        rw2.s(this.j, this.k, ", elderDrakeKills=", ", towerKills=", sbQ);
        rw2.s(this.l, this.m, ", inhibitorKills=", ", heraldKills=", sbQ);
        rw2.s(this.n, this.o, ", baronKills=", ", dragonKills=", sbQ);
        sbQ.append(", goldEarned=");
        sbQ.append(this.p);
        sbQ.append(", bans=");
        sbQ.append(this.q);
        return ohs0.s(sbQ, ", players=", this.r, Separators.RPAREN);
    }
}
