package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19800a;
    public final String b;
    public final long c;

    public lch0(String str, String str2, long j) {
        this.f19800a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lch0)) {
            return false;
        }
        lch0 lch0Var = (lch0) obj;
        if (!this.f19800a.equals(lch0Var.f19800a) || !this.b.equals(lch0Var.b)) {
            return false;
        }
        long j = lch0Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f19800a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iB;
    }

    public final String toString() {
        return axq.n(b1j.n("ScrollingGraphTeamUiModel(name=", this.f19800a, ", image=", this.b, ", color="), y3d.i(this.c), Separators.RPAREN);
    }
}
