package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i5j0 implements j5j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4j0 f14195a;

    public i5j0(h4j0 h4j0Var) {
        this.f14195a = h4j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5j0) && this.f14195a == ((i5j0) obj).f14195a;
    }

    public final int hashCode() {
        return this.f14195a.hashCode();
    }

    public final String toString() {
        return "ShowQuickBetEditorBottomSheet(quickBetItem=" + this.f14195a + Separators.RPAREN;
    }
}
