package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n1p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22762a;
    public final long b;

    public n1p0(String str, long j) {
        str.getClass();
        this.f22762a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1p0)) {
            return false;
        }
        n1p0 n1p0Var = (n1p0) obj;
        if (!Intrinsics.d(this.f22762a, n1p0Var.f22762a)) {
            return false;
        }
        long j = n1p0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f22762a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("TeamBetShapePanelViewUiModel(text=", this.f22762a, ", color=", y3d.i(this.b), Separators.RPAREN);
    }
}
