package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vzt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4i0 f38314a;
    public final long b;
    public final long c;
    public final boolean d;

    public vzt0(o4i0 o4i0Var, long j, long j2, boolean z) {
        this.f38314a = o4i0Var;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public static vzt0 a(vzt0 vzt0Var, o4i0 o4i0Var, long j, long j2, boolean z, int i) {
        if ((i & 1) != 0) {
            o4i0Var = vzt0Var.f38314a;
        }
        o4i0 o4i0Var2 = o4i0Var;
        if ((i & 2) != 0) {
            j = vzt0Var.b;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = vzt0Var.c;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            z = vzt0Var.d;
        }
        return new vzt0(o4i0Var2, j3, j4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzt0)) {
            return false;
        }
        vzt0 vzt0Var = (vzt0) obj;
        return this.f38314a.equals(vzt0Var.f38314a) && this.b == vzt0Var.b && this.c == vzt0Var.c && this.d == vzt0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rw2.b(rw2.b(this.f38314a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValorantSelectedStateModel(selectedPlayers=");
        sb.append(this.f38314a);
        sb.append(", statisticTableSelectedTabId=");
        sb.append(this.b);
        kng0.A(sb, ", selectedLastMatchesTabId=", this.c, ", lastMatchesFooterCollapsed=");
        return rw2.p(sb, this.d, Separators.RPAREN);
    }
}
