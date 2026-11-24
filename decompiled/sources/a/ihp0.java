package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ihp0 implements lhp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hhp0 f14791a;

    public ihp0(hhp0 hhp0Var) {
        this.f14791a = hhp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihp0) && this.f14791a.equals(((ihp0) obj).f14791a);
    }

    public final int hashCode() {
        return this.f14791a.hashCode();
    }

    public final String toString() {
        return "Content(teamRatingModel=" + this.f14791a + Separators.RPAREN;
    }
}
