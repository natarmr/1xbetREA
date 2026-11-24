package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ieg implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14632a;
    public final vb90 b;

    public ieg(String str, vb90 vb90Var) {
        this.f14632a = str;
        this.b = vb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieg)) {
            return false;
        }
        ieg iegVar = (ieg) obj;
        return this.f14632a.equals(iegVar.f14632a) && this.b.equals(iegVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f14632a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14632a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberChampionshipEventGameCardUiModel(key=" + this.f14632a + ", gameCardUiModel=" + this.b + Separators.RPAREN;
    }
}
