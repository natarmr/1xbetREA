package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bj6 implements gj6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud f2690a;
    public final ms2 b;
    public final long c;
    public final long d;

    public bj6(aud audVar, zq2 zq2Var, long j, long j2) {
        ctc ctcVar = ctc.f4929a;
        audVar.getClass();
        zq2Var.getClass();
        this.f2690a = audVar;
        this.b = zq2Var;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj6)) {
            return false;
        }
        bj6 bj6Var = (bj6) obj;
        if (!Intrinsics.d(this.f2690a, bj6Var.f2690a)) {
            return false;
        }
        ctc ctcVar = ctc.f4929a;
        return Intrinsics.d(this.b, bj6Var.b) && this.c == bj6Var.c && this.d == bj6Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + rw2.b((this.b.hashCode() + ((ctc.f4929a.hashCode() + (this.f2690a.hashCode() * 31)) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        ctc ctcVar = ctc.f4929a;
        StringBuilder sb = new StringBuilder("AddEventToCouponHandle(configureCouponResultModel=");
        sb.append(this.f2690a);
        sb.append(", clickType=");
        sb.append(ctcVar);
        sb.append(", entryPointType=");
        sb.append(this.b);
        sb.append(", champId=");
        sb.append(this.c);
        return rw2.n(sb, this.d, ", gameId=", Separators.RPAREN);
    }
}
