package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qdl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28540a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final Long e;

    public qdl0(long j, long j2, boolean z, boolean z2, Long l) {
        this.f28540a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdl0)) {
            return false;
        }
        qdl0 qdl0Var = (qdl0) obj;
        return this.f28540a == qdl0Var.f28540a && this.b == qdl0Var.b && this.c == qdl0Var.c && this.d == qdl0Var.d && Intrinsics.d(this.e, qdl0Var.e);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(rw2.b(Long.hashCode(this.f28540a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f28540a, "SportGameModel(gameId=", ", userId=");
        hne.t(this.b, ", cutCoef=", sbQ, this.c);
        sbQ.append(", live=");
        sbQ.append(this.d);
        sbQ.append(", marketType=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
