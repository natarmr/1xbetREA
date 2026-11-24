package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class agg implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f823a;
    public final x0g0 b;
    public final boolean c;

    public agg(String str, x0g0 x0g0Var, boolean z) {
        this.f823a = str;
        this.b = x0g0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agg)) {
            return false;
        }
        agg aggVar = (agg) obj;
        return this.f823a.equals(aggVar.f823a) && this.b.equals(aggVar.b) && this.c == aggVar.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f823a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f823a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampionshipResultsGameCardUiModel(key=");
        sb.append(this.f823a);
        sb.append(", gameCardUiModel=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
