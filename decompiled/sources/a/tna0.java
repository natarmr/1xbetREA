package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tna0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sna0 f34224a;
    public final rna0 b;

    public tna0(sna0 sna0Var, rna0 rna0Var) {
        this.f34224a = sna0Var;
        this.b = rna0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tna0)) {
            return false;
        }
        tna0 tna0Var = (tna0) obj;
        return this.f34224a == tna0Var.f34224a && this.b == tna0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34224a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayingCardModel(cardSuite=" + this.f34224a + ", cardRank=" + this.b + Separators.RPAREN;
    }
}
