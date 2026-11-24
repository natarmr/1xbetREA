package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i3t extends l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxo f14113a;
    public final boolean b;

    public i3t(gxo gxoVar, boolean z) {
        this.f14113a = gxoVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3t)) {
            return false;
        }
        i3t i3tVar = (i3t) obj;
        return this.f14113a == i3tVar.f14113a && this.b == i3tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f14113a.hashCode() * 31);
    }

    public final String toString() {
        return "FocusBetSum(betType=" + this.f14113a + ", hasFocus=" + this.b + Separators.RPAREN;
    }
}
