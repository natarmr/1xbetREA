package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o1m implements s1m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zwf f24487a;
    public final long b;

    public o1m(zwf zwfVar, long j) {
        this.f24487a = zwfVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1m)) {
            return false;
        }
        o1m o1mVar = (o1m) obj;
        if (!this.f24487a.equals(o1mVar.f24487a)) {
            return false;
        }
        long j = o1mVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f24487a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "FilledL(filledLStyle=" + this.f24487a + ", iconTint=" + y3d.i(this.b) + Separators.RPAREN;
    }
}
