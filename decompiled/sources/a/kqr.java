package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kqr implements mqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3w0 f18735a;
    public final k3w0 b;
    public final k3w0 c;

    public kqr(k3w0 k3w0Var, k3w0 k3w0Var2, k3w0 k3w0Var3) {
        this.f18735a = k3w0Var;
        this.b = k3w0Var2;
        this.c = k3w0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqr)) {
            return false;
        }
        kqr kqrVar = (kqr) obj;
        return this.f18735a.equals(kqrVar.f18735a) && this.b.equals(kqrVar.b) && this.c.equals(kqrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f18735a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Zones(leftZoneActivity=" + this.f18735a + ", centralZoneActivity=" + this.b + ", rightZoneActivity=" + this.c + Separators.RPAREN;
    }
}
