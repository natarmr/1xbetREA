package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mnp0 implements onp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f22101a;
    public final mdm b;

    public mnp0(mdm mdmVar, imm immVar) {
        this.f22101a = immVar;
        this.b = mdmVar;
    }

    @Override // a.onp0
    public final imm a() {
        return this.f22101a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnp0)) {
            return false;
        }
        mnp0 mnp0Var = (mnp0) obj;
        return this.f22101a.equals(mnp0Var.f22101a) && this.b.equals(mnp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22101a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBarUiModel=" + this.f22101a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
