package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6942a;
    public final long b;
    public final long c;

    public dzh(long j, long j2, String str) {
        str.getClass();
        this.f6942a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzh)) {
            return false;
        }
        dzh dzhVar = (dzh) obj;
        if (!Intrinsics.d(this.f6942a, dzhVar.f6942a)) {
            return false;
        }
        long j = dzhVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, dzhVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f6942a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        return axq.n(b1j.n("DSAggregatorCardTallTagUiModel(text=", this.f6942a, ", textColor=", strI, ", backgroundColor="), y3d.i(this.c), Separators.RPAREN);
    }
}
