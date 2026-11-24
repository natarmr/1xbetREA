package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26144a;
    public final qic b;

    public p0d(int i, qic qicVar) {
        this.f26144a = i;
        this.b = qicVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0d)) {
            return false;
        }
        p0d p0dVar = (p0d) obj;
        return this.f26144a == p0dVar.f26144a && this.b == p0dVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f26144a) * 31);
    }

    public final String toString() {
        return "CoefficientsCarriageUiModel(carriagePosition=" + this.f26144a + ", chosenBet=" + this.b + Separators.RPAREN;
    }
}
