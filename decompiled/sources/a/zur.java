package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zur implements dvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmk0 f45021a;
    public final zmk0 b;

    public zur(zmk0 zmk0Var, zmk0 zmk0Var2) {
        this.f45021a = zmk0Var;
        this.b = zmk0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zur)) {
            return false;
        }
        zur zurVar = (zur) obj;
        return this.f45021a.equals(zurVar.f45021a) && this.b.equals(zurVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f45021a.hashCode() * 31);
    }

    public final String toString() {
        return "ScoreTotal(firstTeam=" + this.f45021a + ", secondTeam=" + this.b + Separators.RPAREN;
    }
}
