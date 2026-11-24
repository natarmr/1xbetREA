package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fc2 implements ic2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6w f9288a;
    public final boolean b;

    public fc2(p6w p6wVar, boolean z) {
        this.f9288a = p6wVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc2)) {
            return false;
        }
        fc2 fc2Var = (fc2) obj;
        return this.f9288a.equals(fc2Var.f9288a) && this.b == fc2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f9288a.hashCode() * 31);
    }

    public final String toString() {
        return "MediumItemsLineSeparator(historyResultUiState=" + this.f9288a + ", isRefreshing=" + this.b + Separators.RPAREN;
    }
}
