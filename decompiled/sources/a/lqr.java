package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lqr implements nqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3w0 f20498a;
    public final l3w0 b;
    public final l3w0 c;

    public lqr(l3w0 l3w0Var, l3w0 l3w0Var2, l3w0 l3w0Var3) {
        this.f20498a = l3w0Var;
        this.b = l3w0Var2;
        this.c = l3w0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqr)) {
            return false;
        }
        lqr lqrVar = (lqr) obj;
        return this.f20498a.equals(lqrVar.f20498a) && this.b.equals(lqrVar.b) && this.c.equals(lqrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f20498a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Zones(leftZoneActivity=" + this.f20498a + ", centralZoneActivity=" + this.b + ", rightZoneActivity=" + this.c + Separators.RPAREN;
    }
}
