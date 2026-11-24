package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ffa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9440a;
    public final long b;

    public ffa0(String str, long j) {
        str.getClass();
        this.f9440a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffa0)) {
            return false;
        }
        ffa0 ffa0Var = (ffa0) obj;
        if (!Intrinsics.d(this.f9440a, ffa0Var.f9440a)) {
            return false;
        }
        long j = ffa0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f9440a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("PlayersCompositionStatisticValueUiModel(value=", this.f9440a, ", color=", y3d.i(this.b), Separators.RPAREN);
    }
}
