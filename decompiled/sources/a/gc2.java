package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gc2 implements ic2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6w f11038a;
    public final boolean b;

    public gc2(p6w p6wVar, boolean z) {
        this.f11038a = p6wVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc2)) {
            return false;
        }
        gc2 gc2Var = (gc2) obj;
        return this.f11038a.equals(gc2Var.f11038a) && this.b == gc2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f11038a.hashCode() * 31);
    }

    public final String toString() {
        return "MediumItemsSpaceSeparator(historyResultUiState=" + this.f11038a + ", isRefreshing=" + this.b + Separators.RPAREN;
    }
}
