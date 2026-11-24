package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ixd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4i0 f15537a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;

    public ixd0(long j, long j2, long j3, o4i0 o4i0Var, boolean z) {
        this.f15537a = o4i0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
    }

    public static ixd0 a(ixd0 ixd0Var, o4i0 o4i0Var, long j, long j2, long j3, boolean z, int i) {
        if ((i & 1) != 0) {
            o4i0Var = ixd0Var.f15537a;
        }
        o4i0 o4i0Var2 = o4i0Var;
        if ((i & 2) != 0) {
            j = ixd0Var.b;
        }
        long j4 = j;
        if ((i & 4) != 0) {
            j2 = ixd0Var.c;
        }
        return new ixd0(j4, j2, (i & 8) != 0 ? ixd0Var.d : j3, o4i0Var2, (i & 16) != 0 ? ixd0Var.e : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixd0)) {
            return false;
        }
        ixd0 ixd0Var = (ixd0) obj;
        return this.f15537a.equals(ixd0Var.f15537a) && this.b == ixd0Var.b && this.c == ixd0Var.c && this.d == ixd0Var.d && this.e == ixd0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.b(rw2.b(rw2.b(this.f15537a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RainbowSelectedStateModel(selectedPlayers=");
        sb.append(this.f15537a);
        sb.append(", selectedBanStatisticsTabId=");
        sb.append(this.b);
        kng0.A(sb, ", selectedBansTabId=", this.c, ", selectedLastMatchesTabId=");
        hne.t(this.d, ", lastMatchesFooterCollapsed=", sb, this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
