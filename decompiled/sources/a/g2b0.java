package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g2b0 implements j2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fza0 f10552a;
    public final long b;
    public final bml c;

    public g2b0(fza0 fza0Var, long j, bml bmlVar) {
        this.f10552a = fza0Var;
        this.b = j;
        this.c = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2b0)) {
            return false;
        }
        g2b0 g2b0Var = (g2b0) obj;
        return this.f10552a == g2b0Var.f10552a && this.b == g2b0Var.b && this.c.equals(g2b0Var.c);
    }

    @Override // a.j2b0
    public final String getKey() {
        tre0 tre0Var = sre0.f32672a;
        return ohs0.n(tre0Var.b(g2b0.class).J(), tre0Var.b(fza0.class).J());
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f10552a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "PopularClassicAggregatorGamesItemUiModel(popularCategory=" + this.f10552a + ", partitionId=" + this.b + ", gameCardCollectionUiModel=" + this.c + Separators.RPAREN;
    }
}
