package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ldu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19870a;

    public final boolean equals(Object obj) {
        if (obj instanceof ldu0) {
            return this.f19870a.equals(((ldu0) obj).f19870a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19870a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstPlayerFormula(value=", this.f19870a, Separators.RPAREN);
    }
}
