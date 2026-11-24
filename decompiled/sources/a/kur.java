package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ww20 f18925a;
    public final j43 b;

    public kur(ww20 ww20Var, j43 j43Var) {
        this.f18925a = ww20Var;
        this.b = j43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kur)) {
            return false;
        }
        kur kurVar = (kur) obj;
        return this.f18925a.equals(kurVar.f18925a) && this.b.equals(kurVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18925a.f39867a.hashCode() * 31);
    }

    public final String toString() {
        return "GameCardStateModel(marketStateModel=" + this.f18925a + ", animatedCoefficientModel=" + this.b + Separators.RPAREN;
    }
}
