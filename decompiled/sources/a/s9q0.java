package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s9q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31859a;
    public final long b;

    public s9q0(long j, long j2) {
        this.f31859a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9q0)) {
            return false;
        }
        s9q0 s9q0Var = (s9q0) obj;
        long j = s9q0Var.f31859a;
        int i = y3d.h;
        return h2t0.a(this.f31859a, j) && h2t0.a(this.b, s9q0Var.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f31859a) * 31);
    }

    public final String toString() {
        return b1j.k("SelectionColors(selectionHandleColor=", y3d.i(this.f31859a), ", selectionBackgroundColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
