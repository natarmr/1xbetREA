package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hd30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12851a;
    public final zdm0 b;
    public final nc5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final long j;

    public hd30(long j, zdm0 zdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, long j2) {
        list.getClass();
        this.f12851a = j;
        this.b = zdm0Var;
        this.c = nc5Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = list;
        this.j = j2;
    }

    public static hd30 a(hd30 hd30Var, zdm0 zdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, boolean z4, List list, long j, int i) {
        long j2 = hd30Var.f12851a;
        if ((i & 2) != 0) {
            zdm0Var = hd30Var.b;
        }
        zdm0 zdm0Var2 = zdm0Var;
        nc5 nc5Var2 = (i & 4) != 0 ? hd30Var.c : nc5Var;
        boolean z5 = (i & 8) != 0 ? hd30Var.d : z;
        boolean z6 = (i & 16) != 0 ? hd30Var.e : z2;
        boolean z7 = (i & 32) != 0 ? hd30Var.f : z3;
        boolean z8 = (i & 64) != 0 ? hd30Var.g : z4;
        boolean z9 = hd30Var.h;
        List list2 = (i & 256) != 0 ? hd30Var.i : list;
        long j3 = (i & 512) != 0 ? hd30Var.j : j;
        hd30Var.getClass();
        list2.getClass();
        return new hd30(j2, zdm0Var2, nc5Var2, z5, z6, z7, z8, z9, list2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd30)) {
            return false;
        }
        hd30 hd30Var = (hd30) obj;
        return this.f12851a == hd30Var.f12851a && this.b.equals(hd30Var.b) && this.c.equals(hd30Var.c) && this.d == hd30Var.d && this.e == hd30Var.e && this.f == hd30Var.f && this.g == hd30Var.g && this.h == hd30Var.h && Intrinsics.d(this.i, hd30Var.i) && this.j == hd30Var.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + dw9.a(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((this.c.hashCode() + kng0.a(this.b, Long.hashCode(this.f12851a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchProgressState(sportId=");
        sb.append(this.f12851a);
        sb.append(", statisticHeaderUiModel=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        w6x.A(", isLive=", ", isError=", sb, this.e, this.f);
        w6x.A(", isEmpty=", ", isShortStatistic=", sb, this.g, this.h);
        sb.append(", matchProgressList=");
        sb.append(this.i);
        sb.append(", checkedChipsPosition=");
        return brm0.k(this.j, Separators.RPAREN, sb);
    }
}
