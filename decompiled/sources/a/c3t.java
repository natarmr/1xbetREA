package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c3t extends l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxo f3696a;
    public final double b;

    public c3t(gxo gxoVar, double d) {
        this.f3696a = gxoVar;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3t)) {
            return false;
        }
        c3t c3tVar = (c3t) obj;
        return this.f3696a == c3tVar.f3696a && Double.compare(this.b, c3tVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f3696a.hashCode() * 31);
    }

    public final String toString() {
        return "ChangeFastBetValue(betType=" + this.f3696a + ", newValue=" + this.b + Separators.RPAREN;
    }
}
