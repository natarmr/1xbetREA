package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ubr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35394a;
    public final int b;

    public ubr(int i, int i2) {
        this.f35394a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubr)) {
            return false;
        }
        ubr ubrVar = (ubr) obj;
        return this.f35394a == ubrVar.f35394a && this.b == ubrVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f35394a) * 31);
    }

    public final String toString() {
        return ohs0.m("FullScoreDetailsModel(scoreOpp1=", this.f35394a, ", scoreOpp2=", Separators.RPAREN, this.b);
    }
}
