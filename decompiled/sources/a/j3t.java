package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j3t extends l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxo f15853a;
    public final boolean b;

    public j3t(gxo gxoVar, boolean z) {
        this.f15853a = gxoVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3t)) {
            return false;
        }
        j3t j3tVar = (j3t) obj;
        return this.f15853a == j3tVar.f15853a && this.b == j3tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f15853a.hashCode() * 31);
    }

    public final String toString() {
        return "HighlightBet(betType=" + this.f15853a + ", normalColor=" + this.b + Separators.RPAREN;
    }
}
