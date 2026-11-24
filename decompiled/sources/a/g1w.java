package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g1w implements i1w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ato0 f10535a;
    public final boolean b;

    public g1w(ato0 ato0Var, boolean z) {
        this.f10535a = ato0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1w)) {
            return false;
        }
        g1w g1wVar = (g1w) obj;
        return this.f10535a.equals(g1wVar.f10535a) && this.b == g1wVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f10535a.hashCode() * 31);
    }

    public final String toString() {
        return "TakeAllUiModel(takeAllModel=" + this.f10535a + ", isChecked=" + this.b + Separators.RPAREN;
    }
}
