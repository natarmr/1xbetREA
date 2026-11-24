package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hc2 implements ic2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6w f12798a;
    public final boolean b;

    public hc2(p6w p6wVar, boolean z) {
        this.f12798a = p6wVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc2)) {
            return false;
        }
        hc2 hc2Var = (hc2) obj;
        return this.f12798a.equals(hc2Var.f12798a) && this.b == hc2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f12798a.hashCode() * 31);
    }

    public final String toString() {
        return "SmallItemLineSeparator(historyResultUiState=" + this.f12798a + ", isRefreshing=" + this.b + Separators.RPAREN;
    }
}
