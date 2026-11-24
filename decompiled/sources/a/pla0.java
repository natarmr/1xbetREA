package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pla0 implements rla0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xka0 f27174a;
    public final f9m0 b;
    public final boolean c;
    public final mdm d;

    public pla0(xka0 xka0Var, f9m0 f9m0Var, boolean z, mdm mdmVar) {
        this.f27174a = xka0Var;
        this.b = f9m0Var;
        this.c = z;
        this.d = mdmVar;
    }

    @Override // a.rla0
    public final boolean a() {
        return this.c;
    }

    @Override // a.rla0
    public final xka0 b() {
        return this.f27174a;
    }

    @Override // a.rla0
    public final f9m0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pla0)) {
            return false;
        }
        pla0 pla0Var = (pla0) obj;
        return this.f27174a.equals(pla0Var.f27174a) && this.b.equals(pla0Var.b) && this.c == pla0Var.c && this.d.equals(pla0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f27174a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Error(headerUiState=" + this.f27174a + ", statisticAppBarUiModel=" + this.b + ", rtlSupport=" + this.c + ", dsEmptyConfig=" + this.d + Separators.RPAREN;
    }
}
