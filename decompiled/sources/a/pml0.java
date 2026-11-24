package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pml0 implements rml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0n f27241a;
    public final y0n b;
    public final kpm c;
    public final String d;
    public final r0n e;

    public pml0(y0n y0nVar, y0n y0nVar2, kpm kpmVar, String str, r0n r0nVar) {
        this.f27241a = y0nVar;
        this.b = y0nVar2;
        this.c = kpmVar;
        this.d = str;
        this.e = r0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pml0)) {
            return false;
        }
        pml0 pml0Var = (pml0) obj;
        return this.f27241a.equals(pml0Var.f27241a) && this.b.equals(pml0Var.b) && this.c.equals(pml0Var.c) && this.d.equals(pml0Var.d) && this.e.equals(pml0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(dw9.c(this.c, (this.b.hashCode() + (this.f27241a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "TwoOpponents(teamOneModel=" + this.f27241a + ", teamTwoModel=" + this.b + ", scoreModel=" + this.c + ", infoLabel=" + this.d + ", options=" + this.e + Separators.RPAREN;
    }
}
