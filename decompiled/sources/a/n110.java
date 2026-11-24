package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n110 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22726a;
    public final long b;
    public final long c;
    public final o4i0 d;
    public final long e;
    public final List f;
    public final long g;
    public final boolean h;
    public final long i;
    public final boolean j;
    public final long k;

    public n110(int i, long j, long j2, o4i0 o4i0Var, long j3, List list, long j4, boolean z, long j5, boolean z2, long j6) {
        list.getClass();
        this.f22726a = i;
        this.b = j;
        this.c = j2;
        this.d = o4i0Var;
        this.e = j3;
        this.f = list;
        this.g = j4;
        this.h = z;
        this.i = j5;
        this.j = z2;
        this.k = j6;
    }

    public static n110 a(n110 n110Var, int i, long j, long j2, o4i0 o4i0Var, long j3, ArrayList arrayList, long j4, boolean z, long j5, boolean z2, long j6, int i2) {
        int i3 = (i2 & 1) != 0 ? n110Var.f22726a : i;
        long j7 = (i2 & 2) != 0 ? n110Var.b : j;
        n110Var.getClass();
        long j8 = (i2 & 8) != 0 ? n110Var.c : j2;
        o4i0 o4i0Var2 = (i2 & 16) != 0 ? n110Var.d : o4i0Var;
        long j9 = (i2 & 32) != 0 ? n110Var.e : j3;
        List list = (i2 & 64) != 0 ? n110Var.f : arrayList;
        long j10 = (i2 & 128) != 0 ? n110Var.g : j4;
        boolean z3 = (i2 & 256) != 0 ? n110Var.h : z;
        long j11 = (i2 & 512) != 0 ? n110Var.i : j5;
        int i4 = i3;
        boolean z4 = (i2 & 1024) != 0 ? n110Var.j : z2;
        long j12 = (i2 & 2048) != 0 ? n110Var.k : j6;
        n110Var.getClass();
        list.getClass();
        return new n110(i4, j7, j8, o4i0Var2, j9, list, j10, z3, j11, z4, j12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n110)) {
            return false;
        }
        n110 n110Var = (n110) obj;
        return this.f22726a == n110Var.f22726a && this.b == n110Var.b && this.c == n110Var.c && this.d.equals(n110Var.d) && this.e == n110Var.e && Intrinsics.d(this.f, n110Var.f) && this.g == n110Var.g && this.h == n110Var.h && this.i == n110Var.i && this.j == n110Var.j && this.k == n110Var.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + brm0.e(rw2.b(brm0.e(rw2.b(dw9.a(rw2.b((this.d.hashCode() + rw2.b(rw2.b(rw2.b(Integer.hashCode(this.f22726a) * 31, 31, this.b), 31, 3L), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f22726a, this.b, "LolPostGameSelectedStateModel(selectedTabMatchIndex=", ", statisticSelectedTabId=");
        kng0.A(sbQ, ", heroSelectedTabId=3, graphSelectedTabId=", this.c, ", selectedPlayers=");
        sbQ.append(this.d);
        sbQ.append(", bestHeroesSelectedTabId=");
        sbQ.append(this.e);
        sbQ.append(", expandedPlayers=");
        sbQ.append(this.f);
        sbQ.append(", lastMatchesSelectedTabId=");
        hne.t(this.g, ", lastMatchesFooterCollapsed=", sbQ, this.h);
        kng0.A(sbQ, ", futureGamesSelectedTabId=", this.i, ", futureGamesFooterCollapsed=");
        rw2.v(this.k, ", tournamentTableSelectedTabId=", sbQ, this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
