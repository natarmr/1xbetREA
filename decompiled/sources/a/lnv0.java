package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lnv0 implements nnv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f20365a;
    public final mdm b;

    public lnv0(mdm mdmVar, imm immVar) {
        this.f20365a = immVar;
        this.b = mdmVar;
    }

    @Override // a.nnv0
    public final imm a() {
        return this.f20365a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnv0)) {
            return false;
        }
        lnv0 lnv0Var = (lnv0) obj;
        return this.f20365a.equals(lnv0Var.f20365a) && this.b.equals(lnv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20365a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBarModel=" + this.f20365a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
