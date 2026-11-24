package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f13961a;
    public final cic0 b;

    public i0r0(h1r0 h1r0Var) {
        this.f13961a = h1r0Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0r0)) {
            return false;
        }
        i0r0 i0r0Var = (i0r0) obj;
        return Intrinsics.d(this.f13961a, i0r0Var.f13961a) && Intrinsics.d(this.b, i0r0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f13961a.hashCode() * 31;
        cic0 cic0Var = this.b;
        return iHashCode + (cic0Var == null ? 0 : cic0Var.hashCode());
    }

    public final String toString() {
        return "AggregatorPromoGames(status=" + this.f13961a + ", value=" + this.b + Separators.RPAREN;
    }

    public i0r0(h1r0 h1r0Var, cic0 cic0Var) {
        this.f13961a = h1r0Var;
        this.b = cic0Var;
    }
}
