package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m5x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21237a;
    public final int b;

    public m5x(String str, int i) {
        this.f21237a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5x)) {
            return false;
        }
        m5x m5xVar = (m5x) obj;
        return this.f21237a.equals(m5xVar.f21237a) && this.b == m5xVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f21237a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "IndianPokerPlayerCombinationUiModel(playerCombination=", this.f21237a, ", backgroundCards=", Separators.RPAREN);
    }
}
