package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nbr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23255a;
    public final int b;

    public nbr(int i, int i2) {
        this.f23255a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbr)) {
            return false;
        }
        nbr nbrVar = (nbr) obj;
        return this.f23255a == nbrVar.f23255a && this.b == nbrVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f23255a) * 31);
    }

    public final String toString() {
        return ohs0.m("FullScoreDetailModel(scoreOpp1=", this.f23255a, ", scoreOpp2=", Separators.RPAREN, this.b);
    }
}
