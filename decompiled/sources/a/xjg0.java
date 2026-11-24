package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xjg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg0 f40984a;
    public final fkg0 b;
    public final fkg0 c;
    public final jkg0 d;

    public xjg0(fkg0 fkg0Var, fkg0 fkg0Var2, fkg0 fkg0Var3, jkg0 jkg0Var) {
        this.f40984a = fkg0Var;
        this.b = fkg0Var2;
        this.c = fkg0Var3;
        this.d = jkg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjg0)) {
            return false;
        }
        xjg0 xjg0Var = (xjg0) obj;
        return this.f40984a.equals(xjg0Var.f40984a) && this.b.equals(xjg0Var.b) && this.c.equals(xjg0Var.c) && this.d == xjg0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f40984a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RpsPlayersRoundsResultModel(firstPlayer=" + this.f40984a + ", secondPlayer=" + this.b + ", thirdPlayer=" + this.c + ", result=" + this.d + Separators.RPAREN;
    }
}
