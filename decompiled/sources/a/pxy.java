package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27779a;
    public final int b;
    public final long c;

    public pxy(int i, long j, long j2) {
        this.f27779a = j;
        this.b = i;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxy)) {
            return false;
        }
        pxy pxyVar = (pxy) obj;
        return this.f27779a == pxyVar.f27779a && this.b == pxyVar.b && this.c == pxyVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + twn.a(this.b, Long.hashCode(this.f27779a) * 31, 31);
    }

    public final String toString() {
        return rw2.n(brm0.q(this.b, this.f27779a, "LastActionModel(id=", ", type="), this.c, ", date=", Separators.RPAREN);
    }
}
