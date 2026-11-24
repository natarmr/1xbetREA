package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class xpz implements ypz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w95 f41289a;

    public xpz(w95 w95Var) {
        this.f41289a = w95Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xpz) && this.f41289a.equals(((xpz) obj).f41289a);
    }

    public final int hashCode() {
        return this.f41289a.hashCode();
    }

    public final String toString() {
        return "OnTimeSelected(availableValueUiModel=" + this.f41289a + Separators.RPAREN;
    }
}
