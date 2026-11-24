package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qhg implements rhg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hhq0 f28737a;

    public qhg(hhq0 hhq0Var) {
        this.f28737a = hhq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhg) && this.f28737a.equals(((qhg) obj).f28737a);
    }

    public final int hashCode() {
        return this.f28737a.hashCode();
    }

    public final String toString() {
        return "OnTimeFilterSelected(model=" + this.f28737a + Separators.RPAREN;
    }
}
