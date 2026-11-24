package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ef8 implements hf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final id50 f7709a;
    public final htr b;

    public ef8(id50 id50Var, htr htrVar) {
        this.f7709a = id50Var;
        this.b = htrVar;
    }

    @Override // a.hf8
    public final id50 a() {
        return this.f7709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef8)) {
            return false;
        }
        ef8 ef8Var = (ef8) obj;
        return this.f7709a.equals(ef8Var.f7709a) && this.b.equals(ef8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7709a.f14567a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(navigationBarUiState=" + this.f7709a + ", games=" + this.b + Separators.RPAREN;
    }
}
