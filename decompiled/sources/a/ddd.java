package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ddd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5891a;
    public final long b;

    public ddd(String str, long j) {
        this.f5891a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddd)) {
            return false;
        }
        ddd dddVar = (ddd) obj;
        if (!this.f5891a.equals(dddVar.f5891a)) {
            return false;
        }
        long j = dddVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f5891a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("CompareValueState(value=", this.f5891a, ", color=", y3d.i(this.b), Separators.RPAREN);
    }
}
