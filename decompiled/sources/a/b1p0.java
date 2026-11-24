package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b1p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gga f1819a;
    public final boolean b;

    public b1p0(gga ggaVar, boolean z) {
        this.f1819a = ggaVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1p0)) {
            return false;
        }
        b1p0 b1p0Var = (b1p0) obj;
        return this.f1819a.equals(b1p0Var.f1819a) && this.b == b1p0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f1819a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamBetNearestMatchUiItem(model=" + this.f1819a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
