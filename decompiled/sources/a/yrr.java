package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yrr implements asr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqr f43135a;
    public final vdp0 b;
    public final vdp0 c;
    public final j83 d;
    public final jul0 e;

    public yrr(vqr vqrVar, vdp0 vdp0Var, vdp0 vdp0Var2, j83 j83Var, jul0 jul0Var) {
        this.f43135a = vqrVar;
        this.b = vdp0Var;
        this.c = vdp0Var2;
        this.d = j83Var;
        this.e = jul0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrr)) {
            return false;
        }
        yrr yrrVar = (yrr) obj;
        return this.f43135a.equals(yrrVar.f43135a) && this.b.equals(yrrVar.b) && this.c.equals(yrrVar.c) && this.d.equals(yrrVar.d) && this.e.equals(yrrVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f43135a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "SpreadSheetScore(labels=" + this.f43135a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", bottomInfo=" + ((Object) this.d) + ", score=" + this.e + Separators.RPAREN;
    }
}
