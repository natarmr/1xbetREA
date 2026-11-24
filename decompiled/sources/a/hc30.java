package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hc30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12801a;
    public final zdm0 b;
    public final nc5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final long i;

    public hc30(long j, zdm0 zdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, boolean z4, List list, long j2) {
        list.getClass();
        this.f12801a = j;
        this.b = zdm0Var;
        this.c = nc5Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = list;
        this.i = j2;
    }

    public static hc30 a(hc30 hc30Var, zdm0 zdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, boolean z4, List list, long j, int i) {
        long j2 = hc30Var.f12801a;
        if ((i & 2) != 0) {
            zdm0Var = hc30Var.b;
        }
        zdm0 zdm0Var2 = zdm0Var;
        if ((i & 4) != 0) {
            nc5Var = hc30Var.c;
        }
        nc5 nc5Var2 = nc5Var;
        boolean z5 = (i & 8) != 0 ? hc30Var.d : z;
        boolean z6 = (i & 16) != 0 ? hc30Var.e : z2;
        boolean z7 = (i & 32) != 0 ? hc30Var.f : z3;
        boolean z8 = (i & 64) != 0 ? hc30Var.g : z4;
        List list2 = (i & 128) != 0 ? hc30Var.h : list;
        long j3 = (i & 256) != 0 ? hc30Var.i : j;
        hc30Var.getClass();
        list2.getClass();
        return new hc30(j2, zdm0Var2, nc5Var2, z5, z6, z7, z8, list2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc30)) {
            return false;
        }
        hc30 hc30Var = (hc30) obj;
        return this.f12801a == hc30Var.f12801a && this.b.equals(hc30Var.b) && this.c.equals(hc30Var.c) && this.d == hc30Var.d && this.e == hc30Var.e && this.f == hc30Var.f && this.g == hc30Var.g && Intrinsics.d(this.h, hc30Var.h) && this.i == hc30Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + dw9.a(brm0.e(brm0.e(brm0.e(brm0.e((this.c.hashCode() + kng0.a(this.b, Long.hashCode(this.f12801a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchProgressCricketState(sportId=");
        sb.append(this.f12801a);
        sb.append(", statisticHeaderUiModel=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        w6x.A(", isLive=", ", isError=", sb, this.e, this.f);
        esw0.l(sb, ", isEmpty=", this.g, ", matchProgressList=", this.h);
        return rw2.n(sb, this.i, ", checkedChipsPosition=", Separators.RPAREN);
    }
}
