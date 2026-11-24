package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kuj implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18913a;
    public final vb90 b;

    public kuj(String str, vb90 vb90Var) {
        this.f18913a = str;
        this.b = vb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuj)) {
            return false;
        }
        kuj kujVar = (kuj) obj;
        return this.f18913a.equals(kujVar.f18913a) && this.b.equals(kujVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f18913a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18913a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultGameCardUiModel(key=" + this.f18913a + ", gameCardUiModel=" + this.b + Separators.RPAREN;
    }
}
