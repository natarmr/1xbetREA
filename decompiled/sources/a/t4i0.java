package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class t4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xsf0 f33321a;
    public final int b;
    public final long c;

    public t4i0(xsf0 xsf0Var, int i, long j) {
        this.f33321a = xsf0Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4i0)) {
            return false;
        }
        t4i0 t4i0Var = (t4i0) obj;
        return this.f33321a == t4i0Var.f33321a && this.b == t4i0Var.b && this.c == t4i0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + twn.a(this.b, this.f33321a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.f33321a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
