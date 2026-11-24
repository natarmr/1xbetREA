package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class afa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f769a;
    public final tna0 b;
    public final tna0 c;
    public final boolean d;

    public afa(int i, tna0 tna0Var, tna0 tna0Var2, boolean z) {
        this.f769a = i;
        this.b = tna0Var;
        this.c = tna0Var2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afa)) {
            return false;
        }
        afa afaVar = (afa) obj;
        return this.f769a == afaVar.f769a && this.b.equals(afaVar.b) && this.c.equals(afaVar.c) && this.d == afaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f769a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CardCricketRoundModel(points=" + this.f769a + ", batsman=" + this.b + ", bowler=" + this.c + ", hasWickets=" + this.d + Separators.RPAREN;
    }
}
