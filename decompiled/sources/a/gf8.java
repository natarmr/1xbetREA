package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gf8 implements hf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final id50 f11195a;

    public gf8(id50 id50Var) {
        this.f11195a = id50Var;
    }

    @Override // a.hf8
    public final id50 a() {
        return this.f11195a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf8) && this.f11195a.equals(((gf8) obj).f11195a);
    }

    public final int hashCode() {
        return this.f11195a.f14567a.hashCode();
    }

    public final String toString() {
        return "Loading(navigationBarUiState=" + this.f11195a + Separators.RPAREN;
    }
}
