package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ly0 implements ny0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zll f20841a;
    public final boolean b;
    public final boolean c;
    public final j8b d;

    public ly0(zll zllVar, boolean z, boolean z2, j8b j8bVar) {
        this.f20841a = zllVar;
        this.b = z;
        this.c = z2;
        this.d = j8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly0)) {
            return false;
        }
        ly0 ly0Var = (ly0) obj;
        return this.f20841a.equals(ly0Var.f20841a) && this.b == ly0Var.b && this.c == ly0Var.c && this.d.equals(ly0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(this.f20841a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "AggregatorGamesSearchUiModelAggregatorGamesSearch(item=" + this.f20841a + ", allClickAlwaysEnable=" + this.b + ", hasSectionVirtual=" + this.c + ", category=" + this.d + Separators.RPAREN;
    }
}
