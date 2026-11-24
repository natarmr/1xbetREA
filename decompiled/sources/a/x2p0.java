package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x2p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5l0 f40180a;
    public final boolean b;
    public final boolean c;

    public x2p0(v5l0 v5l0Var, boolean z, boolean z2) {
        this.f40180a = v5l0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2p0)) {
            return false;
        }
        x2p0 x2p0Var = (x2p0) obj;
        return this.f40180a == x2p0Var.f40180a && this.b == x2p0Var.b && this.c == x2p0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f40180a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamBetStatisticsScreenConfig(sportEventCardStyle=");
        sb.append(this.f40180a);
        sb.append(", is24HourFormat=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
