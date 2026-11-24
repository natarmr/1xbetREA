package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l0p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19213a;
    public final jjm b;

    public l0p0(String str, jjm jjmVar) {
        this.f19213a = str;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0p0)) {
            return false;
        }
        l0p0 l0p0Var = (l0p0) obj;
        return this.f19213a.equals(l0p0Var.f19213a) && this.b.equals(l0p0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f19213a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19213a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamBetHeaderUiItem(key=" + this.f19213a + ", model=" + this.b + Separators.RPAREN;
    }
}
