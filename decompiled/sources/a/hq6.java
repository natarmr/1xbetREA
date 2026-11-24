package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hq6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9a0 f13471a;
    public final d9a0 b;
    public final pba c;

    public hq6(d9a0 d9a0Var, d9a0 d9a0Var2, pba pbaVar) {
        this.f13471a = d9a0Var;
        this.b = d9a0Var2;
        this.c = pbaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq6)) {
            return false;
        }
        hq6 hq6Var = (hq6) obj;
        return this.f13471a.equals(hq6Var.f13471a) && this.b.equals(hq6Var.b) && this.c.equals(hq6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f13471a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BetConstructorGameUiModel(firstPlayer=" + this.f13471a + ", secondPlayer=" + this.b + ", cardUiModel=" + this.c + Separators.RPAREN;
    }
}
