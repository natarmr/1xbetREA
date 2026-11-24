package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mza0 implements oza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fza0 f22644a;
    public final long b;
    public final jjm c;
    public final bml d;

    public mza0(fza0 fza0Var, long j, jjm jjmVar, bml bmlVar) {
        this.f22644a = fza0Var;
        this.b = j;
        this.c = jjmVar;
        this.d = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mza0)) {
            return false;
        }
        mza0 mza0Var = (mza0) obj;
        return this.f22644a == mza0Var.f22644a && this.b == mza0Var.b && this.c.equals(mza0Var.c) && this.d.equals(mza0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f22644a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "PopularAggregatorGamesItemUiModel(popularCategory=" + this.f22644a + ", partitionId=" + this.b + ", dsHeaderModel=" + this.c + ", gameCardCollectionUiModel=" + this.d + Separators.RPAREN;
    }
}
