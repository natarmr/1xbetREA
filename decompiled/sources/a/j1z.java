package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j1z implements m1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0z f15759a;
    public final f9m0 b;
    public final boolean c;
    public final mdm d;

    public j1z(t0z t0zVar, f9m0 f9m0Var, boolean z, mdm mdmVar) {
        this.f15759a = t0zVar;
        this.b = f9m0Var;
        this.c = z;
        this.d = mdmVar;
    }

    @Override // a.m1z
    public final boolean a() {
        return this.c;
    }

    @Override // a.m1z
    public final t0z b() {
        return this.f15759a;
    }

    @Override // a.m1z
    public final f9m0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1z)) {
            return false;
        }
        j1z j1zVar = (j1z) obj;
        return this.f15759a.equals(j1zVar.f15759a) && this.b.equals(j1zVar.b) && this.c == j1zVar.c && this.d.equals(j1zVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f15759a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Error(headerUiState=" + this.f15759a + ", appBarUiModel=" + this.b + ", rtlSupport=" + this.c + ", lottieConfig=" + this.d + Separators.RPAREN;
    }
}
