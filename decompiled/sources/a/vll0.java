package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vll0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37630a;
    public final nla b;
    public final v12 c;
    public final boolean d;

    public vll0(String str, nla nlaVar, v12 v12Var, boolean z) {
        vvs vvsVar = vvs.f38117a;
        this.f37630a = str;
        this.b = nlaVar;
        this.c = v12Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vll0)) {
            return false;
        }
        vll0 vll0Var = (vll0) obj;
        if (!this.f37630a.equals(vll0Var.f37630a) || !this.b.equals(vll0Var.b)) {
            return false;
        }
        vvs vvsVar = vvs.f38117a;
        return this.c == vll0Var.c && this.d == vll0Var.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f37630a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((vvs.f38117a.hashCode() + ((this.b.hashCode() + (this.f37630a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        vvs vvsVar = vvs.f38117a;
        StringBuilder sb = new StringBuilder("SportResultHistoryEventCardUiModel(key=");
        sb.append(this.f37630a);
        sb.append(", cardResultHistory=");
        sb.append(this.b);
        sb.append(", gameType=");
        sb.append(vvsVar);
        sb.append(", alignmentInSection=");
        sb.append(this.c);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.d, Separators.RPAREN);
    }
}
