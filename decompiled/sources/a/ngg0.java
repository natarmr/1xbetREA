package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ngg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23485a;
    public final long b;

    public ngg0(int i, long j) {
        this.f23485a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngg0)) {
            return false;
        }
        ngg0 ngg0Var = (ngg0) obj;
        if (this.f23485a != ngg0Var.f23485a) {
            return false;
        }
        long j = ngg0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f23485a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return defpackage.c.b(this.f23485a, "RoundStatisticResultUiModel(teamWinMethodIcon=", ", teamBackgroundColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
