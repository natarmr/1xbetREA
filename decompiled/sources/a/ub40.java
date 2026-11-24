package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ub40 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35361a;
    public final ma40 b;

    public ub40(String str, ma40 ma40Var) {
        this.f35361a = str;
        this.b = ma40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub40)) {
            return false;
        }
        ub40 ub40Var = (ub40) obj;
        return this.f35361a.equals(ub40Var.f35361a) && this.b.equals(ub40Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f35361a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35361a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaHeroesHeroUiModel(key=" + this.f35361a + ", model=" + this.b + Separators.RPAREN;
    }
}
