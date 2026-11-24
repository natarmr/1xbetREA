package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class epu0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8204a;
    public final vb90 b;

    public epu0(String str, vb90 vb90Var) {
        this.f8204a = str;
        this.b = vb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epu0)) {
            return false;
        }
        epu0 epu0Var = (epu0) obj;
        return this.f8204a.equals(epu0Var.f8204a) && this.b.equals(epu0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f8204a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8204a.hashCode() * 31);
    }

    public final String toString() {
        return "VirtualGameCategoryMainCardUiModel(key=" + this.f8204a + ", gameCardUiModel=" + this.b + Separators.RPAREN;
    }
}
