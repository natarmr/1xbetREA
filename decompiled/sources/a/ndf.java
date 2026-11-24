package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ndf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wcv0 f23336a;

    public ndf(wcv0 wcv0Var) {
        this.f23336a = wcv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndf) && this.f23336a.equals(((ndf) obj).f23336a);
    }

    public final int hashCode() {
        return this.f23336a.hashCode();
    }

    public final String toString() {
        return "CricketScoreModel(wicketScore=" + this.f23336a + Separators.RPAREN;
    }
}
