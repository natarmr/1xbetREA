package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t0z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdm0 f33143a;
    public final j9m0 b;

    public t0z(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.f33143a = zdm0Var;
        this.b = j9m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0z)) {
            return false;
        }
        t0z t0zVar = (t0z) obj;
        return this.f33143a.equals(t0zVar.f33143a) && this.b.equals(t0zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33143a.hashCode() * 31);
    }

    public final String toString() {
        return "LastGamesHeaderUiModel(statisticHeaderUiModel=" + this.f33143a + ", statisticBackgroundUiModel=" + this.b + Separators.RPAREN;
    }
}
