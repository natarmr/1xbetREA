package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sme0 implements tme0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f32441a;
    public final mdm b;

    public sme0(mdm mdmVar, imm immVar) {
        this.f32441a = immVar;
        this.b = mdmVar;
    }

    @Override // a.tme0
    public final imm a() {
        return this.f32441a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sme0)) {
            return false;
        }
        sme0 sme0Var = (sme0) obj;
        return this.f32441a.equals(sme0Var.f32441a) && this.b.equals(sme0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32441a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(dsNavigationBarUiModel=" + this.f32441a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
