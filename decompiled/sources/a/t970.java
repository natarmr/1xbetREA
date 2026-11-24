package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t970 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33548a;
    public final long b;
    public final long c;

    public t970(long j, long j2, String str) {
        str.getClass();
        this.f33548a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t970)) {
            return false;
        }
        t970 t970Var = (t970) obj;
        if (!Intrinsics.d(this.f33548a, t970Var.f33548a)) {
            return false;
        }
        long j = t970Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, t970Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f33548a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        return axq.n(b1j.n("TopContent(title=", this.f33548a, ", titleColor=", strI, ", bgColor="), y3d.i(this.c), Separators.RPAREN);
    }
}
