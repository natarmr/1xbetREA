package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a550 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f253a;
    public final lq5 b;
    public final ypl c;
    public final pt0 d;

    public a550(int i, lq5 lq5Var, ypl yplVar, pt0 pt0Var) {
        this.f253a = i;
        this.b = lq5Var;
        this.c = yplVar;
        this.d = pt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a550)) {
            return false;
        }
        a550 a550Var = (a550) obj;
        return this.f253a == a550Var.f253a && this.b.equals(a550Var.b) && this.c == a550Var.c && this.d == a550Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f253a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MyAggregatorOldStylesStateModel(accountSelectionStyle=" + this.f253a + ", bannerCollectionStyle=" + this.b + ", tournamentCardsCollectionStyle=" + this.c + ", gamesStyle=" + this.d + Separators.RPAREN;
    }
}
