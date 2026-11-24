package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f130 implements g130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8746a;
    public final long b;
    public final double c;

    public f130(double d, long j, long j2) {
        this.f8746a = j;
        this.b = j2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f130)) {
            return false;
        }
        f130 f130Var = (f130) obj;
        return this.f8746a == f130Var.f8746a && this.b == f130Var.b && Double.compare(this.c, f130Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + rw2.b(Long.hashCode(this.f8746a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f8746a, "SelectedEventBetClick(eventBetId=", ", groupId=");
        sbQ.append(this.b);
        return brm0.m(sbQ, this.c, ", param=", Separators.RPAREN);
    }
}
