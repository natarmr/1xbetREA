package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25704a;
    public final int b;

    public oqs(int i, int i2) {
        this.f25704a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqs)) {
            return false;
        }
        oqs oqsVar = (oqs) obj;
        return this.f25704a == oqsVar.f25704a && this.b == oqsVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f25704a) * 31);
    }

    public final String toString() {
        return ohs0.m("GameScoreFullDetailsModel(scoreOpp1=", this.f25704a, ", scoreOpp2=", Separators.RPAREN, this.b);
    }
}
