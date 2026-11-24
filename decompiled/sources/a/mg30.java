package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg30 f21723a;
    public final int b;
    public final long c;
    public final boolean d;

    public mg30(lg30 lg30Var, int i, long j, boolean z) {
        this.f21723a = lg30Var;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg30)) {
            return false;
        }
        mg30 mg30Var = (mg30) obj;
        if (this.f21723a != mg30Var.f21723a || this.b != mg30Var.b) {
            return false;
        }
        long j = mg30Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && this.d == mg30Var.d;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f21723a.hashCode() * 31, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.d) + rw2.b(iA, 31, this.c);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        StringBuilder sb = new StringBuilder("MatchTypeUiModel(matchType=");
        sb.append(this.f21723a);
        sb.append(", titleResId=");
        sb.append(this.b);
        sb.append(", selectorTextColor=");
        return defpackage.c.c(strI, ", showDivider=", Separators.RPAREN, sb, this.d);
    }
}
