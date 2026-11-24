package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x5r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40332a;
    public final nas b;

    public x5r0(boolean z, nas nasVar) {
        this.f40332a = z;
        this.b = nasVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5r0)) {
            return false;
        }
        x5r0 x5r0Var = (x5r0) obj;
        return this.f40332a == x5r0Var.f40332a && Intrinsics.d(this.b, x5r0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f40332a) * 31;
        nas nasVar = this.b;
        return iHashCode + (nasVar == null ? 0 : nasVar.hashCode());
    }

    public final String toString() {
        return "TopGamesByStatsStateModel(enabled=" + this.f40332a + ", game=" + this.b + Separators.RPAREN;
    }
}
