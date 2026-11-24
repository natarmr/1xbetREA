package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lle extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxo f20243a;
    public final double b;

    public lle(gxo gxoVar, double d) {
        this.f20243a = gxoVar;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lle)) {
            return false;
        }
        lle lleVar = (lle) obj;
        return this.f20243a == lleVar.f20243a && Double.compare(this.b, lleVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f20243a.hashCode() * 31);
    }

    public final String toString() {
        return "FastBetChangeCommand(betType=" + this.f20243a + ", value=" + this.b + Separators.RPAREN;
    }
}
