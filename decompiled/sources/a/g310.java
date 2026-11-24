package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10589a;
    public final long b;
    public final o4i0 c;
    public final long d;
    public final List e;
    public final long f;
    public final boolean g;

    public g310(long j, long j2, long j3, long j4, o4i0 o4i0Var, List list, boolean z) {
        list.getClass();
        this.f10589a = j;
        this.b = j2;
        this.c = o4i0Var;
        this.d = j3;
        this.e = list;
        this.f = j4;
        this.g = z;
    }

    public static g310 a(g310 g310Var, long j, long j2, o4i0 o4i0Var, long j3, ArrayList arrayList, long j4, boolean z, int i) {
        if ((i & 1) != 0) {
            j = g310Var.f10589a;
        }
        long j5 = j;
        long j6 = (i & 2) != 0 ? g310Var.b : j2;
        o4i0 o4i0Var2 = (i & 4) != 0 ? g310Var.c : o4i0Var;
        long j7 = (i & 8) != 0 ? g310Var.d : j3;
        List list = (i & 16) != 0 ? g310Var.e : arrayList;
        long j8 = (i & 32) != 0 ? g310Var.f : j4;
        boolean z2 = (i & 64) != 0 ? g310Var.g : z;
        list.getClass();
        return new g310(j5, j6, j7, j8, o4i0Var2, list, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g310)) {
            return false;
        }
        g310 g310Var = (g310) obj;
        return this.f10589a == g310Var.f10589a && this.b == g310Var.b && this.c.equals(g310Var.c) && this.d == g310Var.d && Intrinsics.d(this.e, g310Var.e) && this.f == g310Var.f && this.g == g310Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + brm0.e(rw2.b(dw9.a(rw2.b((this.c.hashCode() + rw2.b(Long.hashCode(this.f10589a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f10589a, "LolSelectedStateModel(statisticSelectedTabId=", ", heroSelectedTabId=");
        sbQ.append(this.b);
        sbQ.append(", selectedPlayers=");
        sbQ.append(this.c);
        kng0.A(sbQ, ", bestHeroesSelectedTabId=", this.d, ", expandedPlayers=");
        sbQ.append(this.e);
        sbQ.append(", lastMatchesSelectedTabId=");
        sbQ.append(this.f);
        return f140.n(sbQ, ", lastMatchesFooterCollapsed=", this.g, ", tournamentTableSelectedTabId=0)");
    }
}
