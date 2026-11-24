package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9835a;
    public final int b;

    public fng(int i, int i2) {
        this.f9835a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fng)) {
            return false;
        }
        fng fngVar = (fng) obj;
        return this.f9835a == fngVar.f9835a && this.b == fngVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f9835a) * 31);
    }

    public final String toString() {
        return b1j.k("CyberDurakCardsUiModel(attackerCard=", una0.c(this.f9835a), ", defenderCard=", una0.c(this.b), Separators.RPAREN);
    }
}
