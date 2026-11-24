package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x9p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40520a;
    public final lam b;

    public x9p0(String str, lam lamVar) {
        this.f40520a = str;
        this.b = lamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9p0)) {
            return false;
        }
        x9p0 x9p0Var = (x9p0) obj;
        return this.f40520a.equals(x9p0Var.f40520a) && this.b.equals(x9p0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f40520a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40520a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamDetailsRatingTableUiModel(key=" + this.f40520a + ", ratingTable=" + this.b + Separators.RPAREN;
    }
}
