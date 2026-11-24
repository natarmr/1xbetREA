package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xrr implements zrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqr f41382a;
    public final wdp0 b;
    public final wdp0 c;
    public final j83 d;
    public final iul0 e;

    public xrr(uqr uqrVar, wdp0 wdp0Var, wdp0 wdp0Var2, j83 j83Var, iul0 iul0Var) {
        this.f41382a = uqrVar;
        this.b = wdp0Var;
        this.c = wdp0Var2;
        this.d = j83Var;
        this.e = iul0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrr)) {
            return false;
        }
        xrr xrrVar = (xrr) obj;
        return this.f41382a.equals(xrrVar.f41382a) && this.b.equals(xrrVar.b) && this.c.equals(xrrVar.c) && this.d.equals(xrrVar.d) && this.e.equals(xrrVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f41382a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "SpreadSheetScore(labels=" + this.f41382a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", bottomInfo=" + ((Object) this.d) + ", score=" + this.e + Separators.RPAREN;
    }
}
