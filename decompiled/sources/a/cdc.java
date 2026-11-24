package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class cdc implements fdc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x95 f4155a;

    public cdc(x95 x95Var) {
        this.f4155a = x95Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdc) && this.f4155a.equals(((cdc) obj).f4155a);
    }

    public final int hashCode() {
        return this.f4155a.hashCode();
    }

    public final String toString() {
        return "OnLimitValueChoose(availableValueUiModel=" + this.f4155a + Separators.RPAREN;
    }
}
