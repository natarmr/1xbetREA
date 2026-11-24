package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r66 implements w66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f29920a;
    public final czm b;

    public r66(czm czmVar, czm czmVar2) {
        this.f29920a = czmVar;
        this.b = czmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r66)) {
            return false;
        }
        r66 r66Var = (r66) obj;
        return this.f29920a.equals(r66Var.f29920a) && this.b.equals(r66Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29920a.hashCode() * 31);
    }

    public final String toString() {
        return "MultiTeams(teamOne=" + this.f29920a + ", teamTwo=" + this.b + Separators.RPAREN;
    }
}
