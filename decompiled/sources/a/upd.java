package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class upd extends vpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f36060a;

    public upd(zmk0 zmk0Var) {
        this.f36060a = zmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upd) && this.f36060a.equals(((upd) obj).f36060a);
    }

    public final int hashCode() {
        return this.f36060a.hashCode();
    }

    public final String toString() {
        return dw9.p("TeamTwoScoreChanged(score=", this.f36060a, Separators.RPAREN);
    }
}
