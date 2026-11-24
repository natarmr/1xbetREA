package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pmv0 implements rmv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f27258a;
    public final mdm b;

    public pmv0(mdm mdmVar, imm immVar) {
        this.f27258a = immVar;
        this.b = mdmVar;
    }

    @Override // a.rmv0
    public final imm a() {
        return this.f27258a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmv0)) {
            return false;
        }
        pmv0 pmv0Var = (pmv0) obj;
        return this.f27258a.equals(pmv0Var.f27258a) && this.b.equals(pmv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27258a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBarModel=" + this.f27258a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
