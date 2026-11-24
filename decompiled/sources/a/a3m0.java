package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a3m0 implements d3m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2m0 f179a;
    public final String b;
    public final boolean c;
    public final mdm d;

    public a3m0(k2m0 k2m0Var, String str, boolean z, mdm mdmVar) {
        this.f179a = k2m0Var;
        this.b = str;
        this.c = z;
        this.d = mdmVar;
    }

    @Override // a.d3m0
    public final boolean a() {
        return this.c;
    }

    @Override // a.d3m0
    public final k2m0 b() {
        return this.f179a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3m0)) {
            return false;
        }
        a3m0 a3m0Var = (a3m0) obj;
        return this.f179a.equals(a3m0Var.f179a) && this.b.equals(a3m0Var.b) && this.c == a3m0Var.c && this.d.equals(a3m0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(this.f179a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "Error(headerUiState=" + this.f179a + ", title=" + this.b + ", rtlSupport=" + this.c + ", lottieConfig=" + this.d + Separators.RPAREN;
    }
}
