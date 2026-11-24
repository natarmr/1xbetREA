package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lpg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20440a;
    public final boolean b;

    public lpg(boolean z, boolean z2) {
        this.f20440a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpg)) {
            return false;
        }
        lpg lpgVar = (lpg) obj;
        return this.f20440a == lpgVar.f20440a && this.b == lpgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f20440a) * 31);
    }

    public final String toString() {
        return hne.n("CyberGameStatisticCollapsedStateModel(lastMatchesFooterCollapsed=", ", futureGamesFooterCollapsed=", Separators.RPAREN, this.f20440a, this.b);
    }
}
