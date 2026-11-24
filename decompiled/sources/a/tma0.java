package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tma0 implements vma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gma0 f34185a;
    public final f9m0 b;
    public final boolean c;
    public final mdm d;

    public tma0(gma0 gma0Var, f9m0 f9m0Var, boolean z, mdm mdmVar) {
        this.f34185a = gma0Var;
        this.b = f9m0Var;
        this.c = z;
        this.d = mdmVar;
    }

    @Override // a.vma0
    public final boolean a() {
        return this.c;
    }

    @Override // a.vma0
    public final gma0 b() {
        return this.f34185a;
    }

    @Override // a.vma0
    public final f9m0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tma0)) {
            return false;
        }
        tma0 tma0Var = (tma0) obj;
        return this.f34185a.equals(tma0Var.f34185a) && this.b.equals(tma0Var.b) && this.c == tma0Var.c && this.d.equals(tma0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f34185a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Error(headerUiState=" + this.f34185a + ", statisticAppBarUiModel=" + this.b + ", rtlSupport=" + this.c + ", dsEmptyConfig=" + this.d + Separators.RPAREN;
    }
}
