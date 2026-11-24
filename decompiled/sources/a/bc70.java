package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bc70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2341a;
    public final long b;

    public bc70(boolean z, long j) {
        this.f2341a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc70)) {
            return false;
        }
        bc70 bc70Var = (bc70) obj;
        if (this.f2341a != bc70Var.f2341a) {
            return false;
        }
        long j = bc70Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2341a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return ua80.k("Loading(visible=", this.f2341a, ", loaderColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
