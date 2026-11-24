package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wzl implements xzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40026a;
    public final long b;

    public wzl(long j, long j2) {
        this.f40026a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzl)) {
            return false;
        }
        wzl wzlVar = (wzl) obj;
        long j = wzlVar.f40026a;
        int i = y3d.h;
        return h2t0.a(this.f40026a, j) && h2t0.a(this.b, wzlVar.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f40026a) * 31);
    }

    public final String toString() {
        return b1j.k("Gradient(backgroundStart=", y3d.i(this.f40026a), ", backgroundEnd=", y3d.i(this.b), Separators.RPAREN);
    }
}
