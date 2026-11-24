package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a460 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjm f209a;
    public final j460 b;

    public a460(jjm jjmVar, j460 j460Var) {
        this.f209a = jjmVar;
        this.b = j460Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a460)) {
            return false;
        }
        a460 a460Var = (a460) obj;
        return this.f209a.equals(a460Var.f209a) && this.b.equals(a460Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f209a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f209a.hashCode() * 31);
    }

    public final String toString() {
        return "NoTabsHeaderUiItem(model=" + this.f209a + ", groupHeader=" + this.b + Separators.RPAREN;
    }
}
