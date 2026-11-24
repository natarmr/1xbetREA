package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qbs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bcs0 f28453a;
    public final mbs0 b;

    public qbs0(bcs0 bcs0Var, mbs0 mbs0Var) {
        this.f28453a = bcs0Var;
        this.b = mbs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbs0)) {
            return false;
        }
        qbs0 qbs0Var = (qbs0) obj;
        return this.f28453a.equals(qbs0Var.f28453a) && this.b.equals(qbs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28453a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackCoefItemModel(game=" + this.f28453a + ", betInfo=" + this.b + Separators.RPAREN;
    }
}
