package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class loz implements moz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y95 f20414a;

    public loz(y95 y95Var) {
        this.f20414a = y95Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof loz) && this.f20414a.equals(((loz) obj).f20414a);
    }

    public final int hashCode() {
        return this.f20414a.hashCode();
    }

    public final String toString() {
        return "OnTimeSelected(availableValueUiModel=" + this.f20414a + Separators.RPAREN;
    }
}
