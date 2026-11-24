package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x5l0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40324a;
    public final a2n b;
    public final v12 c;
    public final boolean d;

    public x5l0(String str, a2n a2nVar, v12 v12Var, boolean z) {
        this.f40324a = str;
        this.b = a2nVar;
        this.c = v12Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5l0)) {
            return false;
        }
        x5l0 x5l0Var = (x5l0) obj;
        return this.f40324a.equals(x5l0Var.f40324a) && this.b.equals(x5l0Var.b) && this.c == x5l0Var.c && this.d == x5l0Var.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f40324a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f40324a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SportEventCardUiModel(key=" + this.f40324a + ", eventCardItem=" + this.b + ", alignmentInSection=" + this.c + ", rtlSupport=" + this.d + Separators.RPAREN;
    }
}
